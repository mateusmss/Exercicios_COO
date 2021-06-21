public class ProdutoDeluxe implements Produto{
    public ProdutoDeluxe(String titulo, int id, int ano, String autor, String midia){
        titulo = this.tıtulo();
        id = this.id();
        ano = this.ano();
        autor = this.autor();
        midia = this.mıdia();
    }
    public String tıtulo(){
        return this.tıtulo();
    }
    public int id(){
        return this.id();
    }
    public int ano(){
        return this.ano();
    }
    public String autor(){
        return this.autor();
    }
    public String mıdia(){
        return this.mıdia();
    }
    public String uniaoParaString(Produto[] lista1, Produto[] lista2){
        return "";
    }
    public String toString(){
        
        return "";
    }
    public boolean equals(Object o){
        if(!super.equals(o)){
            return false;
        }

        return true;
    }
}

