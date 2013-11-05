import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener.*;

public class t52b extends JFrame {
	
	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField Pass;
	
	public t52b(){
		super("the Tittle");
		setLayout(new FlowLayout());
		
		item1 = new JTextField(10);
		add(item1);
		
		item2 = new JTextField("Enter Text Here");
		add(item2);
		
		item3 = new JTextField("Uneditbale", 20);
		item3.setEditable(false);
		add(item3);
		
		Pass = new JPasswordField("MyPass");
		add(Pass);
		
		t52b.thehandler handler = new t52b.thehandler();
		item1.addActionListener(handler);
		item2.addActionListener(handler);
		item3.addActionListener(handler);
		Pass.addActionListener(handler);
		
	}
	
	private class thehandler implements ActionListener {
		
		public void actionPerformed(ActionEvent event) {
			
			String string = "";
			
			if(event.getSource() == item1) 
				string = String.format("field 1: %s", event.getActionCommand());
			else if (event.getSource() == item2)
				string = String.format("field 2: %s", event.getActionCommand());
			else if (event.getSource() == item3)
				string = String.format("field 3: %s", event.getActionCommand());
			else if (event.getSource() == Pass)
				string = String.format("Password : %s", event.getActionCommand());
			
			JOptionPane.showMessageDialog(null, string);
		}
	}
}