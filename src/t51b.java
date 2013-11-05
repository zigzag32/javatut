import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class t51b extends JFrame {
	
	private JLabel item1;
	
	public t51b() {
		super("This is the Title Bar!");
		setLayout(new FlowLayout());
		
		item1 = new JLabel("This is a sentance output");
		item1.setToolTipText("This is a hover opject!");
		add(item1);
		
	}
}
