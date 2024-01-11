package basicComponentJLabel;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame006 {
	static int counter = 0;

	public MyFrame006() {
	    JFrame frame = new JFrame("JFrame");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(new Dimension(360, 200));
	    
	    JPanel panel = new JPanel();
	    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
	    
	    JButton counterButton = new JButton("눌러주세요!!");
	    counterButton.setPreferredSize(new Dimension(200,50));
	    counterButton.setMaximumSize(new Dimension(200,50));
	    counterButton.setAlignmentX(Component.CENTER_ALIGNMENT); 
	    
	    JLabel label = new JLabel("Count : " + counter);
	    label.setBorder(BorderFactory.createRaisedBevelBorder());
	    label.setPreferredSize(new Dimension(200,50));
	    label.setMaximumSize(new Dimension(170,70));
	    label.setHorizontalAlignment(JLabel.CENTER);
	    label.setVerticalAlignment(JLabel.CENTER);
	    label.setAlignmentX(Component.CENTER_ALIGNMENT); 
	    
	    counterButton.addActionListener(new ActionListener() {
	        private int counter = 0;

	        @Override
	        public void actionPerformed(ActionEvent e) {
	            label.setText("Count : " + ++counter);
	        }
	    });
	    
	    panel.add(counterButton);
	    panel.add(Box.createVerticalStrut(50)); 
	    panel.add(label);
	    
	    frame.getContentPane().add(panel);
	    
	    frame.setVisible(true);
	}
}

public class Pr06 {
	public static void main(String[] args) {
		new MyFrame006();
	}
}
