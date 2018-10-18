package mx.com.superq.cursos.threads;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;
import java.io.IOException;
import java.math.BigDecimal;
public class StockRetriever implements Runnable{
    private String compani;
    @Override
    public void run() {
        try {
            //TestStock.suma = TestStock.suma.add( getStockPrice());
            getStockPrice();
            //System.out.println(Thread.currentThread().getName() +);
            System.out.println(TestStock.suma);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }
    StockRetriever(String compani){this.compani = compani;}
    public BigDecimal getStockPrice() throws IOException{
        Stock stock = YahooFinance.get(compani);
        BigDecimal price = stock.getQuote().getPrice();
        stock.print();
        TestStock.suma = TestStock.suma.add(price);
        return price;
    }
    public String getCompani() {return compani;}
    public void setCompani(String compani) {this.compani = compani;}
}

