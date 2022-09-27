import java.util.Date;

public class Ordem {
    private Date momento;
    private StatusOrdem status;
    private Cliente cliente;
    private ItemOrdem[] itens;
    private int totalItens;

    public Ordem(Date momento, StatusOrdem status, Cliente cliente){
        this.momento = momento;
        this.status = status;
    }

    public void addItem(ItemOrdem item){
        itens[totalItens] = item;
        totalItens = totalItens + 1;
    }

    public void removeItem(ItemOrdem item){
        itens[totalItens] = null;
        totalItens = totalItens - 1;
    }

    public double total(){
        double total = 0;
        for (int i = 0; i <= totalItens; i++){
            double preco = itens[i].getPreco();
            int quantidade = itens[i].getQuantidade();
            total = total + itens[i].subTotal(quantidade, preco);
        }
        return total;
    }
}
