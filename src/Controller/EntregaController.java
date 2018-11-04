package Controller;

import Model.Entrega;
import java.util.LinkedList;

public class EntregaController {
    LinkedList <Entrega> entrega;
    
//    Controller Produtos
    
    public EntregaController(){
        entrega = new LinkedList <Entrega> ();
    }

    public boolean insere(String pedido){
        entrega.add(new Entrega(pedido));
        return true;
    }
    
    public Entrega pesquisa(String pedido){
        for(int i=0;i<entrega.size();i++){
            if(entrega.get(i).getPedido() == pedido)
                return entrega.get(i);
        }
        return null;
    }
    
    public boolean delete(){
        int i = 0;
        for(; i<entrega.size();i++){
            if(entrega.get(i) != null){
                break;
            }
        }
        entrega.remove(i);
        return true;
    }
    
    public String mostraTudo(){
        String retorno="";
        for(int i=0;i<entrega.size();i++){
            retorno+=entrega.get(i).getPedido()+"\n";
        }
        return retorno;
    }
    
    // Controller Produtos
    
}
