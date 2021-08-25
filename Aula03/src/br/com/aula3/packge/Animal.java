package br.com.aula3.packge;

public class Animal {
	
	//Propriedades
	private String name;
	private String species;
	private String race;
	private String coloring;
	private int age;
	
	//Métidos construtores ou inicializadores
	//Se for public e com mesmo nome da classe, automaticamente � um m�todo construtor
	public Animal(String aName, String aSpecies, String aRace, String aColoring, int aAge) {
		this.name = aName;
		this.species = aSpecies;
		this.coloring = aColoring;
		this.age = aAge;
	}
	
	
	//M�todos
	void scheduleProc(String date, String obs){
		System.
		out.
		println(String.format("Pet %s agendou procedimento em %s com a observa��o %s", name, date, obs));
	}
	
	void finishStay(String date, String obs) {
		System.
		out.
		println(String.format("Pet %s deixou a loja em %s com a observa��o %s", name, date, obs));
	}
	
}
