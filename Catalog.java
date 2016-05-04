import java.util.*;

public class Catalog { //this class is for storing information about a items together by using ArrayList
	private ArrayList<Item> items;
	private String name;
	
	
	
	public Catalog(String name){ //take the same parameter.
		this.name = name;
		this.items = new ArrayList<Item>();
	}
	
	public void add (Item item){
		items.add(item);
	}
	
	public int size(){
		return items.size();
	}
	
	public Item get(int index){ //add index at the end.
		return items.get(index);
	}
	
	public String getName(){
		return name;
	}
}