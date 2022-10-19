import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Hi! How many people are you having over?");
        System.out.println(" Please enter the number below.");
        int people = scan.nextInt();
        System.out.print("Great to have you! How much tip do each of you plan on paying us?");
        System.out.println("Please enter the amount below as a whole number percentage.");
        int tipPc = scan.nextInt();
        System.out.print("Great! Now we just need you to enter the total amount you are paying for your meal, ");
        System.out.println("in dollars and cents, and we will calculate your total bill.");
        double bill = scan.nextDouble();

        double billPerPerson = bill/people;
        double tipPerPerson = billPerPerson * tipPc/100.0;

        System.out.println();
        System.out.println("Okay. Here is your final bill.");
        System.out.println("Your total bill not including tip is $" + bill + ".");
        System.out.print("But after including the $" + (tipPc/100.0 * bill) + " tip you offered us, ");
        System.out.println("your total bill comes out to $" + (bill * (1 + tipPc / 100.0)) + ".");
        System.out.print("This means each person in your group is paying $" + (billPerPerson + tipPerPerson));
        System.out.println(", including a $" + tipPerPerson + " tip paid by each person.");

    }
}
