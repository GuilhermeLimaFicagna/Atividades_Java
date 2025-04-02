package estruturascondicionais;

import java.util.Scanner;

public class EstrururaCondicionalComposta {
    public static void main(String[] args) {
        Scanner gui = new Scanner(System.in);
        System.out.println("Qual sua idade: ");
        int id = gui.nextInt();
        if (id < 18){
            System.out.println("Menor de idade");
        } else {
            System.out.println("Maior de idade");
        }
        
    }
}
