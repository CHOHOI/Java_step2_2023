package Chapter16.generic1;

public class GenMain {

	public static void main(String[] args) {
		
		Gen gen=new Gen();
		
		//������
		Integer[] iArr= {1,2,3,4,5};
		//������
		Double[] dArr= {0.1,0.2,0.3,0.4,0.5};
		//������
		Character [] cArr= {'a','b','c','d','e'};
		
		gen.printArr(iArr);
		gen.printArr(dArr);
		gen.printArr(cArr);
	}

}
