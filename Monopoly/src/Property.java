import java.util.*;
public class Property 
{
	private String name;
	private String color;
	private int price;
	private int rent;
	private int houseNum;
	private int housePrice;
	private String owner;
	private int position;

	public Property(String n, String c, int p,int r, int hN, int hP, String o, int pos)
	{
		name = n;
		color = c;
		rent = r;
		price = p;
		houseNum = hN;
		housePrice = hP;
		owner = o;
		position = pos;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getRent() {
		return rent;
	}
	public void setRent(int rent) {
		this.rent = rent;
	}
	public int getHouseNum() {
		return houseNum;
	}
	public void setHouseNum(int houseNum) {
		this.houseNum = houseNum;
	}
	public int getHousePrice() {
		return housePrice;
	}
	public void setHousePrice(int housePrice) {
		this.housePrice = housePrice;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

}

