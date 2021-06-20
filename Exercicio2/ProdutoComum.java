public class ProdutoComum implements Produto {
    private int id, ano;
    private String titulo, autor, midia;
    public ProdutoComum(String titulo, int id, int ano, String autor, String midia){
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
        
        return "";
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if(getClass() != o.getClass() || o == null) return false;
        ProdutoComum produtoComum = (ProdutoComum) o;
        return titulo.equals(produtoComum.titulo) && ano == produtoComum.ano &&autor.equals(produtoComum.autor) && midia.equals(produtoComum.midia) && id == produtoComum.id;
    }
    
}
