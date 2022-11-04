import java.util.Scanner;
class Palindrome{

public static void main (String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("plese Enter Your Num >>?");

    int num = scanner.nextInt();

   
    int lastNum = num % 10;
    while(num > 10){
    num = num / 10;
    }

    String messgae = "";
    if(lastNum == num){
        messgae = "This Is PalinDrome";
    }else{
        messgae = "This Is NOT PalinDrome";
    }
    System.out.println(messgae);


}
}