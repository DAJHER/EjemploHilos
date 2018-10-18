package mx.com.superq.cursos.threads;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
public class TestStock {
    public static BigDecimal suma = new BigDecimal(0.0);
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\dhernandez\\IdeaProjects\\EjemploHilos\\src\\main\\resources\\list.txt";
        List<String> lineas = Files.readAllLines(Paths.get(fileName));
        StockRetriever stock;
        long inicio = System.nanoTime();
        for (String linea: lineas) {
                stock = new StockRetriever(linea);
                new Thread(stock, linea).start();
        }
        long fin = System.nanoTime();
        System.out.println(suma);
        System.out.println("Tiempo total:" + ((fin - inicio)/1000000000.0) + " segundos");
        System.out.println("Inicio: " + inicio + " Fin:"+ fin);
    }
}
