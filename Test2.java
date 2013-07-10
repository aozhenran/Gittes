package Test22;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Test2 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JButton btn_ok = null;
	private JTextField jf1 = null;
	public Test2() {
		initUI();
	}

	private void initUI(){
		this.setTitle("·®ÁÐÁúÐ¡×é");
		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout());
		
		btn_ok =new JButton("ok");
		jf1 = new JTextField();
		this.getContentPane().add(btn_ok);
		this.getContentPane().add(jf1);
		jf1.setPreferredSize(new Dimension(200,30));
	}

	/**
	 * @param test
	 */
	public static void main(String[] args) {
		Test2 t=new Test2();
		t.setVisible(true);
	}
}
