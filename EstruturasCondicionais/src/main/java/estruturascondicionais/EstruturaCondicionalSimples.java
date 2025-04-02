package estruturascondicionais;

import java.util.Scanner;

public class EstruturaCondicionalSimples {
    public static void main(String[] args) {
        Scanner gui = new Scanner(System.in);
        System.out.println("Digite sua primeira nota da prova\n logo em seguida a segunda nota");
        System.out.println("Primeira nota: ");
        float n1 = gui.nextFloat();

        System.out.println("Segunda nota: ");
        float n2 = gui.nextFloat();

        float m = (n1 + n2) / 2; 
        System.out.format("sua media é %.2f \n", m);

        if (m > 60){
            System.out.print("Parabens man slk");
        }
        
    }
}
