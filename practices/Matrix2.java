import java.util.Scanner;
class Matrix2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int[][] arrays = new int[2][2];

        System.out.println("* first line up *");
        int firsUp = scanner.nextInt();
        arrays[0][0] = firsUp;

        System.out.println("* first line down *");
        int firsDown = scanner.nextInt();
        arrays[0][1] = firsDown;

        System.out.println("* second line up *");
        int secondUp = scanner.nextInt();
        arrays[1][0] = secondUp;


        System.out.println("* second line down *");
        int secondDown = scanner.nextInt();
        arrays[1][1] = secondDown;


      int num =   (firsUp * secondDown) - (firsDown *secondUp);

      System.out.println(num);
    }
}