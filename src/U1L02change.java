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
print(“You have “ + nickels + “nickels and “ + pennies + “ pennies.”)
	int quarters = 0;
	int nickles = 0;
	int pennies = 0;
		
	String answer = JOptionPane.showInputDialog("Enter a monetary value: ");
	double cash = Double.parseDouble(answer);
	pennies = (int)(cash * 100);
	
	while (pennies >= 25) {
		pennies -= 25;
		quarters ++;
	}
	while (pennies >= 5) {
		pennies -= 5;
		nickles ++;
	}
	JOptionPane.showMessageDialog(null, cash + " is " + quaters +
	" quarters, " + nickles + " nickles, and " + pennies + " pennies.");*/
int quarters = 0;
int quarters2 = 0;
int dimes = 0;
int dimes2 = 0;
int nickles = 0;
int nickles2 = 0;
int pennies = 0;
int pennies2 = 0;
		
String answer = JOptionPane.showInputDialog("Enter an amount of cents: ");
double change1 = Double.parseDouble(answer);
pennies = (int)(change1);

String answer2 = JOptionPane.showInputDialog("Enter another amount of cents: ");
double change2 = Double.parseDouble(answer2);
pennies2 = (int)(change2);

JOptionPane.showMessageDialog(null, "The average of your two values is " + (pennies+pennies2)/2);

quarters = (pennies/25);
pennies = pennies%25;
dimes = pennies/10;
pennies = pennies%10;
nickles = pennies/5;
pennies = pennies%5;

quarters2 = (pennies2/25);
pennies2 = pennies2%25;
dimes2 = pennies2/10;
pennies2 = pennies2%10;
nickles2 = pennies2/5;
pennies2 = pennies2%5;

JOptionPane.showMessageDialog(null, "Your first amount has " + quarters + " quaters, " + dimes + " dimes, "
		+ nickles + " nickles, and " + pennies + " pennies.");
JOptionPane.showMessageDialog(null, "Your second amount has " + quarters2 + " quaters, " + dimes2 + " dimes, "
		+ nickles2 + " nickles, and " + pennies2 + " pennies.");

	}

}
