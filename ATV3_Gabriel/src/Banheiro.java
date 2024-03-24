import java.util.concurrent.Semaphore;

public class Banheiro {
    private Semaphore semaphore = new Semaphore(1); //semáforo para controlar o acesso ao banheiro
    private int mulheres = 0; //número de mulheres no banheiro
    private int homens = 0; //número de homens no banheiro

    public void mulherQuerEntrar() throws InterruptedException {
        semaphore.acquire(); //solicita acesso ao banheiro
        while(homens > 0) { //se houver homens no banheiro, a mulher deve esperar
            semaphore.release();
            Thread.sleep(1000); //espera 1 segundo
            System.out.println("Mulher esperando para entrar no banheiro");
            semaphore.acquire();
        }
        mulheres++; //incrementa o número de mulheres no banheiro
        semaphore.release(); //libera o acesso ao banheiro
    }

    public void homemQuerEntrar() throws InterruptedException {
        semaphore.acquire(); //solicita acesso ao banheiro
        while(mulheres > 0) { //se houver mulheres no banheiro, o homem deve esperar
            semaphore.release(); 
            Thread.sleep(1000); //espera 1 segundo
            System.out.println("Homem esperando para entrar no banheiro");
            semaphore.acquire();
        }
        homens++;
        semaphore.release();
    }

    public void mulherSai() throws InterruptedException {
        semaphore.acquire(); 
        semaphore.release(); 
        mulheres--; //decrementa o número de mulheres no banheiro
    }

    public void homemSai() throws InterruptedException {
        semaphore.acquire();
        semaphore.release();
        homens--;
    }

}
