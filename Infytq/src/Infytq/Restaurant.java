package Infytq;
/**Array**/
 class Restaurant {
	private String restaurantName;
	private long restaurantContact;
	private String restaurantAddress;
	private float rating;
	
	public Restaurant(String name, long restaurantContact, String restaurantAddress, float rating) {
	this.restaurantName = name;
	this.restaurantContact = restaurantContact;
	this.restaurantAddress = restaurantAddress;
	this.rating = rating;
	}
	
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public long getRestaurantContact() {
		return restaurantContact;
	}
	public void setRestaurantContact(long restaurantContact) {
		this.restaurantContact = restaurantContact;
	}
	public String getRestaurantAddress() {
		return restaurantAddress;
	}
	public void setRestaurantAddress(String restaurantAddress) {
		this.restaurantAddress = restaurantAddress;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public void displayRestaurantDetails() {
	System.out.println("Displaying restaurant details \n***************");
	System.out.println("Restaurant Name : "+this.restaurantName);
	System.out.println("Restaurant Rating : "+this.rating);
	System.out.println("Restaurant Contact : "+this.restaurantContact);
	System.out.println("Restaurant Address : "+this.restaurantAddress);
	System.out.println();
	}
}
