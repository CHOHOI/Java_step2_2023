package Chapter16.generic2;

public class ThreeDPrinterMain {

	public static void main(String[] args) {
		//规过1
		ThreeDPrinter printerPowder=new ThreeDPrinter();
		Powder p1=new Powder();
		printerPowder.setMaterial(p1);
		System.out.println(p1);
		//规过2
		Powder p2=(Powder)printerPowder.getMaterial();
		System.out.println(p2);
		
		ThreeDPrinter printerPlastic = new ThreeDPrinter();
		Plastic p3= new Plastic();
		printerPlastic.setMaterial(p3);
		System.out.println(p3);
		
		Plastic P4= (Plastic)printerPlastic.getMaterial();
		System.out.println(P4);
	}

}
