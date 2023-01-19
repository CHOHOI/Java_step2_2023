package Chapter15;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.StringTokenizer;

public class NewPersonMain {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Person person1=new Person();
		System.out.println(person1);
		
		Class pClass=Class.forName("Chapter15.Person");
		System.out.println(pClass);
		Person person2=(Person)pClass.newInstance();
		System.out.println(person2);
		
		//================================================
		//String Ŭ������ ������������
		
		Class strClass=Class.forName("java.lang.String");
		System.out.println(strClass);
		
		//StringŬ������ �����ڵ� ����
		Constructor[] cons=strClass.getConstructors();
		for(Constructor c : cons) {
			System.out.println(c);
		}
		
		System.out.println("====================================");
		Field [] field=strClass.getDeclaredFields();
		for(Field f:field) {
			System.out.println(f);
		}
		
		Method[] method=strClass.getMethods();
		for(Method m:method) {
			System.out.println(m);
		}
		
		//=======================================
		String str="Have,a,Nice Day";
		
		//Tokenlizers
		//StringTokenizer(1,2,3)
		//1:����� String ���ڿ�
		//2: �и��ϴ� ����
		//3: �ڸ��� ������ ǥ���Ұ��� ����
		StringTokenizer obj=new StringTokenizer(str,",",true);
		while(obj.hasMoreTokens()) {
			String t=obj.nextToken();
			System.out.println(t);
		}
		
	}

}
