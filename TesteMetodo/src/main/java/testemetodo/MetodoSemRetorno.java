package testemetodo;
public class MetodoSemRetorno {

    static void soma(int a, int b){
        int s = a + b;
        System.out.println(s);
    }
    
    public static void main(String[] args) {
        soma(1, 0);
        
    }
}
