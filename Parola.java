public class Parola {
    private String testo;
    private int contatore;
    public Parola(String testo, int contatore){
        this.testo = testo;
        this.contatore = contatore;
    }
    public Parola(String testo){
        this(testo, 1);
    }
    public void incrementa(){
        this.contatore ++;
    }
    @Override 
    public String toString(){
        return this.testo + ": " + this.contatore;
    }
}
