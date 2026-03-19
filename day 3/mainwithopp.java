import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number :");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number :");
        int b = sc.nextInt();
        System.out.println("Enter the operator +,-,*,/,% :");
        char oper = sc.next().charAt(0);
        int sum = a + b ;
        int sub = a - b ;
        int mul = a * b ;
        int div = a / b ;
        int mod = a % b ;
        if (oper == '+') {
            System.out.println(" Sum of two numbers is :" +sum);
        }
            else if( oper == '-') {
                System.out.println("Diffrence of two numbers is :" +sub);
            }
            else if (oper == '*'){
                System.out.println("Multiplication of two numbers is :" +mul);
            }
            else if (oper == '/') {
                System.out.println("Division of two numbers is :" +div);
            }
            else if ( oper == '%' ) {
                System.out.println("Remainder of two numbers is :" +mod);
            }

            }
        }
    
