import java.util.Scanner;

class ATM
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int balance = 5000;
        int choice, amount;

        do
        {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            try
            {
                switch(choice)
                {
                    case 1:
                        System.out.println("Current Balance = Rs." + balance);
                        break;

                    case 2:
                        System.out.print("Enter Deposit Amount: ");
                        amount = sc.nextInt();

                        if(amount <= 0)
                        {
                            throw new IllegalArgumentException("Invalid Amount!");
                        }

                        balance = balance + amount;
                        System.out.println("Money Deposited Successfully");
                        System.out.println("Updated Balance = Rs." + balance);
                        break;

                    case 3:
                        System.out.print("Enter Withdraw Amount: ");
                        amount = sc.nextInt();

                        if(amount <= 0)
                        {
                            throw new IllegalArgumentException("Invalid Amount!");
                        }

                        if(amount > balance)
                        {
                            throw new ArithmeticException("Insufficient Funds!");
                        }

                        balance = balance - amount;
                        System.out.println("Money Withdrawn Successfully");
                        System.out.println("Updated Balance = Rs." + balance);
                        break;

                    case 4:
                        System.out.println("Thank You!");
                        break;

                    default:
                        throw new IllegalArgumentException("Invalid Choice!");
                }
            }

            catch(ArithmeticException e)
            {
                System.out.println(e.getMessage());
            }

            catch(IllegalArgumentException e)
            {
                System.out.println(e.getMessage());
            }

            finally
            {
                System.out.println("Transaction Completed");
            }

        } while(choice != 4);

        sc.close();
    }
}