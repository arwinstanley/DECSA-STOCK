import java.text.DecimalFormat;
import java.util.*;

public class Stock implements Comparable<Stock> {
	
private String symbol;
private String name;

private double lastPrice;
private double lowPrice;
private double highPrice;
private double dayVolume;

private static DecimalFormat money = new DecimalFormat("$#,##0.00");

private static PriceComparator compy = new PriceComparator(true); //buy
private static PriceComparator compo = new PriceComparator(true); //sell

private PriorityQueue<TradeOrder> buyOrders;
private PriorityQueue<TradeOrder> sellOrders;

public Stock(String sym, String nme, double prc) {
	buyOrders = new PriorityQueue<TradeOrder>(compy);
	sellOrders = new PriorityQueue<TradeOrder>(compo);
	
	symbol = sym;
	name = nme;
	lastPrice = prc;
	lowPrice = prc;
	highPrice = prc;
	dayVolume = 0;
}
public String getQuote() {
	return "" + name + " ("+ symbol + ") \n" + "Price: "+lastPrice + "hi: "+ highPrice + "lo: "+ lowPrice + "vol: "+ dayVolume ;
	
}
public String toSting() {
	return symbol + ", " + name + ", " + money.format(price);
}

public void placeHolder(TradeOrder trade) {
	
}

public int compareTo(Stock s) {
	return (int) (lastPrice - s.lastPrice);
}
}
