
package prova.pkg1;

import java.util.Arrays;
import java.util.Collections;


public class ClasseOpinioes {
    private ClasseAvaliacao[] avaliacao;

    public ClasseOpinioes(ClasseAvaliacao[] avaliacao) {
        this.avaliacao = avaliacao;
    }

    public ClasseAvaliacao[] getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(ClasseAvaliacao[] avaliacao) {
        this.avaliacao = avaliacao;
    }

    public double mediaAvaliacaoFilme() {
        int media = 0;
        for (ClasseAvaliacao avaliacao1 : avaliacao) {
            media += avaliacao1.getNota();
        }
        double mediaTotal = (double)media / avaliacao.length;
        return mediaTotal;
    }

    public int maiorNotaFilme() {
       Arrays.sort(avaliacao);
       int maior;
       maior = avaliacao[avaliacao.length -1].getNota();
       return maior;
    }

    public int menorNotaFilme() {
       Arrays.sort(avaliacao, Collections.reverseOrder());
       int menor;
       menor = avaliacao[avaliacao.length -1].getNota();
       return menor;
    }
    
}
