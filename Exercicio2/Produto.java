interface Produto {
    String titulo();
    int id(); // número único identificando o produto
    int ano();
    String autor();
    String midia(); // devolve "livro", "CD", "DVD", etc.
    String uniaoParaString(Produto[] lista1, Produto[] lista2);
}
    