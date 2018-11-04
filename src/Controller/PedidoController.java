package Controller;

import Model.Produto;
import java.util.LinkedList;
import java.util.Random;

public class PedidoController {
    LinkedList <Produto> dados;
    
//    Controller Produtos
    private int id;
    public PedidoController(){
        dados = new LinkedList <Produto> ();
    }

    public boolean insere(String nome, float preco, float quantidade){
        try{
            Random rand = new Random();
            this.id = rand.nextInt();
        } catch (Exception e){
            this.id = 1;
        }
        dados.add(new Produto(id,nome,preco,quantidade));
        return true;
    }
    
    public boolean insere(String nome, String preco, String quantidade){
        int id;
        try{
            id = dados.getLast().getId()+1;
        } catch (Exception e){
            id=1;
        }
        try{
            dados.add(new Produto(id,nome,Float.parseFloat(preco),Float.parseFloat(quantidade)));
            return true;
        } catch(Exception e){
            return false;
        }
    }
    
    public boolean edita(String id, String nome, String preco, String quantidade){
        //encontra a posição do produto na lista
        int i;
        for(i=0;i<dados.size();i++){
            if(dados.get(i).getId()==Integer.parseInt(id))
                break;
        }
        //atualiza os dados na lista
        try{
            if(i!=dados.size()){
                dados.set(i,new Produto(Integer.parseInt(id),nome,
                        Float.parseFloat(preco),Float.parseFloat(quantidade)));
            }
            return true;
        } catch(Exception e){
            return false;
        }
    }
    
    public Produto pesquisa(int id){
        for(int i=0;i<dados.size();i++){
            if(dados.get(i).getId()==id)
                return dados.get(i);
        }
        return null;
    }
    
    public boolean delete(String id){
        //encontra a posição do produto na lista
        int i;
        for(i=0;i<dados.size();i++){
            if(dados.get(i).getId()==Integer.parseInt(id))
                break;
        }
        dados.remove(i);
        return true;
    }
    
    public String pegaPedido() {
        String retorno = "";
        for(int i=0;i<dados.size();i++){
            if(dados.get(i) != null){
                retorno += dados.get(i).getId()+ " - ";
                retorno += dados.get(i).getNome()+ " - ";
                retorno += dados.get(i).getPreco()+ " - ";
                retorno += dados.get(i).getQuantidade() + "\n";
                return retorno;
            }
        }
        return retorno = "";
    }
    
    public String mostraTudo(){
        String retorno="";
        for(int i=0;i<dados.size();i++){
            retorno+=dados.get(i).getId()+" - ";
            retorno+=dados.get(i).getNome()+" - ";
            retorno+=dados.get(i).getPreco()+" - ";
            retorno+=dados.get(i).getQuantidade()+"\n";
        }
        return retorno;
    }
    
    // Controller Produtos
    
}
