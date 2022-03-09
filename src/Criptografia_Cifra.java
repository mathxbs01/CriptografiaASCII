import java.util.Scanner;

public class Criptografia_Cifra {

   public static void main(String[] args) 
    {
        int cripto;
        int constante = 10;
        String res = "";
        String vRecebido; 

        Scanner valorRecebido = new Scanner(System.in);

        System.out.println("Digite o valor a ser criptografado: ");
        vRecebido = valorRecebido.next();

        for ( int i = 0; i < vRecebido.length(); ++i ) 
        { 
            char c = vRecebido.charAt( i ); 
            int j = (int) c; 
            cripto = j + constante;
            res +=  (char)cripto;
            System.out.println("Origem: " + j + " Criptografi1a: " + cripto); 
        } 
        System.out.println("Resultado: " + res); 
    } 
}
