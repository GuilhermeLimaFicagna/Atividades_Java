package tiposprimitivos;
import java.util.Scanner;
public class TiposPrimitivos {
    public static void main(String[] args) {
        Scanner gui = new Scanner(System.in);
        System.out.print("Qual seu nome: ");  
        String n1 = gui.nextLine();
        float n2 = 1.5f + 1.5f;
       
        System.out.format("A nota do %s é: %.2f", n1, n2);
        
    }
}
