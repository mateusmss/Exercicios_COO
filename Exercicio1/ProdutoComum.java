public class ProdutoComum implements Produto {
    public ProdutoComum(String titulo, int id, int ano, String autor, String midia){
        
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
