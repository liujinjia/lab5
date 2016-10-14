
public abstract class DessertItem {
	protected java.lang.String name; 
	public DessertItem(){}
	public DessertItem(String name){
		this.name = name;
		
	}
	public final String getName(){
		
		return name;
	}
	
	public abstract float getCost();

}
