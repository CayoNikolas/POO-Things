public enum Color {
    PRETO(1, "Preto"), AZUL(2, "Azul"), VERMELHO(3, "Vermelho");

    private final int id;
    private final String titulo;

    private Color(int id, String titulo){
        this.id = id;
        this.titulo = titulo;
    }

    public int getId() {
        return id;
    }

    public String getTitulo(){
        return this.titulo;
    }
    
}
