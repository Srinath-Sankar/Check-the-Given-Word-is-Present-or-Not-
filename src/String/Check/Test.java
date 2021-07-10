package String.Check;
import java.util.Scanner;
import java.lang.String;
public class Test {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the Whole Sentence:");
        String string1=scan.nextLine();
        System.out.print("Enter the Word to be checked:");
        String string2=scan.next();
        new Check().Present(string1,string2);
        }
}
    
    
