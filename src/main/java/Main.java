import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DispenseChain dispenseChain = new Euro50Dispenser();
        dispenseChain.setNextChain(new Euro20Dispenser());
        dispenseChain.setNextChain(new Euro10Dispenser());
        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
                return;
            }
            // process the request
            dispenseChain.dispense(new Currency(amount));
        }
    }
}
