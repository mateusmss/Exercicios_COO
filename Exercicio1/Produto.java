interface Produto {
    String tıtulo();
    int id(); // número único identificando o produto
    int ano();
    String autor();
    String mıdia(); // devolve "livro", "CD", "DVD", etc.
    String uniaoParaString(Produto[] lista1, Produto[] lista2);
}
    