import java.util.Scanner;
public class homeWork {


    public static void main(String[] args) {
        isOddOrEven(3);
        sumRang(5, 9);
        bonus(2, 6);
        taxes(500);


    }

    public static void isOddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println("Even");

        } else {
            System.out.println("Odd");
        }
    }

    public static void sumRang(int begin, int end) {
        int sum = 0;
        for (int i = begin; i <= end; i++) {
            sum = sum + i;


        }
        System.out.println(sum);
    }

    public static void bonus(int first, int last) {
        int sum1=0;
        for (int i = first; i <= last; i++) {
            if(i%2==0) {
                sum1 +=i;
            }
        }
        System.out.println(sum1);

    }

    public static void taxes(double salary) {
        double tax = 0;
        if(salary>1000){
            tax = salary*0.2;
        }
        else if (salary>500 && salary<1000) {
            tax = salary*0.1;
        }
        if (salary<500){
            tax=salary*0;
        }
        System.out.println(tax);

    }
}

