package Chapter21.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable{

	private static final long serialVersionUID = 1L;
	
	String name;
	String job;
	
	// transient : ����ȭ ���� �ʰڴ� (byte�� ��ȯ���� �ʰڴ�.)
	// transient String number; 
	
	public Person() {
	
	}

	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}

	@Override
	public String toString() {
	
		return name +", "+ job;
	}
	
	
	
}

public class SerializationTest {

	public static void main(String[] args) {
	
		Person personAhn = new Person("ȫ�浿","��ǥ�̻�");
		Person personkim = new Person("�迬��","���̻�");

		/*
		ObjectOutputStream : �����̳� ��Ʈ��ũ�� �����͸� ����
		writeObject() : ����ȭ �Լ�
		*/
		// ----------------------����ȭ---------------------		
		try (FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			// ����ȭ
			oos.writeObject(personAhn);
			oos.writeObject(personkim);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// ----------------------������ȭ---------------------
		// ������ �����͸� ���̳ʸ�ȭ �� �� ������ ���� �ʿ��ϴ�.
		// ObjectInputStream : �����̳� ��Ʈ��ũ�� ���� ���� ���� ����ȭ�� �����͸� �ٽ� ������� ������ ���� 
		// readObjet() : ������ȭ�� ���Ǵ� �޼ҵ� 
		// ����ȭ �ϱ� ���� ��ü�� ĳ�����������
		try (FileInputStream fis = new FileInputStream("serial.out");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			
			// ������ȭ
			Person p1 = (Person) ois.readObject();
			Person p2 = (Person) ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}// main

}

