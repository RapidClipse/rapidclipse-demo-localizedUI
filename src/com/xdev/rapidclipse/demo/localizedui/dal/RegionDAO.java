
package com.xdev.rapidclipse.demo.localizedui.dal;

import com.xdev.dal.JPADAO;
import com.xdev.rapidclipse.demo.localizedui.entities.Region;

/**
 * Home object for domain model class Region.
 * 
 * @see Region
 */
public class RegionDAO extends JPADAO<Region, Integer> {
	public RegionDAO() {
		super(Region.class);
	}
}