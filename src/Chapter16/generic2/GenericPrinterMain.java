package Chapter16.generic2;

import javax.print.DocFlavor.STRING;

public class GenericPrinterMain {

	public static void main(String[] args) {
		GenericPrinter<Powder> PrinterPowder = new GenericPrinter<Powder>();
		PrinterPowder.setMaterial(new Powder());
		Powder powder= PrinterPowder.getMaterial();
		System.out.println(powder);
		
		GenericPrinter<Plastic> PrinterPlastic = new GenericPrinter<Plastic>();
		PrinterPlastic.setMaterial(new Plastic());
		Plastic Plastic= PrinterPlastic.getMaterial();
		System.out.println(Plastic);
		
		//물의 재로는 허용되면 안되지만 제네릭의 특성상 허용하는 모순이 발생한다
		/*
		GenericPrinter<Water> PrinterWater = new GenericPrinter<Water>();
		PrinterWater.setMaterial(new Water());
		System.out.println(PrinterWater);
		*/
		Water water=new Water();
		water.doprinting();
		
	}

}
