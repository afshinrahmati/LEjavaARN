import java.util.Scanner;
class Factorial {
    public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);


    int numberFac = scanner.nextInt();
    int num = 1;
    for(int i = 0 ; i < numberFac ; i++) {
        num = num * (i+1);
    }
    System.out.println(num);

    }
}