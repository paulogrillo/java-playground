package br.com.aula3.packge;

public class Animal {
	
	//Propriedades
	String name;
	String species;
	String race;
	String coloring;
	int age;
	
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
