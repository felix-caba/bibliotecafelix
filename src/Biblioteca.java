import java.util.ArrayList;
import java.util.HashMap;

public class Biblioteca {
// SOLUCION USAR HASHMAPS 
    private HashMap<Libro, StockInfo> stockLibro = new HashMap<>();
// clase ejemplares to make



    private StockInfo obtenerStockInfo(Libro libro) {
        return stockLibro.getOrDefault(libro, new StockInfo(0, 0, 0));
    }



    public void agregarLibro(Libro libro, int stock, int stockOnline, int enPrestamo){
        stockLibro.put(libro, new StockInfo(stock, stockOnline, enPrestamo));
    }

    public void mostrarLibro(Libro libro){

        System.out.println("Titulo: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Paginas: " + libro.getPaginas());
        System.out.println("Stock Fisico: " + obtenerStockInfo(libro).getStock());
     //   System.out.println("Stock Online: " + stockInfo.getStockOnline());
    //    System.out.println("Stock Total: " + stockInfo.getStockTotal());

    }

    public Libro buscarLibro(String titulo){
        for (Libro libro:stockLibro.keySet()) {
            if (libro.getTitulo().equals(titulo)){
                return libro;
            }
        }
        return null;
    }

    public boolean isDisponible(Libro libro){

        StockInfo stockInfo = stockLibro.get(libro);

        if (stockInfo.getStock() < 0 ){
            return false;
        }

        return true;

    }



    private static class StockInfo{

        private int stock;
        private int stockOnline;
        private int enPrestamo;
        private int stockTotal;
        public StockInfo(int stock, int stockOnline, int enPrestamo) {
            this.stock = stock;
            this.stockOnline = stockOnline;
            this.enPrestamo = enPrestamo;
        }

        public int getStock() {
            return stock;
        }

        public int getStockOnline() {
            return stockOnline;
        }

        public int getEnPrestamo() {
            return enPrestamo;
        }


        public int getStockTotal() {
            return (stockOnline+stock+enPrestamo);
        }

    }


}
