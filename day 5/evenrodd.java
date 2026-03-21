import java.util.Scanner ;
public class evenrodd{
    public static int evenorodd(int n){
    if(n % 2 == 0){
         System.out.println("the number " + n+ " is even");

    }
    else{
        System.out.println(" the number " +n + " is odd");
    }
    return n;
    }
    
    
        public static void  main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println(" Enther the number :");
            int n = sc.nextInt();
            int result = evenorodd(n);
        }
    }
