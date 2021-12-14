import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n ;
        int fNumber = 0,sNumber = 1,sum ;

        System.out.println("Serinin eleman sayısını giriniz :");
        n = input.nextInt();

        for(int i = 0; i<=n;i++){

           sum = fNumber + sNumber;
            System.out.print(sum + " ");

            fNumber = sNumber;
            sNumber = sum;

        }
    }
}
