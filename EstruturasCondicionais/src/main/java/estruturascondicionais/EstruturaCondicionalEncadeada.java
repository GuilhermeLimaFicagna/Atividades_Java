package estruturascondicionais;

import java.util.Scanner;

public class EstruturaCondicionalEncadeada {
    public static void main(String[] args) {
        Scanner gui = new Scanner(System.in);
        System.out.print("Anos de nascimento: ");
        int id = gui.nextInt();
        int i =  2015 - id;
        if (i < 16){
            System.out.println("Não vota");
        } else { 
            if ((i >= 16 && id < 18) || (i > 70)){
                System.out.println("Opcional");
            } else {
                System.out.println("Voto obrigatório");
            }
        }
    }
}
