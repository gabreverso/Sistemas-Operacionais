public class App {
    public static void main(String[] args) throws Exception {
        final int N = 5; // Número de threads que usarão frigideiras
        final int M = 4; // Número de threads que usarão panelas
        Fogao fogao = new Fogao();

        for (int i = 0; i < N; i++) { 
            new Thread(() -> { //criação de uma thread
                try {
                    fogao.usarFrigideira(); //método que simula o uso de uma frigideira
                } catch (InterruptedException e) { 
                    e.printStackTrace();
                }
            }).start(); //inicialização da thread 
        }

        for (int i = 0; i < M; i++) { 
            new Thread(() -> { 
                try {
                    fogao.usarPanela(); //método que simula o uso de uma panela
                } catch (InterruptedException e) { 
                    e.printStackTrace();
                }
            }).start(); 
        }
    }
}