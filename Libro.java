class Libro {
    private String titulo;
    private String autor;
    private int id;
    private boolean rentado;
    
    public Libro(String titulo, String autor, int id) {
        this.titulo = titulo;
        this.autor = autor;
        this.id = id;
        this.rentado = false;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public int getId() {
        return id;
    }
    
    public boolean isRentado() {
        return rentado;
    }
    
    public void setRentado(boolean rentado) {
        this.rentado = rentado;
    }
}