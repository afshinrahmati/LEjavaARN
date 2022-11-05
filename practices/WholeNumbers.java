import java.util.Scanner;
class WholeNumbers{
    public static void main(String[] args){
        int num = 2;

        Scanner scanner = new Scanner(System.in);
        int isIt = scanner.nextInt();
        String messgae = "";

      for(int i = 0 ; i < 100 ; i++){

        int firstPower = (i+1) - 1;
        double multiFirstPower = Math.pow(num, firstPower);
        int multiSecond = (i +1);
        double multiSeconPower = Math.pow(num, multiSecond);

        double t = multiFirstPower * (multiSeconPower-1);
        if(t == isIt){
            messgae = "YES";
            break;
        }else{
            messgae = "NO";
        }

      }      
        System.out.println(messgae);


    }
}