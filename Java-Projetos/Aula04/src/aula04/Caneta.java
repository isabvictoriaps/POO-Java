package aula04;
public class Caneta {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;
    private boolean destampada;

    public Caneta(String modelo, float ponta, String cor) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public String getCor() {
        return cor;
    }

    public boolean isTampada() {
        return tampada;
    }

    public boolean isDestampada() {
        return destampada;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public void setDestampada(boolean destampada) {
        this.destampada = destampada;
    }
  
    public void tampar(){
        this.tampada = true;
    }

    public void status(){
        System.out.println("");
        System.out.println("SOBRE A CANETA: ");
        System.out.println("Está tampada? " + this.isTampada());
        System.out.println("caneta da cor: " + this.getCor());
        System.out.println("É do modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
    }
}
