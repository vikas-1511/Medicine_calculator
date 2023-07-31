import java.util.*;

public class Currency_convertor {
    public static void main(String[]args){
        System.out.println("Welcome to currency convertor\nSelect One Option");
        System.out.println("1=INR-USD\n2=USD-INR");
        Scanner sc  = new Scanner(System.in);
        
        int button = sc.nextInt();
        
        switch(button){
            case 1: System.out.println("You have selected INR-USD:\nEnter the INR Value: ");
                    int a = sc.nextInt();
                    System.out.println("The USD is:"+a*0.012+"$");
            break;
            case 2: System.out.println("You have selected USD-INR:\nEnter the USD Value: ");
                    int b = sc.nextInt();
                    System.out.println("The INR is:"+b*82.32);
        }


    }
}