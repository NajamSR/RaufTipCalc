import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Hi! How many people are you having over?");
        System.out.println(" Please enter the number below.");
        int people = scan.nextInt();
        System.out.print("Great to have you! How much tip do each of you plan on paying us?");
        System.out.println(" Please enter the amount below as a whole number percentage.");
        int tipPc = scan.nextInt();
        System.out.print("Great! Now we just need you to enter the total amount you are paying for your meal, ");
        System.out.println("in dollars and cents, and we will calculate your total bill.");
        double bill = scan.nextDouble();
        System.out.println(bill);
        double tipAsDec = tipPc / 100.0;
        System.out.println(tipAsDec);
        double tipValue = tipAsDec * bill;
        System.out.println();
        double billPerPerson = bill / people;
        System.out.println();
        double tipPerPerson =  billPerPerson * tipAsDec;
        System.out.println();
        double billWithTip = bill + tipValue;
        System.out.println();
        double totalPerPerson = billPerPerson + tipPerPerson;
        System.out.println();


        System.out.println();
        System.out.println("Okay. Here is your final bill. ");
        System.out.format("After including the $%.2f", tipValue);
        System.out.format(" tip you offered us, your total bill comes out to $%.2f", billWithTip);
        System.out.format(". \nThis means each person in your group is paying $%.2f", totalPerPerson);
        System.out.format(", including a $%.2f", tipPerPerson);
        System.out.println(" tip paid by each person.");
    }
}
