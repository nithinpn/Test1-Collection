package com.test.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Product {
	int product_id;
	String Product_description;
	double product_price;
	String product_brand;
	public Product(int product_id, String product_description, double product_price, String product_brand)
	{
		super();
		this.product_id = product_id;
		Product_description = product_description;
		this.product_price = product_price;
		this.product_brand = product_brand;
	}
	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", Product_description=" + Product_description + ", product_price="
				+ product_price + ", product_brand=" + product_brand + "]";
	}
	/**
	 * @return the product_id
	 */
	public int getProduct_id() {
		return product_id;
	}
	/**
	 * @param product_id the product_id to set
	 */
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	/**
	 * @return the product_description
	 */
	public String getProduct_description() {
		return Product_description;
	}
	/**
	 * @param product_description the product_description to set
	 */
	public void setProduct_description(String product_description) {
		Product_description = product_description;
	}
	/**
	 * @return the product_price
	 */
	public double getProduct_price() {
		return product_price;
	}
	/**
	 * @param product_price the product_price to set
	 */
	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}
	/**
	 * @return the product_brand
	 */
	public String getProduct_brand() {
		return product_brand;
	}
	/**
	 * @param product_brand the product_brand to set
	 */
	public void setProduct_brand(String product_brand) {
		this.product_brand = product_brand;
	}
	

}


 class Test
{
	 public static void main(String[] args)
	{
		List<Product> productList= new ArrayList<Product>();
		productList.add(new Product(10,"Phone", 15000, "Lg"));
		productList.add(new Product(12,"Phone", 28000, "Apple"));
		productList.add(new Product(14,"Phone", 16999, "Samsung"));
		productList.add(new Product(21,"TV", 32500, "Sony"));
		productList.add(new Product(19,"Laptop", 34500, "Toshiba"));
		productList.add(new Product(17,"Phone", 9500, "Redmi"));
		productList.add(new Product(33,"Phone", 19999, "Oppo"));
		productList.add(new Product(97,"Shoe", 14999, "Nike"));
		productList.add(new Product(26,"TV", 12999, "Toshiba"));
		productList.add(new Product(41,"Shirt", 999, "Tamaris"));
		
		
		System.out.println("Items filtered by product_brands starts with 'T'");
		
		productList.stream().filter(p->p.product_brand.startsWith("T")).forEach(p->System.out.println(p));
		
		
		
		System.out.println("Sorted by product_price ");
		
	
		
		productList.stream().sorted(Comparator.comparingDouble(Product :: getProduct_price).reversed()).forEach(p->System.out.println(p));
	
	}
	
}