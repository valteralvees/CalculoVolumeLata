package calculovolumelata;
import java.util.Scanner;


public class CalculoVolumeLata {

    public static void main(String[] args) {
        // Declaração de variáveis
        double volume, raio, altura, resultadoVolume;
        
        //Teclado
        Scanner teclado = new Scanner(System.in);
        
        
        System.out.println("Cálculo de volume da lata. Precisaremos de algumas informações para calcular o volume correto da lata.");
        System.out.println("Por favor, digite a altura da lata em CM:");
        altura = teclado.nextDouble();
        System.out.println("Agora, digite o raio da lata:");
        raio = teclado.nextDouble();
        volume = 3.14159 * altura * raio;
        System.out.println("O resultado de volume da lata é de :"+ volume);
        
        
        
    }
    
}
