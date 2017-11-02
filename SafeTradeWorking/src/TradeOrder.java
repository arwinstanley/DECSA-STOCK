
public class TradeOrder {
	
 private int numShares;
 private double price;
 private boolean buyOrder;
 private boolean market;
 private String symbol;
 private Trader trader;
 
 public TradeOrder(Trader t, String s, boolean buy, int numShares, boolean market, double price) {
	 trader = t;
	 symbol = s;
	 this.market = market;
	 buyOrder = buy;   //True means buy, False means sell
	 this.market = market;
	 this.price = price; 
 }
 

@Override
public String toString() {
	return "TradeOrder [numShares=" + numShares + ", price=" + price + ", buyOrder(True means buy, False means sell) =" + buyOrder + ", market=" + market
			+ ", symbol=" + symbol + "]";
}


public int getNumShares() {
	return numShares;
}

public double getPrice() {
	return price;
}

public boolean isBuyOrder() {
	return buyOrder;
}

public boolean isMarket() {
	return market;
}

public String getSymbol() {
	return symbol;
}

public Trader getTrader() {
	return trader;
}
 
}
