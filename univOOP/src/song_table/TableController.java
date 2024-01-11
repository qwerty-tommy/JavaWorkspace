package song_table;

import java.awt.Dimension;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import song.Song;
import song.SongTableMgr;

public class TableController implements ListSelectionListener {
    SongTableMgr dataMgr;
    DefaultTableModel tableModel;
    JTable table;
    int selectedIndex = -1;
	void init() {
        dataMgr = GUIMain.engine;   // 구체 클래스 엔진 객체가 설정됨   	
    	tableModel = new DefaultTableModel(dataMgr.getColumnNames(), 0);
    	loadData("");
    	
    	table = new JTable(tableModel);
        ListSelectionModel rowSM = table.getSelectionModel();
        rowSM.addListSelectionListener(this);
        table.setPreferredScrollableViewportSize(new Dimension(500, 220));
        table.setFillsViewportHeight(true);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 
    }
    // 엔진에서 검색된 객체들을 테이블에 보여준다. kwd가 ""면 모두 출력
    void loadData(String kwd) {
    	List<?> result = dataMgr.search(kwd);
    	tableModel.setRowCount(0);
    	for (Object m : result)
    		tableModel.addRow(((Song)m).getUiTexts());
    }
    void addRow(String[] editTexts) {
		try {
			dataMgr.addNewItem(editTexts);
		} catch (Exception ex) {  // 추가 중 오류 발생
			ex.printStackTrace();
			JOptionPane.showMessageDialog(null, "추가 데이터 오류");
			return;
		}
		tableModel.addRow(editTexts);
    }
    // 현재 선택된 행을 엔진에서 삭제하고 테이블에서 삭제
    void removeRow() {
    	if (selectedIndex < 0) return;
    	String key = (String)tableModel.getValueAt(selectedIndex, 0);
    	dataMgr.remove(key);
    	tableModel.removeRow(selectedIndex);
    }
    // 현재 선택된 행을 편집창의 내용으로 수정
    void updateRow(String[] editTexts) {
    	if (selectedIndex < 0) return;
		try {
			dataMgr.update(editTexts); // 첫번째 요소로 검색
    	} catch (Exception ex) {  // 엔진에서 수정 중 오류 발생
			ex.printStackTrace();  
			JOptionPane.showMessageDialog(null, "수정 중 데이터 오류");
    		return;
    	}
    	for (int i = 0; i < editTexts.length; i++) {
    		tableModel.setValueAt(editTexts[i], selectedIndex, i);
    	}
    }
    // 선택된 행번호가 변경되면 그 내용을 편집창으로 보냄
    public void valueChanged(ListSelectionEvent e) {
        ListSelectionModel lsm = (ListSelectionModel)e.getSource();
        if (!lsm.isSelectionEmpty()) {
        	selectedIndex = lsm.getMinSelectionIndex();
        	String[] rowTexts = new String[tableModel.getColumnCount()];
        	for (int i = 0; i < rowTexts.length; i++)
        		rowTexts[i] = (String)tableModel.getValueAt(selectedIndex, i);
        	TablePanel.bottom.moveSelectedToEdits(rowTexts);
        }
    }
}