
public class Sundae extends IceCream {
	String toppingName;
	
    double costOfTopping;
    
	public Sundae(String name, int IceCreamCost, String toppingName, float costOfTopping) {
		// TODO Auto-generated constructor stub
		super(name,IceCreamCost);
		this.costOfTopping = costOfTopping;
		this.toppingName = toppingName;
		
	}
	public String getToppingName() {
		return toppingName;
	}


	
	
	public float getCost(){
		int sundaeCost = (int)(costOfTopping + super.getCost());
		return sundaeCost;
		
	}
	public static void main(String[] args){
		Sundae s = new Sundae("a", 12,"ewefg",3.0f);
		System.out.println(s.getToppingName());
		}

}
