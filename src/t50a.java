import javax.swing.JOptionPane;

public class t50a {
	public static void main(String[] args) {
		
		String fn = JOptionPane.showInputDialog("Please Enter First Numer:");
		String sn = JOptionPane.showInputDialog("Please Enter Second Numer:");
		
		int num1 = Integer.parseInt(fn);
		int num2 = Integer.parseInt(sn);
		int sum = num1 + num2;
		
		JOptionPane.showMessageDialog(null,"The anwser is " +sum, " The title is this", JOptionPane.PLAIN_MESSAGE);
		
	}
}
