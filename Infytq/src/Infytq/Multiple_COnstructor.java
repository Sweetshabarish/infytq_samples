package Infytq;

class Customr {
	public String customerId;
	public String customerName;
	public long contactNumber;
	public String address;
	public Customr() {
		System.out.println("Parameterless constructor called");
	}
	public Customr(String cId, String cName, long contact, String add) {
		System.out.println("Parameterized constructor called");
		customerId = cId;
		customerName = cName;
		contactNumber = contact;
		address = add;
	}
}

public class Multiple_COnstructor {

		public static void main(String args[]) {
			Customr customer1 = new Customr("C103", "Jacob", 5648394590L,"13th Street, New York");
			Customr customer2 = new Customr();
		
	}


}
