//Data: 09/06/2025
//Conteúdo: Avaliação prática

package questoes;
import utils.IO;

public class Q1 {

    public static void resolver(){
        IO.imprimir("Avaliação - Questão 01 - ");

        //Entrada
        int n = IO.lerValorInteiro();

        //Processamento
        resolverQuadradoEAoCubo(n);
        
    }

    public static void resolverQuadradoEAoCubo(int n){

        // Sua solução aqui
        for(int i = 1; i <= n; i++){
            double quadrado = Math.pow(i, 2);
            double cubo = Math.pow(i, 3);
            IO.imprimir("" + i + " " + (int) quadrado + " " + (int) cubo);
        }
    }

}
