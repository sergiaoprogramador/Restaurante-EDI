package Controller;

import Model.Cozinheiro;
import java.util.LinkedList;

public class CozinheiroController {
    LinkedList <Cozinheiro> dadosCozinheiro;
    
//    Controller cozinheiro
    
    public CozinheiroController() {
        dadosCozinheiro = new LinkedList <Cozinheiro> ();
    }
        
    public boolean insereDadosCozinheiro (int codigo, String nome, String pedido) {
        dadosCozinheiro.add(new Cozinheiro(codigo, nome, pedido));
        return true;
    }
    
    public Cozinheiro pesquisa(int codigo){
        for(int i=0;i<dadosCozinheiro.size();i++){
            if(dadosCozinheiro.get(i).getCodigo() == codigo)
                return dadosCozinheiro.get(i);
        }
        return null;
    }
    
    public boolean delete(String codigo){
        //encontra a posição do dadosCozinheiro na lista
        int i;
        for(i=0;i<dadosCozinheiro.size();i++){
            if(dadosCozinheiro.get(i).getCodigo()==Integer.parseInt(codigo))
                break;
        }
        dadosCozinheiro.remove(i);
        return true;
    }
    
    
    public void cozinhaNovoPedido(String pedido, int codigo) {
        for(int i=0;i<dadosCozinheiro.size();i++){
            if(dadosCozinheiro.get(i).getCodigo() == codigo){
                dadosCozinheiro.get(i).setPedido(pedido);
                break;
            }
        }
    }
    
    public String pegaPedido(int codigo) {
        for(int i=0;i<dadosCozinheiro.size();i++){
            if(dadosCozinheiro.get(i).getCodigo() == codigo){
                return dadosCozinheiro.get(i).getPedido();
            }
        }
        return "";
    }
    
    public String mostraTudo(int codigo){
        String retorno="";
        for(int i=0;i<dadosCozinheiro.size();i++){
            if(dadosCozinheiro.get(i).getCodigo() == codigo){
                retorno += dadosCozinheiro.get(i).getCodigo() + " - ";
                retorno += dadosCozinheiro.get(i).getNome() + " - ";
                retorno += dadosCozinheiro.get(i).getPedido();
                break;
            }
        }
            
        return retorno;
    }
//    Controller dadosCozinheiro
}
