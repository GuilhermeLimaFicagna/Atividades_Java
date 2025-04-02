package variaveiscompostas;
public class MesEosDias {
    public static void main(String[] args) {
        
        //exemplo de uso de Array
        
        String mes[] = {
            "Janeiro", "Fevereiro", "Março", "Abril", 
            "Maio", "Junho", "Julho", "Agosto", 
            "Setembro", "Outubro", "Novembro", "Dezembro"
        };
        
        int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        for (int m = 0; m < mes.length; m += 1){
                System.out.printf("O mês %s tem %d \n", mes[m], dias[m]);
        } 
    }
}
