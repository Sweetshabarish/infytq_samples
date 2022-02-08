package Infytq;

public class Parameter_passing_tech {
	
		private long contactNumber;


		public void changeValue(int value1, int value2) {
			value1 = value1 + value2;
			value2 = value1 - value2;
			System.out.println(value1 + " " + value2);
		}
		public void updateContact(Parameter_passing_tech demo) { 
		     demo.contactNumber = 9786758497L; 
		}


		public static void main(String args[]) {
			 Parameter_passing_tech demo = new  Parameter_passing_tech();
			int x = 20;
			int y = 10;
			System.out.println(x + " " + y);
			demo.changeValue(x, y);
			System.out.println("After calling changeValue function");
			System.out.println(x + " " + y);
			System.out.println();
			demo.contactNumber = 7656434567L; 
			System.out.println(demo.contactNumber); 
			demo.updateContact(demo); 
			System.out.println("After calling updateContact method"); 
			System.out.println(demo.contactNumber); 
		}



}
