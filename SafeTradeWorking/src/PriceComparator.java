import java.util.Comparator;
public class PriceComparator implements Comparator<TradeOrder> {
	private boolean upDown = true;
 public PriceComparator(boolean buyOrSell) {
	 upDown = buyOrSell; //True means buy, False means sell
 }
@Override
 public int compare(TradeOrder obj1, TradeOrder obj2) {
	if(upDown) {
		if(obj1.getPrice() < obj2.getPrice() )
			return 1;
		if(obj1.getPrice() == obj2.getPrice())
			return 0;
		return -1;
	}
	else {
		if(obj1.getPrice() < obj2.getPrice())
			return -1;
		if(obj1.getPrice() == obj2.getPrice())
			return 0;
		return 1;
	}
 }
}
