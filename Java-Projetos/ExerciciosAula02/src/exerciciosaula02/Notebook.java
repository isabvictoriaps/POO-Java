package exerciciosaula02;

public class Notebook {
    
    String marca;
    String processador;
    int memoria;
    String cor;
    boolean tecladoNumerico;
    String sisOperacional;
    int memoriaRam;
    
    
    void status(){
        System.out.println("INFORMAÇÕES DO NOTEBOOK");
        System.out.println("A marca é: " + this.marca);
        System.out.println("O processador é: " + this.processador);
        System.out.println("A memória (em GB) é: " + this.memoria );
        System.out.println("A cor é: " + this.cor);
        System.out.println("Tem teclado numérico? " + this.tecladoNumerico);
        System.out.println("Sistema operacional: " + this.sisOperacional);
        System.out.println("Memória RAM: " + this.memoriaRam);
    }
    
    void programar (){
       if (this.memoriaRam >= 4){
           System.out.println("Programando");
       }
       else {
           System.out.println("ERRO!Memória RAM baixa, impossível programar");
       }
    }
    
    
    
}
