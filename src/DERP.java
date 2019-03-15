import javax.swing.JOptionPane;

public class DERP {
	public static void main(String[] args) {
		JOptionPane.showConfirmDialog(null,"DIS IS LE MATH VIRUS");
		for(int i = 0;i>-1;i++) {
			String X = JOptionPane.showInputDialog("Using mental math, 10001^2 - 9999^2 = ?");
			if(X.equals("40000"))	{
				JOptionPane.showConfirmDialog(null, "WOW,U R LEGALLY ALLOWED TO LEAVE NOW");
				break;
			}
			else {
				JOptionPane.showConfirmDialog(null, "Nope, try again");
			}
		}
		JOptionPane.showConfirmDialog(null, "OR MAYBE NOT! SEC PROB INCOMING!");
		for(int i = 0;i>-1;i++) {
			String X = JOptionPane.showInputDialog("6 = x^2 + 6x + 3      x = ?");
			if(X.equals("-3"))	{
				JOptionPane.showConfirmDialog(null, "U CAN LEAVE NOW");
				break;
			}
			else {
				JOptionPane.showConfirmDialog(null, "Nope");
			}
		}
	}
}
