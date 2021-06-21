import java.util.Arrays;

public class ManipuladorProdutos {
    public void ordenarLista(Produto[] lista){
        for(int i = 0; i < lista.length - 1;i++){
            for(int j = 0;j < lista.length -1 -i;j++){
                if(lista[j].id() > lista[j+1].id()){
                    Produto aux = lista[j];
                    lista[j] = lista[j+1];
                    lista[j+1] = aux;
                }
            }
        }
    }
    public Produto[] fundirListasOrdenadas(Produto[] lista1, Produto[] lista2){
        ordenarLista(lista1);
        ordenarLista(lista2);
        Produto[] lista3 = new Produto[lista1.length + lista2.length];
        System.arraycopy(lista1, 0, lista3, 0, lista1.length);
        System.arraycopy(lista2, 0, lista3, 0, lista2.length);
        ordenarLista(lista3);
        return lista3;    

    }
    public String uniaoParaString(Produto[] lista1, Produto[] lista2){
        Produto [] listaFinal = fundirListasOrdenadas(lista1, lista2);
        String concatenar = new String();
        
        for(int i = 0; i < listaFinal.length;i++){
            concatenar.concat(" [\""+listaFinal[i].tıtulo()+"\",");
            concatenar.concat(" " +listaFinal[i].id() + ",");
            concatenar.concat(" " +listaFinal[i].ano() + ",");
            concatenar.concat(" \""+listaFinal[i].autor() +"\",");
            concatenar.concat(" " +listaFinal[i].mıdia() + "]");
        }
        concatenar.concat("}");
        return concatenar;
    }

}
