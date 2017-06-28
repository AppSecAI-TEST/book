package addressBook;

public class Book {
	private String author,address,country;

	public String getAuthor() {
		author = "Bart Simspon";
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
		
	}

	public String getAddress() {
		
		address = "123 Evergreen St \n Springfield, KY 12345";
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		
		country = "usa";
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setName(String i) {
		
	};
		
	
}
