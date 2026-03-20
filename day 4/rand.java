import java.util.Random;
public class main {
    public static void main (String []args) {
        Random rand = new Random();
        int a = 0;
        while ( a != 55) {
            a = rand.nextInt(100);
            System.out.println(a);
            
        } 

    }
}