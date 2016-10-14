
public class Cookie extends DessertItem {
	String name;
	private int num;
	private int pricePerDozen;
	public Cookie(String name, int num, int pricePerDozen) {
		super(name);
		this.name = name;
		this.num = num;
		this.pricePerDozen = pricePerDozen;
	}
	

	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		float cost = num * pricePerDozen / 12;
		float newCost = (int) Math.round(cost);
		return newCost;
	}


	public int getNum() {
		return num;
	}
	public int getPricePerDozen() {
		return pricePerDozen;
	}


	/**
	 * public static void setNum(int num) {
		Cookie.num = num;
	}


	//public static int getPricePerDozen() {
		return pricePerDozen;
	}


	//public static void setPricePerDozen(int pricePerDozen) {
		Cookie.pricePerDozen = pricePerDozen;
	}
	*/
	public static void main(String[] args){
		Cookie c = new Cookie("a", 10, 20);
		
		Cookie b = new Cookie("b", 20,30);
		System.out.println(b.name + b.getCost());
		System.out.println(c.name + c.getCost());
		
		
	}
	

}
