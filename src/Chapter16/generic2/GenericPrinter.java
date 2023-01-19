package Chapter16.generic2;

public class GenericPrinter <T> extends Meterial {

		private T material;

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return material.toString();
		}

		public T getMaterial() {
			return material;
		}

		public void setMaterial(T material) {
			this.material = material;
		}

		@Override
		public void doprinting() {
			// TODO Auto-generated method stub
			
		}

	
		
		
}
