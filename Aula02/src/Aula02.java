public class Aula02 {

    //Atributos
    private long numeroConta;
    private double saldo = 0;

    //Construtor
    public Aula02(long numeroConta){
        this.numeroConta = numeroConta;
    }

    //Métodos
    public boolean sacar(double valor){
        if(this.saldo>=valor){
            this.saldo = this.saldo - valor;
            return false;
        }else {
            return  false;
        }
    }
    
}
