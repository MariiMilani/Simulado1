//Data: 09/06/2025
//Conteúdo: Avaliação prática

package questoes;
import utils.IO;

public class Q3 {

    public static void resolver(){
        IO.imprimir("Avaliação - Questão 03 - Número Perfeito");

        //Entrada

        //Processamento
        resolverNumeroPerfeito();
        
    }

    public static void resolverNumeroPerfeito(){

        // Sua solução aqui
        int qtdMaxLinhas = IO.lerValorInteiro();

        for(int i = 1; i <= qtdMaxLinhas; i++){
            int numero = IO.lerValorInteiro();
            int acumulador = 0;
            if((numero > 1) && (numero < 1000)){
    
                for(int j = 1; j < numero; j++){
                    if(numero % j == 0){
                        acumulador = acumulador + j;
                    }
                }
    
                if(acumulador == numero) {
                    IO.imprimir("" + numero + " eh perfeito");
                }else {
                    IO.imprimir("" + numero + " nao eh perfeito");
                }
            }

        }

    }

}
