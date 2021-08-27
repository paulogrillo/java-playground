//Elaborar um programa que efetue a leitura sucessiva de valores numéricos e
//apresente no final o total do somatório, a média e o total de valores lidos. O programa
//deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
//positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.


// Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias
// e mostre-a expressa apenas em dias.

package ExerciciosBasic;
import java.util.Scanner;

public class Laco02 {
    // Variáveis
    static int valueN = 0;
    static int total = 0;
    static int cont = 0;
    static double media = 0;

    public static void main(String[] args) {
        //Inicializadores
        getValueN();
        getTotal();
        getCont();
        getMedia();
        toGreat();
    }
    //Entrada de dados

    public static void getValueN() {
        System.out.println("Escreva sua idade em anos: ");
        Scanner mySc = new Scanner(System.in);
        valueN = mySc.nextInt();
    }
    public static void getTotal() {
        System.out.println("Escreva os meses: ");
        Scanner mySc = new Scanner(System.in);
        total = mySc.nextInt();
    }

    public static void getCont() {
        System.out.println("Escreva em dias: ");
        Scanner mySc = new Scanner(System.in);
        cont = mySc.nextInt();
    }

    public static void getMedia() {
        System.out.println("Escreva em dias: ");
        Scanner mySc = new Scanner(System.in);
        media = mySc.nextInt();
    }

    public static void toGreat() {
        /*
        		enquanto(valoresN > 0){
			escreva("Digite um valor posito: ")
			leia(valoresN)

			se(valoresN < 0){
				pare
			}
			//Somatória
			total=total+valoresN

			//Contador
			contador = contador++

			//Média
			media = total/contador


		}
		escreva("O sistema finalizou, porque você digitou um número negativo!")
		escreva("\nSomatória: ",total)
		escreva("\nA Média: ",media)
		escreva("\nTotal de valores lidos: ",contador)
	}
         */
    }



}
