import java.util.Scanner ;
public class large {
    public static int largest(int a , int b , int c){
int max = a;
if (b > max){
    max = b;
}
 if (c > max){
    max = c ;    
}
return max ;


    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = largest (a, b, c);
        System.out.println("the largest number is :" + result);


    }
}