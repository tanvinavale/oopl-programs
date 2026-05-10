import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter first number: ");
            int n1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int n2 = sc.nextInt();

            String ans;

            do {
                System.out.println("***** Calculator ******");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exit");

                System.out.print("What operation do you want to perform?(1/2/3/4/5): ");
                int choose = sc.nextInt();

                switch (choose) {
                    case 1:
                        System.out.println("The addition of the numbers is: " + (n1 + n2));
                        break;

                    case 2:
                        System.out.println("The subtraction of the numbers is: " + (n1 - n2));
                        break;

                    case 3:
                        System.out.println("The multiplication of the numbers is: " + (n1 * n2));
                        break;

                    case 4:
                        System.out.println("The division of the numbers is: " + (n1 / n2));
                        break;

                    case 5:
                        System.out.println("Calculator Closed!");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }

                System.out.print("Do you want to continue? (y/n): ");
                ans = sc.next();

            } while (ans.equals("y"));

        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } 
        catch (Exception e) {
            System.out.println("Invalid Input!");
        }

        System.out.println("Thank you for using calculator :-)");

        sc.close();
    }
}