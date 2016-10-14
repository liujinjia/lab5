
public class DessertShoppe {
   static double taxRate = 6.5;
    static String storeName = "M & M Dessert Shoppe";
    int maxItemName = 50;
    int widthDisplayItem = 8;
  
    
    public static String cents2dollarsAndCents(int cents){
    	if (cents<0){
    		return null;
    	}
    	String res = "";
    	
    	while(cents > 0){
    		
    		if(res.length() == 2){
    			res = (cents%10)+ "."+ res ;
    		}
    		else
    		{
    			res = (cents%10) + res;
    		}
    		cents = cents / 10;
    	}
    	if(res.length() == 2){
    		res = "0." + res; 
    	}
    	
    	return res;
    }
  
}
