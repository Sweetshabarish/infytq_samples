package Infytq;

public class thismethod {
	
		public String thismethodId;
		public String thismethodName;
		public long contactNumber;
		public String address;
		public thismethod() {
			System.out.println("Parameterless constructor called");
		}
		public thismethod(String thismethodId, String thismethodName, long contactNumber,
				String address) {
			// this() is used to invoke the constructor of the current class
			// Since no parameters are specified, parameterless constructor will be invoked
			this();
			this.thismethodId = thismethodId;
			this.thismethodName = thismethodName;
			this.contactNumber = contactNumber;
			this.address = address;
		}
		public void displaythismethodName() {
			System.out.println("thismethod Name : " + thismethodName);
		}
		public void displaythismethodDetails() {
	        System.out.println("Displaying thismethod details \n***********");
			System.out.println("thismethod Id : " + thismethodId);
			this.displaythismethodName();
			System.out.println("Contact Number : " + contactNumber);
			System.out.println("Address : " + address);
		}
	


}
