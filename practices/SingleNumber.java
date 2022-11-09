import java.util.Scanner;
public class SingleNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextInt();
        long sum = setSum(number,0);

        System.out.println(sum);
    }
    public static long setSum(long num , long sum){
            sum = num % 10 + sum;
            num = num / 10;
            if(num + sum < 10) {
                return num + sum ;
            }
        return setSum(sum,num);

    }


}
