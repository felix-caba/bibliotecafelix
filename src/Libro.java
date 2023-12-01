public class Libro {


    private String titulo;
    private String autor;
    private int paginas;


    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }


    /*
    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponibilidad(boolean disponible) {
        this.disponible = disponible;
    }

    public void prestarLibro(){
        if (disponible){
            disponible = false;
            System.out.println(titulo + " ha sido prestado");
        } else {
            System.out.println("No está disponible");
        }
    }

    public void devolverLibro(){
        if (!disponible){
            disponible = true;
            System.out.println(titulo + " ha sido devuelto");
        } else{
            System.out.println("El libro ya está disponible");
        }
    }
*/


}
