import java.util.*;

class ATM_project {
    public static void main(String[] args) {
        int Pin = 1234;
        int balance = 15000;
        int AddAmount = 0;
        int TakeAmount = 0;

        String Name;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter  Your Pin Number");
        int PassWord = in.nextInt();
        if (PassWord == Pin) {
            System.out.println("Enter You Name");
            Name = in.next();
            System.out.println("Welcome  " + Name);

            while (true) {
                System.out.println("Press 1 to Check your Balance");
                System.out.println("Press 2 to add Amount");
                System.out.println("Press 3 toTake Amount");
                System.out.println("Press 4 toTake Recipt");
                System.out.println("Press 5 to EXIT");

                int opt=in.nextInt();
                switch (opt) {
                    case 1:
                        System.out.println("Your Current balance is" + balance);
                        break;
                    case 2:
                        System.err.println("How much amount did you want to ADD to your account");
                        AddAmount = in.nextInt();
                        System.out.println("Successfully Credited");
                        balance = AddAmount + balance;
                        break;
                    case 3:
                        System.out.println("How much amount did you want  to take");
                        TakeAmount = in.nextInt();
                        if (TakeAmount > balance) {
                            System.out.println("Your balance is insufficient");
                            System.out.println("Try less than your available balance");

                        } else {
                            System.out.println("Successfully Taken");
                            balance = balance - TakeAmount;

                        }
                        break;
                    case 4:
                        System.out.println("Welcome to All in One mini ATM");
                        System.out.println("Available balance is " + balance);
                        System.out.println("Amount deposited     " + AddAmount);
                        System.out.println("Amount Taken         " + TakeAmount);
                        System.out.println("Thanks for Coming    ");
                        break;
                    default:
                        System.out.println("Press the number below 5");
                        break;
                }
                if (opt == 5) {
                    System.out.println("Thanking you !");
                    break;
                }
            }
        } else {
            System.out.println("Wrong pin number :");
            System.err.println("Please enter a correct pin number :");

        }
    }
}