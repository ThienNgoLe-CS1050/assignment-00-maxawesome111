package package002;
import javax.swing.JOptionPane;

public class Assignment002{
	public static void main(String[] arg) {
		String firstName, lastName;
		char middleInitial;
		int age;
		double grossAnnualPay, taxRate, netAnnualPay;
		
		firstName = JOptionPane.showInputDialog(null, "First name?");
		
		lastName = JOptionPane.showInputDialog(null, "Last name?");
		
		middleInitial = JOptionPane.showInputDialog(null, "Middle initial?").charAt(0);
		
		age = Integer.parseInt(JOptionPane.showInputDialog(null, "Age?"));
		
		grossAnnualPay = Double.parseDouble(JOptionPane.showInputDialog(null, "Your gross annual pay?"));
		
		taxRate = Double.parseDouble(JOptionPane.showInputDialog(null, "Your tax rate?"));
		
		netAnnualPay = grossAnnualPay - grossAnnualPay * taxRate;
		
		System.out.print("Hello " + firstName + " " + middleInitial + " " + lastName
									+"\nYou are " + age + " years old"
									+"\nIt is amazing that you made $" + grossAnnualPay + " this year"
									+"\nWith the tax rate of " + taxRate * 100 + "%, you get to take home $" + netAnnualPay);
		
		System.exit(0);
	}
}
