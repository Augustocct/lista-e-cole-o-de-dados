package br.com.alura.screenmatch.modelos;

import java.util.ArrayList;
import java.util.List;

public class PrincipalComListas {
    Filme meuFilme = new Filme("O poderoso chefão", 1970);
    Filme outroFilme = new Filme("Avatar", 2023);
    Filme filmeDoPaulo = new Filme("Bastardos Inglorios", 2010);
    Serie lost = new Serie("Lost", 2000);
    
    //List<Titulo> lista = new ArrayList<>();
    List<String> lista = new ArrayList<String>();
    
    //lista.add(filmeDoPaulo);
    //lista.add(outroFilme);
    //lista.add(outroFilme);
    //lista.add(lost);

    for(Titulo item:lista) {
        System.out.println(item);
    }
}
