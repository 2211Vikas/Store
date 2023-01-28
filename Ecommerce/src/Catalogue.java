
public class Catalogue {
	private Product [] listofAllProducts;

	public Product [] getListofAllProducts() {
		Product product1 = new Product();
		product1.setProductId("1");
		product1.setProductName("Product 1");
		product1.setCost("100");
		Product product2 = new Product();
		product2.setProductId("2");
		product2.setProductName("Product 2");
		product2.setCost("200");
		Product product3 = new Product();
		product3.setCost("20");
		product3.setProductName("Pen");
		product3.setProductId("131");
		Product product4 = new Product();
		product4.setCost("120");
		product4.setProductName("Paper");
		product4.setProductId("141");
		listofAllProducts =new Product[4];
		listofAllProducts[0]=product1;
		listofAllProducts[1]=product2;
		listofAllProducts[2]=product3;
		listofAllProducts[3]=product4;
		return listofAllProducts;
	}

	public void setListofAllProducts(Product [] listofAllProducts) {
		this.listofAllProducts = listofAllProducts;
	}

}
