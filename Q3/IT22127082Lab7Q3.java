
import java.util.Scanner;

public class IT22127082Lab7Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        for (int customer = 1; customer <= 5; customer++) {

            System.out.println("\nCustomer " + customer);

            System.out.print("Enter total bill amount: ");
            double bill = input.nextDouble();

            System.out.print("Enter mode of payment (C/O): ");
            char payment = input.next().charAt(0);

            if (payment == 'C' || payment == 'c') {

                double discount = bill * 0.05;
                double amountToPay = bill - discount;

                System.out.println("Discount: " + discount);
                System.out.println("Amount to be paid: " + amountToPay);

            } else if (payment == 'O' || payment == 'o') {

                System.out.println("Discount: 0.0");
                System.out.println("Amount to be paid: " + bill);

            } else {

                System.out.println("Payment Mode is Not Valid");
            }
        }

        input.close();
    }
}
