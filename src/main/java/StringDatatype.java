import java.util.Scanner;
public class StringDatatype {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String myString1 = "hello";
        String myString2 = "java";


        String mystring3 = (myString1+myString2);
        System.out.println(mystring3.length());

        int get_val = myString1.compareTo(myString2);

        if (get_val < 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

        // capitalize first letter
        String output1 = myString1.substring(0, 1).toUpperCase() + myString1.substring(1);
        // capitalize first letter
        String output2 = myString2.substring(0, 1).toUpperCase() + myString2.substring(1);

// print the string
        System.out.println(output1);
// print the string
        System.out.println(output2);
//
    }
}
