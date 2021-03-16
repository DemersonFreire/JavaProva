package prova.pkg1;


public class Prova1 {

   
    public static void main(String[] args) {
        ClasseFilme c1 = new ClasseFilme();
       
        c1.status();
        
        ClasseAvaliacao c2 = new ClasseAvaliacao(1, "Sebastião", 4, "Dahora!!");
        c2.avaliacao();
        
        Videoteca c3 = new Videoteca();
        c3.BuscaFilme();
        
        Objetos c4 = new Objetos();
        c4.OBJ();
    }
    
    
}
