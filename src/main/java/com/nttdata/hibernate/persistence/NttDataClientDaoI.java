package com.nttdata.hibernate.persistence;

import java.util.List;

/**
 * HIBERNATE - TALLER 1
 * 
 * DAO of NTTDATA_CLIENT
 * 
 * @author DarknessYamii
 *
 */
public interface NttDataClientDaoI extends CommonDaoI<NttDataClient>  {

	/**
	 * Search by Name and firstName
	 * @param name, firstName
	 * @return List<NttDataClient>
	 */
	
	public List<NttDataClient> searchByNameAndFirstName(final String name, final String firstName);
	
}
