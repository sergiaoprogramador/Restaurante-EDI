package Model;

public class Cozinheiro {
    private int codigo;
    private String nome;
    private String pedido;
    
    
    public Cozinheiro (int codigo, String nome, String pedido) {
        this.codigo = codigo;
        this.nome = nome;
        this.pedido = pedido;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getPedido() {
        return pedido;
    }
    
    public void setPedido(String pedido) {
        this.pedido = pedido;
    }
    
}
