package comparacaostring;
public class ComparacaoString {
    public static void main(String[] args) {
        String nm1 = "guilherme";
        String nm2 = "guilherme";
        String nm3 = new String("guilherme");
        String res = nm1 == nm3 ? "Igual" : "Diferente";
        System.out.println(res);
    }
}
