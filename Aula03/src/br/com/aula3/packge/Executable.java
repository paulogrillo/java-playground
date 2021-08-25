package br.com.aula3.packge;

public class Executable {
		//Criando uma Instancia 
		static Animal cachorroA = new Animal("Mel","Cachorro","Beaglue","Marrom e Branco", 50);

		
		public static void main(String[] args) {
			//Preenchimento das propriedades da instancia Animal
			//cachorroA.name = "mel";
			//cachorroA.species ="Cachorro";
			//cachorroA.race = "Beagle";
			//cachorroA.coloring = "Marrom";
			//cachorroA.age = 10;

			
			//Utilizando os m�tidos da instancia de Animal;
			cachorroA.scheduleProc("02/09/21", "Cortar as unhas");
			cachorroA.finishStay("03/09/21", "Acrescentar tosa");

		}
}


