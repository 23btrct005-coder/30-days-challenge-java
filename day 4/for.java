import java.util.Scanner;
public class main {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no upto where to print :");
        int n = sc.nextInt();
        for (int i =1 ;i <= n ; i++) {
            System.out.println(i);
        }
    }
}