public class ProdutoDeluxe implements Produto{
    private String titulo, autor, midia, toString;
    private int id, ano;
    public ProdutoDeluxe(String titulo, int id, int ano, String autor, String midia){
        this.titulo = titulo;
        this.id = id;
        this.ano = ano;
        this.autor = autor;
        this.midia = midia;
    }
    public String titulo(){
        return titulo;
    }
    public int id(){
        return id;
    }
    public int ano(){
        return ano;
    }
    public String autor(){
        return autor;
    }
    public String midia(){
        return midia;
    }
    public String uniaoParaString(Produto[] lista1, Produto[] lista2){
        String uniaoString;
        ManipuladorProdutos manipuladorProdutos = new ManipuladorProdutos();
        uniaoString = manipuladorProdutos.uniaoParaString(lista1, lista2);
        return uniaoString;
    }
    public String toString(){

        return toString;
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if(getClass() != o.getClass() || o == null) return false;
        ProdutoDeluxe produtoDeluxe = (ProdutoDeluxe) o;
        return titulo.equals(produtoDeluxe.titulo) && ano == produtoDeluxe.ano && autor.equals(produtoDeluxe.autor) && midia.equals(produtoDeluxe.midia) && id == produtoDeluxe.id;
    }

}

