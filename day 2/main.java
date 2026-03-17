import java.util.Scanner ;
public class Studentinfo {
    public static void main (String [] args){
Scanner src = new Scanner(System.in);
System.out.print ("Enter Name :");
String name = src.nextLine();
System.out.print ("Enter Age :");
int age = src.nextInt();
System.out.print("Enter Gender :");
char gender = src.next().charAt(0);
System.out.print("Enter CGPA :");
Double CGPA = src.nextDouble();
System.out.print("Enter pass/fail :");
boolean result = src.nextBoolean();
System.out.print("Enter Height :");
float height = src.nextFloat();
System.out.print("Enter Phone number :");
long phone = src.nextLong();
    }
}