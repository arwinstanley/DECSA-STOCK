import java.util.*;
public class Brokerage implements Login {
private TreeMap<String, Trader> registeredTraders;
private TreeSet<Trader> loggedInTraders;

public Brokerage () {
	registeredTraders = new  TreeMap<String, Trader>();
	loggedInTraders = new  TreeSet<Trader>(); 
}

@Override
public int addUser(String name, String password) {
	// TODO Auto-generated method stub
	
	return 0;
}

@Override
public int login(String name, String password) {
	// TODO Auto-generated method stub
	return 0;
}

}
