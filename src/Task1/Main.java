package Task1;
import java.util.Scanner;

public class Main {
    public static void func(int n, int count) {
        if (n / 2 <count) {
            System.out.println(n);
            return;
        }

        if (n % count == 0) {
            System.out.println(count);
            func(n /count,count);
        }
        else
            func(n, ++count);
    }

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        n= sc.nextInt();
        func(n,2);
    }
}


//Дано натуральное число n>1. Выведите все простые множители
// этого числа в порядке неубывания с учетом кратности. Алгоритм должен иметь сложность O(logn)