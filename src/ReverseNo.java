import java.util.*;
public class ReverseNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int no = sc.nextInt();
        //int no =1234;
        int rev=0;
        int rem;
        while (no!=0){
            rem = no%10;
            rev = rev*10+rem;
            no = no/10;
        }
        System.out.println(rev);
    }
}
