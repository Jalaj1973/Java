package oops;

import java.util.Scanner;

public class o1 {
    float a, b, c, d, e, avg = 0;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter math marks");
        a = sc.nextFloat();
        System.out.println("enter sci marks");
        b = sc.nextFloat();
        System.out.println("enter sst marks");
        c = sc.nextFloat();
        System.out.println("enter gk marks");
        d = sc.nextFloat();
        System.out.println("enter evs marks");
        e = sc.nextFloat();

    }
    float compute(){
        avg=(a+b+c+d+e)/5;
        return avg;
    }
    void display(){
        if(avg>81){
            System.out.println(" Grade A : Average = " + avg);
        }
        else if(avg>61||a<=80){
            System.out.println(" Grade B : Average = " + avg);
        }
        else if(avg>41||a<=60){
            System.out.println(" Grade C : Average = " + avg);
        }
       else{
            System.out.println(" Grade D : Average = " + avg);
        }
    }

    public static void main(String[] args) {
        o1 obj = new o1();
        obj.input();
        obj.compute();
        obj.display();

    }

}
