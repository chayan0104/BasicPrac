import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the limit");
        int no = sc.nextInt();

        int a =0,b=1;
        int c;
        System.out.print(a+" "+b);

        for(int i =1;i<=no;i++){
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
}
