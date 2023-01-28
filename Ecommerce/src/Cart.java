
public class Cart {
	private String CartId;
	public String getCartId() {
		return CartId;
	}

	public void setCartId(String cartId) {
		CartId = cartId;
	}

	private Product[] ListofProduct;

	public Product[] getListofProduct() {
		return ListofProduct;
	}

	public void setListofProduct(Product[] listofProduct) {
		ListofProduct = listofProduct;
	}
	public Boolean checkOut() {
		return true;
	}

}
