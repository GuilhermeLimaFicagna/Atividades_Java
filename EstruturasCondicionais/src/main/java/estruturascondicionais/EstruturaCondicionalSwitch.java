package estruturascondicionais;

import java.util.Scanner;

public class EstruturaCondicionalSwitch {
    public static void main(String[] args) {
        Scanner gui = new Scanner(System.in);
        System.out.print("Escolha um número e saiba o que você é:");
        int perna = gui.nextInt();
        String tipo;
        switch (perna) {
            case 1:
                System.out.println("Feio");
                break;
            case 2:
                System.out.println("Lindo");
                break;
            default:
                System.out.println("Sla");
                
        }
        
        
    }
}
