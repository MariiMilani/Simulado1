//Data: 09/06/2025
//Conteúdo: Avaliação prática

package questoes;
import utils.IO;

public class Q2 {

    public static void resolver(){
        IO.imprimir("Avaliação - Questão 02 - Senha Fixa");

        //Entrada

        //Processamento
        resolverSenhaFixa();
        
    }

    public static void resolverSenhaFixa(){

        // Sua solução aqui
        int senhaCorreta = 2002;

        int senha = IO.lerValorInteiro();

        while (senha != senhaCorreta){
            IO.imprimir("Senha Invalida");

            senha = IO.lerValorInteiro();
        }

        IO.imprimir("Acesso Permitido");
    }

}
