
public class Seller extends User{
	private Product [] productsListed;
	public Boolean verifyUser() {
		return true;
	}
	public Product [] getProductsListed() {
		Product product1 = new Product();
		
		product1.setCost("200");
		product1.setProductName("Books");
		product1.setProductId("111");
		Product product2 = new Product();	
		product2.setCost("220");
		product2.setProductName("Notes");
		product2.setProductId("121");
		Product product3 = new Product();
		product3.setCost("20");
		product3.setProductName("Pen");
		product3.setProductId("131");
		Product product4 = new Product();
		product4.setCost("120");
		product4.setProductName("Paper");
		product4.setProductId("141");
		productsListed = new Product[4];
		productsListed[0]=product1;
		productsListed[1]=product2;
		productsListed[2]=product3;
		productsListed[3]=product4;
		
		return productsListed;
	}
	public void setProductsListed(Product [] productsListed) {
		this.productsListed = productsListed;
	}

}
