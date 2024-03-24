import java.util.concurrent.*; //pacote que contém as classes que implementam semáforos

public class Fogao {
    private Semaphore semaforo = new Semaphore(3); //classe que implementa semáforos 
    private int frigideiras = 0; //variável que armazena a quantidade de frigideiras
    private int panelas = 0; //variável que armazena a quantidade de panelas

    public void usarFrigideira() throws InterruptedException { //método que simula o uso de uma frigideira
        synchronized(this) { 
            if (panelas == 0) {  //verifica se a quantidade de panelas é igual a 0
                frigideiras++;  
                System.out.println("A boca do fogão está com " + frigideiras + " frigideiras.");
            }
        }
        semaforo.acquire(); //método que decrementa o semáforo
        semaforo.release(); //método que incrementa o semáforo
        synchronized(this) { 
            frigideiras--;
        }
    }

    public void usarPanela() throws InterruptedException { //método que simula o uso de uma panela
        synchronized(this) { 
            if (frigideiras == 0 && panelas < 3) { //verifica se a quantidade de frigideiras é igual a 0 e a quantidade de panelas é menor que 3
                panelas++;
                System.out.println("A boca do fogão está com " + panelas + " panelas."); 
            }
        }
        semaforo.acquire(); //método que decrementa o semáforo
        semaforo.release(); //método que incrementa o semáforo
        synchronized(this) {
            panelas--;
        }
    }
}