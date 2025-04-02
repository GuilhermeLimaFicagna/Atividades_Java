package operadoreslogicos;
public class OperadoresLogicos {
    public static void main(String[] args) {
        int x = 4;
        int y = 7;
        int z = 12;
        boolean r; 
        r = x<y ^ y>x ? true:false;
        System.out.println(r);
    }
}
