//9) Efetuar o c�lculo e a apresenta��o do valor de uma presta��o em atraso, utilizando a f�rmula
 //PRESTACAO=VALOR+(VALOR*TAXA/100) *TEMPO). 
import java.util.Scanner;

public class Exercicio09 {
public static void main (String[]args) {

Scanner sc = new Scanner(System.in);

System.out.println("Digite o valor da presta��o");

int valor = sc.nextInt();

System.out.println("Digite o valor da taxa");

int taxa = sc.nextInt();

System.out.println("digite o tempo");

int tempo = sc.nextInt();

System.out.println ("O valor da presta��o em atraso � de " + valor*taxa/100*tempo);
}
}



