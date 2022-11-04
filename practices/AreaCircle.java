import java.util.Scanner;
class AreaCircle{
    public static void main(String[] args){
    System.out.println("ENTER r");

    Scanner scanner = new Scanner(System.in);

    int r = scanner.nextInt();

    double area = (r * r) * 3.14;

    System.out.println(area);
        
    }
}