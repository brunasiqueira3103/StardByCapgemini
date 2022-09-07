package ComandosLeitutaEGravacao;

//1 - Importar o pacote java.util
import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        //ler dados
        Scanner leitor = new Scanner(System.in);
        
        int idade = leitor.nextInt();
        float cotacaoDolar = leitor.nextFloat();
        double cotacaoEuro = leitor.nextDouble();
        String nome = leitor.nextLine();//Leitura de texto com mais de uma palavra
        String codigoRua = leitor.next();//Le apenas uma palavra, nao e permitido o uso do caractere espaco
        char c = leitor.next().charAt(0);
        
        //saída de dados
        String texto = "Esse texto sera impresso no console";
        String outroTexto = "Esse texto tambem sera impresso no console";
        System.out.println(texto);
        System.out.print(outroTexto);
        
    }
}

        //COMANDOS DE ENTRADA
        //======================================================================
        /*
            Uma das possibilidades de entrada e saida de dados em Java e a 
            utilizacao da classe Scanner.
        
            Passos para a utilizacao do Scanner:
            
            1 - Importar o pacote java.util
            2 - Instanciar e criar um objeto Scanner
            3 - Ler valores atraves do teclado
  
            Como o metodo next retorna um texto precisamos pegar o caractere da
            primeira posicao da palavra para isso usamos o metodo charAt() na
            posicao zero
        */
        
        //COMANDOS DE SAIDA
        //======================================================================
        /*
            Existem algumas opcoes de comandos de saida utilizando a classe 
            System. Sao elas: 
            
            1 - print() - Imprime o valor de uma variavel
            2 - printf() - Imprime o valor de uma variavel conforme uma formatacao especificada
            3 - println() - Imprime o valorm de uma variavel e pula uma linha
        */
