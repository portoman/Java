package daw.poo_01;

public class Libro {
    
    private int ISBN;
    private String titulo;
    private String autor;
    private int numPaginas;

    //<editor-fold defaultstate="collapsed" desc="Getter/Setter">
      
    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    
    
//</editor-fold>
  
    public void toString1(){
        System.out.println("El libro "+this.titulo+" con ISBN "+this.ISBN+" creado por el autor "+this.autor+" tiene "+this.numPaginas+" páginas");
    }

    public Libro(int ISBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }
    
    public Libro(){
        
    }
}
