import java.util.Scanner;

public class Fibo {
    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);

        System.out.println("plese Enter Num Fibo ?");

        int num = scanner.nextInt();

        int fib = fibo(num);
        System.out.println(fib);

    }


    public static int fibo(int num){

        if(num <= 2){
            return 1;
        }

    return fibo(num-2) + fibo(num -1);
    }
}