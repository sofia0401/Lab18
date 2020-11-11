package Task3;
import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        int n=10;
        int prev=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        prev=n;
        while (n!=0){
            n= sc.nextInt();
            if (prev<n) prev=n;
        }
        System.out.println(prev);
    }
}
