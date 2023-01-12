package Chapter09;

public class StrawBerry extends	Berry {
	public String color;
	public int price;
	
	// setter
	public void set3(String a, int b) {
		color = a;
		price = b;
	}

	// getter
	public void Disp3() {
		System.out.println("»ö±ò" + color);
		System.out.println("°¡°Ý" + price);
	}
}
