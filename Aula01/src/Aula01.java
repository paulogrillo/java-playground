import java.util.Scanner;

class Aula01 {
	static String name = "";
	static int age = 0;
	
	
    public static void main(String[] args) {
    	getName();
    	getAge();
    	toGreeat();
    }
    
    public static void getName() {
    	System.out.println("Digite o seu nome:");
    	
    	Scanner mySc = new Scanner(System.in);
    	name = mySc.next();
    }
    
    public static void getAge() {
    	System.out.println("Digite a sua idade");
    	Scanner mySc = new Scanner(System.in);
    	age = mySc.nextInt();
   
    }

    public static void toGreeat() {
    	System.out.println(String.format("Olá meu nome é %s, e tenho %s anos", name, age));
    }
}