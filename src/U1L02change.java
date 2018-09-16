import javax.swing.JOptionPane;

public class U1L02change {

	public static void main(String[] args) {
	
/*Take input and convert to int: “How much cash do you have?”
Multiply by 100
Set nickels = 0
Set pennies = 0
while cash > 5:
cash = cash - 5
nickels += nickels
while cash > 0:
pennies = cash
print(“You have “ + nickels + “nickels and “ + pennies + “ pennies.”)*/
	int quaters = 0;
	int nickles = 0;
	int pennies = 0;
		
	String answer = JOptionPane.showInputDialog("Enter a monetary value: ");
	double cash = Double.parseDouble(answer);
	pennies = (int)(cash * 100);
	
	while (pennies >= 25) {
		pennies -= 25;
		quaters ++;
	}
	while (pennies >= 5) {
		pennies -= 5;
		nickles ++;
	}
	JOptionPane.showMessageDialog(null, cash + " is " + quaters +
	" quaters, " + nickles + " nickles, and " + pennies + " pennies.");
	}

}
