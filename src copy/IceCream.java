
public class IceCream extends DessertItem {
	 String name;
	float IceCreamCost;

	public IceCream(String name, float IceCreamCost) {
		// TODO Auto-generated constructor stub
		super(name);
		this.IceCreamCost = IceCreamCost;
	}

	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		
		return IceCreamCost;
	}

}
