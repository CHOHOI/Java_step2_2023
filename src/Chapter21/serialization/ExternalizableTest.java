package Chapter21.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Dog implements Externalizable{
	
	String name;
	
	public Dog() {
		
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name=in.readUTF();
		
	}
	@Override
	public String toString() {
		
		return name;
	}
	
}
public class ExternalizableTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//Externalizable: 인터페이스 Externalizable을 사용하여 내부의 내용을 쉽게 조작함
		//writeEexternal()/ readEexternal()
		Dog myDog=new Dog();
		myDog.name="달포";
		
		FileOutputStream fos=new FileOutputStream("external.out");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		//직렬화
		try (fos;oos){
			oos.writeObject(myDog);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		FileInputStream fis=new FileInputStream("external.out");
		ObjectInputStream ois=new ObjectInputStream(fis);
		//역직렬화
		try (fis;ois){
			Dog dog=(Dog)ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
