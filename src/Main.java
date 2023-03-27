import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please input an integer between 4 & 10:  ");
        int n = scan.nextInt();

        ArrayList<Integer> numbers = new ArrayList<Integer>();


        if (n >= 4 && n <= 10) {

            System.out.println("There will be" );
            System.out.println(n);
            System.out.println("integers in this array.");
            

        } else {

            System.out.println("this is not within the parameters bozo!!!!!!!");
        }




    }
}