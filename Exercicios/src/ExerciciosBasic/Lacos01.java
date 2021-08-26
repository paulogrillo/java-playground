
////Desenvolver um sistema que efetue a soma de todos os números ímpares que são
////múltiplos de três e que se encontram no conjunto dos números de 1 até 500.

package ExerciciosBasic;
public class Lacos01 {
    //Variáveis base
    static int cont = 0;

    public static void main(String[] args) {
        for (int i=1; i<=500; ++i){
            if(i%3==0 & i<=500){
                System.out.println(i);
                cont = cont + 1;
            }
        }System.out.println("A soma de todos os numeros impares: "+cont);
    }
}
