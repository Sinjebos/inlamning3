import java.util.Scanner;
public class tenta {
    static boolean tent = true;
    static boolean skip = true;
    static Scanner sc = new Scanner(System.in);

    public static void options1(){
        System.out.println("Which of these are correct: ");
        System.out.println("[1] for(int i = 0 i < 10; i++)");
        System.out.println("[2] for int i; i < 10; i++");
        System.out.println("[3] for(int i = 0; i < 10; i++)");
        System.out.println("[4] for (int i = 0; i < 10; i+)");
        System.out.println("[5] skip to next question");
    }
    public static void options2(){
        System.out.println("Which of these are correct: ");
        System.out.println("[1] ArrayList String x = new ArrayList(); ");
        System.out.println("[2] ArrayList<String> x = new ArrayList<>(); ");
        System.out.println("[3] ArrayList String = new ArrayList<>(); ");
        System.out.println("[4] ArrayList String x = new Arraylist<>;");
    }

    public static void switch1(){
        options1();
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
            case "5":
            switch2();
            skip = false;
            break;
            default:
            System.out.println("invalid answer, input 1-4");
            break;

        }

    }
    public static void switch2(){
        options2();
        switch(sc.next()){
            case "1":
            System.out.println("oof so close but wrong! ");
            break;
            case "2":
            System.out.println("Yay good job! nailed it!");
            break;
            case "3":
            System.out.println("Wrong answer!");
            break;
            case "4": 
            System.out.println("nono wrong answer");
            break;
            default:
            System.out.println("input 1");
            break;
        }
    }



    public static void questions(){
        switch1();
        if(skip){
        switch2();
        }
        else{
            System.out.println("closing test");
        }

        }
    public static void main(String[] args) {
            questions(); 
            
       }
}
