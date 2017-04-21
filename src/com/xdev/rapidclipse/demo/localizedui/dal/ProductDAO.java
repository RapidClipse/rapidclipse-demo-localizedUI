
package com.xdev.rapidclipse.demo.localizedui.dal;

import com.xdev.dal.JPADAO;
import com.xdev.rapidclipse.demo.localizedui.entities.Product;
import java.lang.Integer;

/**
 * Home object for domain model class Product.
 * 
 * @see Product
 */
public class ProductDAO extends JPADAO<Product, Integer> {
	public ProductDAO() {
		super(Product.class);
	}
}