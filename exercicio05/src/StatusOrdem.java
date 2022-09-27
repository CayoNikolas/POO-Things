public enum StatusOrdem {
    PENDENTE(0), PROCESSANDO(1), ENVIADO(2), ENTREGUE(3);

    private int id;

    private StatusOrdem(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
