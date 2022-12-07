import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no: ");
        int no =sc.nextInt();
        int temp = 0;
        for(int i =2;i<=no;i++){
            if(no%i==0){
                temp=temp+1;
            }
        }
        if(temp==0){
            System.out.println(no+" prime no");
    }
        else{
            System.out.println(no+" not a prime no");
        }
    }
}
