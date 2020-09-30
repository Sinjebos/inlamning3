import java.util.InputMismatchException;
import java.util.Scanner;

public class trycatch {
    Scanner sc = new Scanner(System.in);
    int input;


    void loopeloop() {
        for (int i = 0; i < 5; i++) {
            try {
                input = sc.nextInt();
                System.out.println("Enter [100]");
                if(input == 100){
                    System.out.println("yaay");
                }
            
            } catch (InputMismatchException e) {
                System.out.println("stopid! Crash reason: " + e);
                i = 5;
            }

        }
    }

    public static void main(String[] args) {
        trycatch loop = new trycatch();
        loop.loopeloop();
    }
}