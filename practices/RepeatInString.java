import java.util.Scanner;
class RepeatInString{
    public static void main(String[] args){
    
    Scanner scanner = new Scanner(System.in);

    String firstString = scanner.next();
    String secondString = scanner.next();
    int p = 1;
    int spilt = secondString.length();

    for(int i = 0 ; i < firstString.length() ; i++){
       String text =  firstString.substring(i,spilt++);

            System.out.println(text + "==>" + secondString);

        if(text.equals(secondString)){
            ++p;
        }
    if(spilt >firstString.length()){
        break;
    }
    }
    
    System.out.println(p-1);
    }
}