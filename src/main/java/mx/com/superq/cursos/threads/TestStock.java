package mx.com.superq.cursos.threads;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TestStock {
    public static void main(String[] args) throws IOException {
        StockRetriever stock;
        BigDecimal suma = new BigDecimal(0.0);
        String fileName = "C:\\Users\\dhernandez\\IdeaProjects\\EjemploHilos\\src\\main\\resources\\list.txt";
        List<String> lineas = Files.readAllLines(Paths.get(fileName));
        long inicio = System.nanoTime();
        for (String linea: lineas) {
            //System.out.println(linea);
            stock = new StockRetriever(linea);
            suma = suma.add(stock.getStockPrice());
        }
        long fin = System.nanoTime();
        System.out.println(suma);
        System.out.println("Tiempo total:" + ((fin - inicio)/1000000000.0) + " segundos");
        System.out.println("Inicio: " + inicio + " Fin:"+ fin);
    }
}
