package Chapter12.MultiInterface;

public class Customermain {

	public static void main(String[] args) {

      Customer customer=new Customer();
      System.out.println("---------Buy---------");
      Buy buyer=customer;
      buyer.buy();
      buyer.order();
      
      System.out.println("---------Buy---------");
      Sell seller=customer;
      seller.sell();
      seller.sellorder();
      //seller.order();
      //seller �θ� / Customer �ڽ�
      if(seller instanceof Customer) {
    	  Customer customer2=(Customer)seller;
    	  System.out.println("--Down Chasting");
    	  customer2.buy();
    	  customer2.sell();
    	  customer2.sellorder();
      }
      
      customer.order();

	}

}
