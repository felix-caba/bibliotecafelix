public class Main


{

    public static void main(String[] args) {

       Libro el_extranjero = new Libro("El extranjero", "Albert Camus", 40);
       Libro la_caida = new Libro("La caida", "Albert Camus", 70);
       Biblioteca felix_biblioteca = new Biblioteca();



       felix_biblioteca.agregarLibro(la_caida, 50, 30,  2);
       felix_biblioteca.agregarLibro(el_extranjero, 20, 40, 5);

       System.out.println(felix_biblioteca.isDisponible(el_extranjero));
   //    System.out.println(felix_biblioteca.mostrarStock(el_extranjero));

       felix_biblioteca.mostrarLibro(el_extranjero);
       felix_biblioteca.mostrarLibro(la_caida);

// dentro de biblioteca cambio las cosas y disponibilidad

    }

}