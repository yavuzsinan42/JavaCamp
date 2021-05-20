package gun2odev1;
import java.util.Date;

public class Coin {
	String name;
	Date date;
	String symbol;
	double open,high,low,close,tradeCount;
	public Coin() {
		
	}
	public Coin(String name, Date date, String symbol, double open, double high, double low, double close, double tradeCount) {
		this.name = name;
		this.date = date;
		this.symbol = symbol;
		this.open = open;
		this.high = high;
		this.low = low;
		this.close = close;
		this.tradeCount = tradeCount;
	}
	public Coin(String name, String symbol, double open, double high, double low, double close, double tradeCount) {
		this.name = name;
		this.date = new Date();
		this.symbol = symbol;
		this.open = open;
		this.high = high;
		this.low = low;
		this.close = close;
		this.tradeCount = tradeCount;
	}
}

