import java.util.Scanner;

public class tenta {
    static Scanner sc = new Scanner(System.in);

    public static void tentaquestion(){
        System.out.println("Which of these are correct: ");
        System.out.println("[1] for(int i = 0 i < 10; i++");
        System.out.println("[2] for int i; i < 10; i++");
        System.out.println("[3] for (int i = 0; i < 10; i++");
        System.out.println("[4] for (int i = 0; i < 10; i+");

        switch(sc.next()){
            case "1":
            System.out.println("Sadly wrong answer");
            break;
            case "2":
            System.out.println("oof wrong answer");
            break;
            case "3":
            System.out.println("Correct well done!");
            break;
            case "4":
            System.out.println("noo wrong answer");
            break;
            default:
            System.out.println("invalid answer, input 1-4");
            break;
        }
    }
    public static void main(String[] args) {
        tentaquestion();
    }
}
