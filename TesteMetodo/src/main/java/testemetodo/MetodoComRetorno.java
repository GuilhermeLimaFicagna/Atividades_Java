
// função
package testemetodo;
public class MetodoComRetorno {
    
     static int somar(int a , int b){
        int s = a + b;
        return s;
    }
    public static void main(String[] args) {
        int sm = somar(1, 2);
        System.out.println(sm);
    }
}
