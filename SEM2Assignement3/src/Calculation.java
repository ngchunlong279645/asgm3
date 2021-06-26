
public class Calculation {
	private double discount=10;
	private double qq=2;
	
	public void setDiscount(double d) {
		this.discount=d;
	}
	
	public void setQuantity(double q) {
		this.qq=q;
	}

	public double totalPrice(double price, int quantity) {	//constructor with 2 argument
		if(quantity<=qq) {
			double totalPrice=price*quantity;
			return totalPrice;
		}
		else {
			double totalPrice=(price*quantity)*(100-discount)/100;
			return totalPrice;
		}	
	
	}
}

