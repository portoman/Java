package daw.poo_01;

public class ClasePrincipal {
    public static void main(String[] args) {
            Libro libro1=new Libro(1, "El liberalismo", "Juan Ramon Rallo", 325);
            Libro libro2=new Libro(1, "Así se domina el mundo", "Pedro Baños", 587);
            
            libro1.toString1();
            
            String paginasPrimero=(libro1.getNumPaginas()>libro2.getNumPaginas())?"El primer libro tiene más paginas": "El segundo libro tiene más páginas";
            
            System.out.println(paginasPrimero);
    }
    
}
