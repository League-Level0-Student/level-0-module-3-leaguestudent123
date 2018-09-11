import javax.swing.JOptionPane;

public class numbers {
public static void main(String[] args) {
	String a=JOptionPane.showInputDialog(null,"enter a number");
	int b =Integer.parseInt(a);
	
	String c=JOptionPane.showInputDialog(null,"enter a number");
	
	int d =Integer.parseInt(c);
	
String e=JOptionPane.showInputDialog(null,"enter a number");
	
	int f =Integer.parseInt(e);
	
	
	if (b>d && b>f) {
		if (d>f) {
			JOptionPane.showMessageDialog(null,""+ b+ " "+ d +" " +f );
		}
		else {
			JOptionPane.showMessageDialog(null,""+ b+ " "+ f +" "+d );
		}
	}
	
	if (d>b && d>f) {
		if (b>f) {
			JOptionPane.showMessageDialog(null,""+ d+ " "+ b+" "+f);
		}else {
			JOptionPane.showMessageDialog(null,""+ d+ " "+ f+" "+b );
		}
	}
	if (f>d && f>b) {
		if (b>d) {
			JOptionPane.showMessageDialog(null,""+ f+ " "+ b+" "+d);
		}
		else {
			JOptionPane.showMessageDialog(null,""+ f+ " "+ d+" "+b);

		}
	}
	
	
	
	
	
	
	
	
	

	}
	
}









