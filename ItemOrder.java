
public class ItemOrder implements Comparable<ItemOrder>  { //This class stores information of item and quantity needed.
															//ALso implements the Comparable class for ItemOrder.
	private Item item;
	private int quantity;
	
	public ItemOrder (Item item, int quantity){
		this.item=item;
		this.quantity=quantity;
	}
	
	public double getPrice(){
		return item.priceFor(quantity);
	}
	
	public Item getItem(){
		return this.item;
	
	}
	
	public int compareTo(ItemOrder other){ //Creating compareTo method which compares quantity of other item.
		if (this.quantity > other.quantity){
			return 1;
		}
		else if (this.quantity < other.quantity){
			return -1;
		}
		else{
			return 0;
		}
	}
	
	public String toString(){
		return "(" + this.getItem() + ", " + this.quantity + ")";
	}	
	
	
	
}
