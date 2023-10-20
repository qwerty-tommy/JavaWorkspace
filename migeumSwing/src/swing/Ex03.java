package swing;

import java.awt.Dimension;
import java.awt.FlowLayout;
//import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;

class MyFrame03 extends JFrame {	//private·Î ¸ø¾¸?
	public MyFrame03() {
		Toolkit kit= Toolkit.getDefaultToolkit();
		Dimension screenSize=kit.getScreenSize();
		setResizable(false);
		setTitle("Ex03");
		setSize(300,200);
		setLocation(screenSize.width/2,screenSize.height/2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		setLayout(new FlowLayout());
		JButton button=new JButton(" ¹öÆ° ");
		this.add(button);
	}

}

public class Ex03 {

	public static void main(String[] args) {
		MyFrame03 f = new MyFrame03();
	}

}
