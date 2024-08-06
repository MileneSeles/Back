public class Main {
    public static void main(String[] args) {
       Cliente milene = new Cliente();
       milene.setNome("Milene");

       Cliente maria = new Cliente();
       maria.setNome("Maria");

       Conta cc = new ContaCorrente(milene);
       Conta poupanca = new ContaPoupanca(milene);

       cc.depositar(100);
       cc.transferir(100, poupanca);
       cc.depositar(60);
       poupanca.depositar(20);

       cc.imprimirExtrato();
       poupanca.imprimirExtrato();


       cc = new ContaCorrente(maria);
       poupanca = new ContaPoupanca(maria);

       cc.depositar(50);
       cc.transferir(10, poupanca);
       cc.depositar(40);
       poupanca.depositar(20);

       cc.imprimirExtrato();
       poupanca.imprimirExtrato();
    }
}