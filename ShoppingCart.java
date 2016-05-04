import java.util.*;

public class ShoppingCart {
	//ShoppingCart class is storing information about the whole order by using ArrayList.
	private ArrayList<ItemOrder> items;
	private boolean discount; //set boolean if there is discount or not.
	
	
	public ShoppingCart(){
		this.items = new ArrayList<ItemOrder>();
	}
	
	public void add(ItemOrder itemOrder){
		for (int i = items.size()-1; i>=0;i--){
			ItemOrder cart = items.get(i);
			if(cart.getItem().equals(itemOrder.getItem())){
				items.remove(i);
			}
		}
		items.add(itemOrder);
	}
	
	public void setDiscount(Boolean discount){ //if there is discount,
		if(discount == true){					//it is true.
			this.discount = true;
		} else {                                //if not, no discount.
			this.discount = false;
		}
	}
	
	public double getTotal(){ //getting total price.
		double total = 0.0;
		for (ItemOrder i : items) {
			total = total+i.getPrice();
		}
		if (discount == true){ //if there is a discount, *0.9 to the total price.
			total = total*0.9;
		}
		return total;
	}
	
	public void sortCart(){ //by using collections, sort the items by quantity.
		Collections.sort(items);
	}
	
	public String toString(){ //Print the shoppingcart list.
		String finalPrice = "";
		for (ItemOrder i : items){
			finalPrice = finalPrice+i.toString();
		}
		return finalPrice;
	}
	
	
	
	
}
