package screenmatch.principal;

import screenmatch.modelos.Filme;
import screenmatch.modelos.Serie;
import screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("The Matrix", 1999);
        Filme meuFilme2 = new Filme("Senhor dos Anéis", 1999);
        Filme meuFilme3 = new Filme("A Knight's Tale", 2002);
        Serie minhaSerie = new Serie("Breaking Bad", 2008);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(meuFilme2);
        lista.add(meuFilme3);
        lista.add(minhaSerie);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Pedro Melo");
        buscaPorArtista.add("Christian Bale");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Dps do random: " + buscaPorArtista);

        Collections.sort(lista);
        System.out.println("Depois de ordenar por ordem alfabética: " + lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Depois de ordenar por ano de lançamento: " + lista);
    }
}
