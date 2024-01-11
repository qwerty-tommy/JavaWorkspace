package song_table;

import javax.swing.JFrame;

import song.SongTableMgr;

public class GUIMain {
    static SongTableMgr engine;
    public static void startGUI(SongTableMgr en) {
    	engine = en;
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
    	JFrame mainFrame = new JFrame("TableSelectionDemo");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        TablePanel newContentPane = new TablePanel();
        newContentPane.addComponentsToPane();
        mainFrame.getContentPane().add(newContentPane);

        //Display the window.
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

}
