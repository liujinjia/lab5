import java.util.*;
public class Checkout {
	
	Vector<DessertItem> list = new Vector<DessertItem>();
	
	public Checkout() {
		// TODO Auto-generated constructor stub
		
		list = new Vector<DessertItem>();
		
	}
	public int numberOfItems(){
		int num = list.size();
		return num;
	}
	public void enterItem(DessertItem item){
		
		list.add(item);
		
		
	}
	public void clear(){
		list.clear();
		
	}
	public int totalCost(){
		
		int totalCost = 0;
		for (DessertItem item: list){
			totalCost = (int) (totalCost + item.getCost());
		}
		
		return totalCost;
	}
	public int totalTax(){
		int totalTax = 0;
		totalTax = (int ) Math.round(totalCost() * DessertShoppe.taxRate / 100);
		return totalTax;
	}
	public String toString(){
		String res ="";
		res = DessertShoppe.storeName + "\n";
		res = res + "------------------" + "\n";
			
		for (DessertItem item : list) {
		if (item instanceof Candy){
			res = res + ((Candy)item).getWeightCandy() + " lbs. @" + DessertShoppe.cents2dollarsAndCents((int)((Candy)item).getPricePerWeight())
			          + " /lb." + "\n";
			res = res + item.getName() + "  " + DessertShoppe.cents2dollarsAndCents((int)item.getCost()) + "\n";
		}
		else if (item instanceof Cookie){
			res = res + ((Cookie) item).getNum() + " @ " + DessertShoppe.cents2dollarsAndCents(((Cookie)item).getPricePerDozen()) + " /dz." 
		              + "\n";
			
			res = res + item.getName() + "  " + DessertShoppe.cents2dollarsAndCents((int)item.getCost()) + "\n";
		}
		else if (item instanceof IceCream){
			res = res + item.getName() + "  " + DessertShoppe.cents2dollarsAndCents((int)item.getCost()) + "\n";
		}
		else if (item instanceof Sundae){
			res = res +  ((Sundae)item).getToppingName() + " Sundae with" + "\n";
			res = res + item.getName() + "  " + DessertShoppe.cents2dollarsAndCents((int)item.getCost()) + "\n";
		}
		}
		res = res + "\n";
		res = res + "Tax      " + DessertShoppe.cents2dollarsAndCents(totalTax()) + "\n";
		res = res + "Total Cost    " + DessertShoppe.cents2dollarsAndCents(totalCost() + totalTax()) + "\n";
		
		
		
		return res;
		
	}
	
	
	

}
