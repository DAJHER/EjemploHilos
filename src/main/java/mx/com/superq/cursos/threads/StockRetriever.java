package mx.com.superq.cursos.threads;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;
import java.io.IOException;
import java.math.BigDecimal;
public class StockRetriever {
    private String compani;

    StockRetriever(String compani){
        this.compani = compani;
    }

    public BigDecimal getStockPrice() throws IOException{
        Stock stock = YahooFinance.get(compani);
        BigDecimal price = stock.getQuote().getPrice();
        stock.print();
        return price;
    }

    public String getCompani() {return compani;}
    public void setCompani(String compani) {this.compani = compani;}
}

