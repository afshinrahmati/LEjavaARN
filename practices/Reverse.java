import java.util.Scanner;
class Reverse {
    public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);
    int firstNum = scanner.nextInt();
    int secondNum = scanner.nextInt();

    String y = reverse(firstNum);
    String x = reverse(secondNum);
    String messgae = "";
if(Integer.parseInt(y) > Integer.parseInt(x)){
    messgae = firstNum + " > "+  secondNum;

}else if(Integer.parseInt(y) < Integer.parseInt(x)){
        messgae = firstNum + " < "+ secondNum;

}else{
    messgae = firstNum +" = "+  secondNum;

}
    System.out.println(messgae);

    }

    public static String reverse(int num1){
    
    int a = num1 % 10;
    num1 = num1 / 10;

    int b = num1 % 10;

    num1 = num1 / 10;

    int c = num1 ;

    String n = a  + "" + b + "" + c;
    return n;
    }
}