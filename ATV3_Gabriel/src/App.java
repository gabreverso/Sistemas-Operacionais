public class App {
    public static void main(String[] args) {
        Banheiro banheiro = new Banheiro();
        Thread mulherThread = new Thread(new Pessoa(banheiro, "mulher"));
        Thread homemThread = new Thread(new Pessoa(banheiro, "homem"));
        mulherThread.start(); 
        homemThread.start();
    }
}
