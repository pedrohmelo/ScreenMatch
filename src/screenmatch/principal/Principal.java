package screenmatch.principal;

import screenmatch.calculos.CalculadoraDeTempo;
import screenmatch.calculos.FiltroRecomendacao;
import screenmatch.modelos.Episodio;
import screenmatch.modelos.Filme;
import screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("The Matrix", 1999);
        //meuFilme.setNome("The Matrix");
        //meuFilme.setAnoDeLancamento(1999);
        meuFilme.setDuracaoEmMinutos(135);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média de avaliações do filme: " + meuFilme.pegaMedia());

        System.out.println("*********************************************************");

        Filme meuFilme2 = new Filme("Senhor dos Anéis", 1999);
        //meuFilme2.setNome("Senhor dos Anéis");
        //meuFilme2.setAnoDeLancamento(1999);
        meuFilme2.setDuracaoEmMinutos(163);
        meuFilme2.setIncluidoNoPlano(true);

        System.out.println("*********************************************************");

        Serie lost = new Serie("Lost", 2000);
        //lost.setNome("Lost");
        //lost.setAnoDeLancamento(2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(8);
        lost.setMinutosPorEpisodio(50);
        lost.exibeFichaTecnica();
        System.out.println("Duração para Maratonar " + lost.getNome() + ": " + lost.getDuracaoEmMinutos());

        System.out.println("*********************************************************");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(meuFilme2);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(meuFilme2);
        System.out.println("TAM: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println("Todo mundo da lista: " + listaDeFilmes);
    }
}
