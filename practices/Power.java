import java.util.Scanner;
class Power{
    public static void main(String[] args){
        int power = 1;
        int multiplication = 2;

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();


        while(multiplication < num){
        multiplication  = 2 * multiplication;
        power++;
        }
        String messgae = "";
        if(multiplication == num){
            messgae = "yeah this power Of 2 =>\n" + power;

        }else{
            messgae = "NoOOo Bro this is Not power Of 2";
        }

        System.out.println(messgae);


    }
}