import java.util.Scanner;
public class lala{  
Scanner sc = new Scanner(System.in);
    void loopeloop(){

        for(int i = 0; i < 5; i++){
            try{
                System.out.println("enter i");
                sc.next();
            }
            catch(NumberFormatException e){
                System.out.print("Something went wrong");
                return;
            }
            
        }
    }
    
    public static void main(String[] args) {
        lala loop = new lala();
        loop.loopeloop();
        System.out.print("woop");
    }
}