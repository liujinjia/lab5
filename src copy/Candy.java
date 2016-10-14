
public class Candy extends DessertItem {
	String name;
	private  float weightCandy;
	private  float pricePerWeight;
	public Candy(String name, float weightCandy, float pricePerWeight) {
		super(name);
		this.weightCandy = weightCandy; 
		this.pricePerWeight = pricePerWeight;
		
	}
	
	 
	@Override
	public float getCost() {
		// TODO Auto-generated method stub
		
		float cost = getWeightCandy() * getPricePerWeight();
		int newCost = (int) Math.round(cost);
		
		return newCost;
	}


	public float getWeightCandy() {
		return weightCandy;
	}


	/**public void setWeightCandy(float weightCandy) {
		Candy.weightCandy = weightCandy;
	}
	*/


	public float getPricePerWeight() {
		return pricePerWeight;
	}


	/**public void setPricePerWeight(float pricePerWeight) {
		Candy.pricePerWeight = pricePerWeight;
	}
	*/

}
