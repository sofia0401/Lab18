package Task2;
import java.util.Scanner;

public class Palindrome {
    static void func(String s) {
        String a=null;
        int length=s.length()-1;
        if (length>1) {
            if (s.charAt(length) == s.charAt(0))
                func(s.substring(1, length));
            else
            {
                a="NO";
                System.out.println(a);
            }
        }
        else {
            a = "YES";
            System.out.println(a);
        }
    }
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        s=sc.next();

        func(s);
    }
}
