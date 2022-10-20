import java.util.Scanner;

public class TipCalculator {

    public static String decimalFormatter(double value) {
        if (value % 0.1 == 0) {
          return (value + "0");
        } else {
          return (Math.round(value * 100)/100.0) + "";
        }
    }
  
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

      
        double billPerPerson = bill / people;
        double tipPerPerson =  (billPerPerson * tipPc/100.0);

      
        System.out.println();
        System.out.print("Okay. Here is your final bill. \nAfter including the $");
        System.out.print(decimalFormatter(tipPc/100.0 * bill));
        System.out.print(" tip you offered us, your total bill comes out to $");
        System.out.print(decimalFormatter(bill * (1 + tipPc / 100.0)));
        System.out.print(". \nThis means each person in your group is paying $");
        System.out.print(decimalFormatter(billPerPerson + tipPerPerson));
        System.out.print(", including a $");
        System.out.print(decimalFormatter(tipPerPerson));
        System.out.println(" tip paid by each person.");
    }
}
