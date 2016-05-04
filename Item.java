import java.text.*;

public class Item { //this class is for storing information of the items.
	private String name;
	private double price;
	private int bulkQ;
	private double bulkP;
	
	public Item(String name, double price){
		if (price < 0.0){
			throw new IllegalArgumentException("Wrong Price. It cannot be negative.");
		}
		this.name = name;
		this.price = price;
	}
	
	public Item(String name, double price, int bulkQ, double bulkP){
		if (price < 0.0){ //throwing all the IllegalArgumentExceptions if the numbers are negative.
			throw new IllegalArgumentException("Wrong Price. It cannot be negative.");
		}
		if (bulkQ < 0.0 ){
			throw new IllegalArgumentException("Wrong Bulk Quantity. It cannot be negative.");
		}
		if (bulkP < 0){
			throw new IllegalArgumentException("Wrong Bulk Price. It cannot be negative.");
		}
		this.name=name;
		this.price=price;
		this.bulkQ=bulkQ;
		this.bulkP=bulkP;
	}
	public double priceFor (int quantity){
		double totalPrice = 0.0;
		if(quantity < 0){
			throw new IllegalArgumentException("Wrong Quantity. It cannot be negative!");
		}
		if(this.bulkP < 1){ 
			totalPrice = this.price*quantity;
		} else {
			totalPrice = (this.bulkP * (quantity / this.bulkQ)) + (this.price * (quantity % this.bulkQ));
		}
		
		return totalPrice;
	}
	
	public String toString(){ //returning String by using the NumberFormat.
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		String lastprice = nf.format(this.price);
		String lasttprice = nf.format(this.bulkP);
		if (this.bulkQ == 0){
			return (this.name + ", " + lastprice);
		}
		else {
			return this.name + ", " + lastprice + " (" + bulkQ + " for " + lasttprice + ")";
		}
		
	}
	
	public String getName(){
		return this.name;
	}
	
	
	
}
