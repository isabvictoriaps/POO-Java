package exerciciosaula02;

public class ExerciciosAula02 {

    public static void main(String[] args) {
        
        Notebook not1 = new Notebook ();
        
        not1.cor = "Cinza";
        not1.marca = "Lenovo";
        not1.memoria = 256;
        not1.processador = "Ryzen 5";
        not1.sisOperacional = "Linux";
        not1.tecladoNumerico = true;
        not1.memoriaRam = 2;
        not1.status();
        not1.programar();
        
        Notebook not2 = new Notebook();
        not2.cor = "Cinza";
        not2.marca = "Lenovo - Ideapad 2";
        not2.memoria = 1000;
        not2.memoriaRam = 12;
        not2.processador = "Intel - i5";
        not2.sisOperacional = "Windows 10";
        not2.tecladoNumerico = true;
        not2.status();
        not2.programar();
        
        
    }
    
}
