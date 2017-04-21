
package com.xdev.rapidclipse.demo.localizedui.dal;

import com.xdev.dal.JPADAO;
import java.lang.Integer;
import com.xdev.rapidclipse.demo.localizedui.entities.Supplier;

/**
 * Home object for domain model class Supplier.
 * 
 * @see Supplier
 */
public class SupplierDAO extends JPADAO<Supplier, Integer> {
	public SupplierDAO() {
		super(Supplier.class);
	}
}