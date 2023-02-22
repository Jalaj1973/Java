package oops.programs;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n, x;
        n = sc.nextInt();
        int sum = 0, rev = 0;
        x = n;
        while (n != 0) {
            rev = n % 10;
            sum = sum * 10 + rev;
            n /= 10;
        }
        if (sum == x && sum > 0) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

    }
}
