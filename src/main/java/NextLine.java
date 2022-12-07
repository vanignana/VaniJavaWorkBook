import java.util.Scanner;

public class NextLine {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

    Scanner scan = new Scanner("1 Hello world /2 I am a file /3 Read me until end-of-file");

    scan.useDelimiter("/");
         scan.tokens();
         //Printing the tokenized Strings
         while(scan.hasNext()){
         System.out.println(scan.next());
         }
         scan.close();
         }
         }

 /*====================== one more solution*/
// public class Solution {
//     public static void main(String []args)
//
//     {
//         Scanner sc = new Scanner(System.in);
//         int i=1;
//         while (sc.hasNext()) {
//             String s=sc.nextLine();
//             System.out.println(i + " " + s);
//             //System.out.println(sc.next());
//             i++;
//         }
//     }
// }