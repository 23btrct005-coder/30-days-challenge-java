import java.util.Scanner;
public class main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a and b :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;
         System.out.println(" Addition of two numbers is :" + sum);
         System.out.println("Subraction of two numbers is :" + sub);
         System.out.println("Multiplication of two numbers is :" + mul);
         System.out.println("Division of two numbers is :" + div);
         System.out.println("Modulus of two numbers is :" + mod);
    }
}