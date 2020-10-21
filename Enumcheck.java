enum Shirtsize
{
	S,M,L,XL;
	private String Shirtsize()
	{
		System.out.println("ctr is called");
	}
}

class Shirt
{
	private String brand;
	private Shirtsize size;
	public Shirt(String brand, int size, double price, String color) {
		super();
		this.brand = brand;
		Shirtsize = size;
		this.price = price;
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	@Override
	public String toString() {
		return "Shirt [brand=" + brand + ", size=" + size + ", price=" + price + ", color=" + color + "]";
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		Shirtsize = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	private double price;
	private String color;
}
public class Enumcheck {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Shirt s=new Shirt("pe",20,1000,"blue");
		System.out.println(s);

	}

}
