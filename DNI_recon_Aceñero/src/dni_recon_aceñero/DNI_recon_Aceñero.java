//author: josep garcia aceñero
package DNI_recon_Aceñero;
//imports
import java.util.Scanner;

public class DNI_recon_Aceñero {
    //global declaration
    static Scanner keyboard=new Scanner(System.in);

    public static void main(String[] args) {
        //varaibles
        int dni;
        char letter;
        // DNI ask
        System.out.print("Input DNI numbers: ");
        dni = keyboard.nextInt();
        letter = DNIletterRecon(dni);
        System.out.println(dni+":"+letter);
       
       
    }
    //funcion que recibe DNI y devuelve la letra
    private static char DNIletterRecon(int DNIrecon){
        //variables
        char letterrecon='T';
        int res;
        String letters="TRWAGMYFPDXBNJZSQVHLCKE";
        //operation recon
        res=DNIrecon%23;
        letterrecon = letters.charAt(res);
        return letterrecon;
       
    }
   
}

