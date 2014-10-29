import java.util.Scanner;

/**
 *
 * @author Regina
 */
public class Rechner {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) 
    {
        
        double a,b = 0;
        double ausgabe;
        ausgabe = 0.00;
        char rechenstop;
        Scanner s =new Scanner(System.in);
        System.out .print ("Geben sie Zahl 1 ein");
        a=s.nextInt();

        System.out.print("Geben sie den Rechenoperator ein: ");
        char rechenop;
        rechenop = s.next().charAt(0);
        System.out .print ("Geben sie Zahl 2 ein");
        b=s.nextInt();
        System.out.println();
        
        
        switch(rechenop)
        {
         case '+':
            ausgabe = a+b;
            System.out.print("Das Ergebnis lautet: " +ausgabe);
            break;
        case '-':
            ausgabe = a-b;
            System.out.print("Das Ergebnis lautet: " +ausgabe);
            break;
        case '*':
            ausgabe = a*b;
            System.out.print("Das Ergebnis lautet: " +ausgabe);
            break;
        case '/':
            ausgabe = a/b;
            System.out.print("Das Ergebnis lautet: " +ausgabe);
            break;
        default:
            System.out.print("Falsche Eingabe");
            break;
        }
        
            
            
        }
  
        
      
    }
    

