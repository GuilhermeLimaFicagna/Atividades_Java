package Estruturas;

import java.util.Scanner;

public class EstruturasWhile {
    public static void main(String[] args) {
        Scanner gui = new Scanner(System.in);
        String senha = "gatinho123";
        String res = "";
        while (!senha.equals(res)){
            System.out.print("Digite a senha certa: ");
            res = gui.nextLine();
            if (!res.equals(senha)) {
                System.out.println("Senha incorreta");
            } else {
                System.out.println("Senha Correta");
            }
        }
    }
}
