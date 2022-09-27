public class ItemOrdem {
    
    private int quantidade;
    private double preco;
    private Produto produto;

    public ItemOrdem(int quantidade, double preco_produto, Produto produto){
        this.quantidade = quantidade;
        this.preco = preco_produto;
        this.produto = produto;
    }

    public double subTotal(int quantidade, double preco){
        double itemTotal = preco * quantidade;
        return itemTotal;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
