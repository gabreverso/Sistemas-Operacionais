public class Pessoa implements Runnable{ 
    private Banheiro banheiro; 
    private String genero;

    public Pessoa(Banheiro banheiro, String genero) {
        this.banheiro = banheiro;
        this.genero = genero;
    }

    public void run() { 
        try {
            if(genero.equals("mulher")) {
                banheiro.mulherQuerEntrar();
                System.out.println("Mulher entrou no banheiro");
                Thread.sleep(2000); //mulher fica 2 segundos no banheiro
                banheiro.mulherSai();
                System.out.println("Mulher saiu do banheiro");
            } else {
                banheiro.homemQuerEntrar();
                System.out.println("Homem entrou no banheiro");
                Thread.sleep(2000); //homem fica 2 segundos no banheiro
                banheiro.homemSai();
                System.out.println("Homem saiu do banheiro");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
}
