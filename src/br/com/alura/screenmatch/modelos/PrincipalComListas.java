package br.com.alura.screenmatch.modelos;

import java.util.ArrayList;
import java.util.List;

public class PrincipalComListas {
    
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(10);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(7);
        Filme filmeDoPaulo = new Filme("Bastardos Inglorios", 2010);
        filmeDoPaulo.avalia(8);
        Serie lost = new Serie("Lost", 2000);

        List<Titulo> lista = new ArrayList<>();
        
         lista.add(filmeDoPaulo);
         lista.add(outroFilme);
         lista.add(outroFilme);
         lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item);
            if(item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classficação: "+filme.getClassificacao());
            }
        }
    }
}
