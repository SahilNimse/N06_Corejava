package org.tnsif.treeset;

import java.util.*;

public class Products {

	private String productList;

	ArrayList<String> p = new ArrayList<>();

	public void addProductToList(String product) {
		p.add(product);
	}

	public void sortProductList() {
		if (p.isEmpty())
			System.out.println("List is Empty");
		Collections.sort(p);
		Iterator it = p.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

	public String getProductList() {
		return productList;
	}

	public void setProductList(String productList) {
		this.productList = productList;
	}

}
