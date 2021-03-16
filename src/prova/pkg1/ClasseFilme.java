package prova.pkg1;


public class ClasseFilme {
    int codigo[] = {001,002,003};
    String nome[] = {"Velozes e Furiosos","A Voz Do Silêncio","Lucy"};
    String genero[] = {"Ação","Drama","Ação"};
    String sinopse[] = {"Um investigador da polícia se infiltra em uma turma de /n"
            + "rachas suspeita de roubar caminhões, mas acaba apaixonado-se pela/n"
            + " irmã do líder.",
        "Um antigo valentão tenta fazer as pazes com uma garota surda que ele /n"
            + "atormentava na escola. Ele acha que não merece o perdão, mas vai /n"
            + "tentar fazer o que é certo.",
        "Quem poderia imaginar que traficar drogas faria dela uma espécie de \n"
            + "super-heroína?"};
    
    void status() {
        System.out.println("Código: " + this.codigo[0] + "\n" + "Filme: " + this.nome[0] + "\n" + "Gênero: " + genero[0] + "\n" + "Sinopse: " + this.sinopse[0]);
        System.out.println("Código: " + this.codigo[1] + "\n" + "Filme: " + this.nome[1] + "\n" + "Gênero: " + genero[1] + "\n" + "Sinopse: " + this.sinopse[1]);
        System.out.println("Código: " + this.codigo[2] + "\n" + "Filme: " + this.nome[2] + "\n" + "Gênero: " + genero[2] + "\n" + "Sinopse: " + this.sinopse[2]);
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    public String[] getNome() {
        return nome;
    }

    public void setNome(String[] nome) {
        this.nome = nome;
    }

    public String[] getGenero() {
        return genero;
    }

    public void setGenero(String[] genero) {
        this.genero = genero;
    }

    public String[] getSinopse() {
        return sinopse;
    }

    public void setSinopse(String[] sinopse) {
        this.sinopse = sinopse;
    }
    
    

}
