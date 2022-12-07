import java.util.Scanner;
import java.util.regex.*;

public class Output {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            sc.nextLine();

            System.out.printf("%1$-15s%2$03d \n",sc,x);
            //Complete this line
        }

        System.out.println("================================");



    }
}
