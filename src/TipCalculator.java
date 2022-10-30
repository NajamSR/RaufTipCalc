import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Hi! How many people are you having over?");
        System.out.println(" Please enter the number below.");
        int people = scan.nextInt(); // Records the amount of people there are
        System.out.print("Great to have you! How much tip do each of you plan on paying us?");
        System.out.println(" Please enter the amount below as a whole number percentage.");
        int tipPc = scan.nextInt(); // Records the tip as a whole number percentage
        System.out.print("Great! Now we just need you to enter the total amount you are paying for your meal, ");
        System.out.println("in dollars and cents, and we will calculate your total bill.");
        double bill = scan.nextDouble(); // Records the price of the meal, without tip, in dollars and cents
       
        
       
        double tipAsDec = tipPc / 100.0; // Converts the tip from percent form to decimal form
        double tipValue = tipAsDec * bill; // Calculates the total tip amount in dollars and cents
        double billPerPerson = bill / people; // Calculates how much each person will contribute to the bill not including tip
        double tipPerPerson =  billPerPerson * tipAsDec; // Calculates how much tip each person will pay
        double billWithTip = bill + tipValue; // Calculates the total amount of money the group will pay, including tip
        double totalPerPerson = billPerPerson + tipPerPerson; // Calculates the amount of money each person will pay, including tip
        


        System.out.println();
        System.out.println("Okay. Here is your final bill. ");
        System.out.format("After including the $%.2f", tipValue); // Outputs the total tip in dollars and cents
        System.out.format(" tip you offered us, your total bill comes out to $%.2f", billWithTip); // Outputs the total bill including tip
        System.out.format(". \nThis means each person in your group is paying $%.2f", totalPerPerson); // Outputs the total amount of money each person pays
        System.out.format(", including a $%.2f", tipPerPerson); // Outputs the amount of tip each person pays, in dollars and cents
        System.out.println(" tip paid by each person.");
    }
}
