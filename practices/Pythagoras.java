import java.util.Scanner;
public class Pythagoras {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        boolean en ;
        if(num1 > num2 && num1 > num3){
            en = num1 * num1 == (num2 * num2) + (num3 * num3);

        } else if (num2 > num3 && num2 > num1) {
            en = num2 * num2 == (num1 * num1) + (num3 * num3);

        }else {
            en = num3 * num3 == (num2 * num2) + (num1 * num1);

        }

        if(en){
          System.out.println("YES");
      }else {
          System.out.println("NO");

      }
    }


}
