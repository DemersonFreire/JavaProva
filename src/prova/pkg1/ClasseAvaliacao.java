
package prova.pkg1;


public class ClasseAvaliacao {
    int identificador;
    String avaliador;
    int nota;
    String comentario;

    public ClasseAvaliacao(int identificador, String avaliador, int nota, String comentario) {
        this.identificador = identificador;
        this.avaliador = avaliador;
        this.nota = nota;
        this.comentario = comentario;
        
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getAvaliador() {
        return avaliador;
    }

    public void setAvaliador(String avaliador) {
        this.avaliador = avaliador;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
   void avaliacao (){
       System.out.println("Identificador: " + this.identificador);
       System.out.println("Avaliador: " + this.avaliador);
       System.out.println("Nota: " + this.nota);
       System.out.println("Comentário: " + this.comentario);
   } 
    
}
