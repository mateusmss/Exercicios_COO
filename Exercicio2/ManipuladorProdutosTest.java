import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ManipuladorProdutosTest {

    ManipuladorProdutos manipulador;

    Produto[] lista1;
    Produto[] lista2;
    Produto[] lista3;
    Produto[] lista4;
    Produto[] lista1Ordenada;
    Produto[] lista2Ordenada;
    Produto[] listasOrdenadasJuntas;
    String strDaUniao;

    @Before
    public void setup(){

        this.manipulador = new ManipuladorProdutos();

        lista1 = new Produto[5];
        lista2 = new Produto[7];
        lista1Ordenada = new Produto[lista1.length];
        lista2Ordenada = new Produto[lista2.length];
        listasOrdenadasJuntas = new Produto[lista1.length + lista2.length];

        lista1[0] = new ProdutoDeluxe("Senhor dos Aneis, O Retorno do Rei", 3, 2003, "Peter Jackson", "DVD");
        lista1[1] = new ProdutoComum("Star Wars", 68, 1977, "George Lucas", "Filme");
        lista1[2] = new ProdutoDeluxe("Led Zeppelin IV", 5, 1971, "Led Zeppelin", "CD");
        lista1[3] = new ProdutoComum("O Silmarillion", 4, 1977, "J. R. R. Tolkien", "Livro");
        lista1[4] = new ProdutoComum("O Guia do Mochileiro das Galaxias", 42, 1979, "Douglas Adams", "Livro");

        lista2[0] = new ProdutoDeluxe("The Legend of Zelda: Breath of the Wild", 57, 2017, "Nintendo", "Jogo");
        lista2[1] = new ProdutoComum("Hollow Knight", 19, 2017, "Team Cherry", "Jogo");
        lista2[2] = new ProdutoComum("De Volta para o Futuro", 8, 1985, "Robert Zemeckis", "DVD");
        lista2[3] = new ProdutoDeluxe("Led Zeppelin IV", 5, 1971, "Led Zeppelin", "CD");
        lista2[4] = new ProdutoDeluxe("Senhor dos Aneis, A Sociedade do Anel", 1, 2001, "Peter Jackson", "DVD");
        lista2[5] = new ProdutoDeluxe("Senhor dos Aneis, As Duas Torres", 2, 2002, "Peter Jackson", "DVD");
        lista2[6] = new ProdutoDeluxe("Breaking Bad", 35, 2008, "AMC", "DVD");

        lista1Ordenada[0] = new ProdutoDeluxe("Senhor dos Aneis, O Retorno do Rei", 3, 2003, "Peter Jackson", "DVD");
        lista1Ordenada[1] = new ProdutoComum("O Silmarillion", 4, 1977, "J. R. R. Tolkien", "Livro");
        lista1Ordenada[2] = new ProdutoDeluxe("Led Zeppelin IV", 5, 1971, "Led Zeppelin", "CD");
        lista1Ordenada[3] = new ProdutoComum("O Guia do Mochileiro das Galaxias", 42, 1979, "Douglas Adams", "Livro");
        lista1Ordenada[4] = new ProdutoComum("Star Wars", 68, 1977, "George Lucas", "Filme");

        lista2Ordenada[0] = new ProdutoDeluxe("Senhor dos Aneis, A Sociedade do Anel", 1, 2001, "Peter Jackson", "DVD");
        lista2Ordenada[1] = new ProdutoDeluxe("Senhor dos Aneis, As Duas Torres", 2, 2002, "Peter Jackson", "DVD");
        lista2Ordenada[2] = new ProdutoDeluxe("Led Zeppelin IV", 5, 1971, "Led Zeppelin", "CD");
        lista2Ordenada[3] = new ProdutoComum("De Volta para o Futuro", 8, 1985, "Robert Zemeckis", "DVD");
        lista2Ordenada[4] = new ProdutoComum("Hollow Knight", 19, 2017, "Team Cherry", "Jogo");
        lista2Ordenada[5] = new ProdutoDeluxe("Breaking Bad", 35, 2008, "AMC", "DVD");
        lista2Ordenada[6] = new ProdutoDeluxe("The Legend of Zelda: Breath of the Wild", 57, 2017, "Nintendo", "Jogo");

        listasOrdenadasJuntas[0] = new ProdutoDeluxe("Senhor dos Aneis, A Sociedade do Anel", 1, 2001, "Peter Jackson", "DVD");
        listasOrdenadasJuntas[1] = new ProdutoDeluxe("Senhor dos Aneis, As Duas Torres", 2, 2002, "Peter Jackson", "DVD");
        listasOrdenadasJuntas[2] = new ProdutoDeluxe("Senhor dos Aneis, O Retorno do Rei", 3, 2003, "Peter Jackson", "DVD");
        listasOrdenadasJuntas[3] = new ProdutoComum("O Silmarillion", 4, 1977, "J. R. R. Tolkien", "Livro");
        listasOrdenadasJuntas[4] = new ProdutoDeluxe("Led Zeppelin IV", 5, 1971, "Led Zeppelin", "CD");
        listasOrdenadasJuntas[5] = new ProdutoDeluxe("Led Zeppelin IV", 5, 1971, "Led Zeppelin", "CD");
        listasOrdenadasJuntas[6] = new ProdutoComum("De Volta para o Futuro", 8, 1985, "Robert Zemeckis", "DVD");
        listasOrdenadasJuntas[7] = new ProdutoComum("Hollow Knight", 19, 2017, "Team Cherry", "Jogo");
        listasOrdenadasJuntas[8] = new ProdutoDeluxe("Breaking Bad", 35, 2008, "AMC", "DVD");
        listasOrdenadasJuntas[9] = new ProdutoComum("O Guia do Mochileiro das Galaxias", 42, 1979, "Douglas Adams", "Livro");
        listasOrdenadasJuntas[10] = new ProdutoDeluxe("The Legend of Zelda: Breath of the Wild", 57, 2017, "Nintendo", "Jogo");
        listasOrdenadasJuntas[11] = new ProdutoComum("Star Wars", 68, 1977, "George Lucas", "Filme");

        lista3 = lista1.clone();
        lista4 = lista2.clone();

        strDaUniao = "{[\"Senhor dos Aneis, A Sociedade do Anel\", 1, 2001, \"Peter Jackson\", DVD],[\"Senhor dos Aneis, As Duas Torres\", 2, 2002, \"Peter Jackson\", DVD],[\"Senhor dos Aneis, O Retorno do Rei\", 3, 2003, \"Peter Jackson\", DVD],[\"O Silmarillion\", 4, 1977, \"J. R. R. Tolkien\", Livro],[\"Led Zeppelin IV\", 5, 1971, \"Led Zeppelin\", CD],[\"Led Zeppelin IV\", 5, 1971, \"Led Zeppelin\", CD],[\"De Volta para o Futuro\", 8, 1985, \"Robert Zemeckis\", DVD],[\"Hollow Knight\", 19, 2017, \"Team Cherry\", Jogo],[\"Breaking Bad\", 35, 2008, \"AMC\", DVD],[\"O Guia do Mochileiro das Galaxias\", 42, 1979, \"Douglas Adams\", Livro],[\"The Legend of Zelda: Breath of the Wild\", 57, 2017, \"Nintendo\", Jogo],[\"Star Wars\", 68, 1977, \"George Lucas\", Filme]}\n";
    }

    @Test
    public void lista1Test(){

        manipulador.ordenarLista(lista1);
        assertArrayEquals(lista1Ordenada, lista1);
    }

    @Test
    public void lista2Test(){

        manipulador.ordenarLista(lista2);
        assertArrayEquals(lista2Ordenada, lista2);
    }

    @Test
    public void listasJuntasTest(){

        manipulador.ordenarLista(lista1);
        manipulador.ordenarLista(lista2);
        Produto[] novaLista = manipulador.fundirListasOrdenadas(lista1, lista2);

        assertArrayEquals(listasOrdenadasJuntas, novaLista);
    }

    @Test
    public void unirListasTest(){

        String resultado = manipulador.uniaoParaString(lista3, lista4);
        assertEquals(strDaUniao, resultado);
    }
}