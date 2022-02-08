package Infytq;

class Customer0 {
	public String customerId;
	public String customerName;
	public long contactNumber;
	public String address;
	Customer0(String cId, String cName, long contact, String add) {
		customerId = cId;
		customerName = cName;
		contactNumber = contact;
		address = add;
	}
}

public class ParametrizedCOnstrutor {
	
		public static void main(String args[]) {
			Customer0 customer1 = new Customer0("130", "shetty", 9361451152L,"Theni");
			System.out.println(customer1.customerId);
			System.out.println(customer1.customerName);
			System.out.println(customer1.contactNumber);
			System.out.println(customer1.address);
		
	}


}
