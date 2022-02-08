package Infytq;

class Customer5 {
	String customerName;

	public void payBill(double totalPrice, double discount) {
		System.out.println("Calculating final amount to be paid.....");
		double priceAfterDiscount = totalPrice * (1 - (discount / 100));
		System.out.println("Hi " + customerName
				+ ", your final bill amount after discount is "
				+ (int) (priceAfterDiscount * 100) / 100.0);
	}

}

public class Tester3 {
	public static void main(String args[]) {
		Customer5 customer = new Customer5();
		customer.customerName = "Jack";
		customer.payBill(500, 5);
	}
}