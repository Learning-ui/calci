import java.util.Scanner;

public class calci0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag = 1;
        
        while (flag != 0) {
            System.out.print("Enter number n1 and n2 (respectively): ");
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            
            System.out.print("Enter operation (+, -, *, /): ");
            char op = sc.next().charAt(0);
            
            System.out.print("Result: ");
            switch (op) {
                case '+':
                    System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
                    break;
                case '-':
                    System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
                    break;
                case '*':
                    System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
                    break;
                case '/':
                    if (n2 != 0) {
                        System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
                    } else {
                        System.out.println("Cannot divide by zero");
                    }
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
            
            System.out.print("If you want to stop, enter 0. Else, enter any other number: ");
            flag = sc.nextInt();
            System.out.println();
        }
        
        System.out.println("Thank you!");
        sc.close();
    }
}
