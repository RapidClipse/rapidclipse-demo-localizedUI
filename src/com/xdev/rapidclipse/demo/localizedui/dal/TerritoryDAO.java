
package com.xdev.rapidclipse.demo.localizedui.dal;

import com.xdev.dal.JPADAO;
import com.xdev.rapidclipse.demo.localizedui.entities.Territory;

/**
 * Home object for domain model class Territory.
 * 
 * @see Territory
 */
public class TerritoryDAO extends JPADAO<Territory, String> {
	public TerritoryDAO() {
		super(Territory.class);
	}
}