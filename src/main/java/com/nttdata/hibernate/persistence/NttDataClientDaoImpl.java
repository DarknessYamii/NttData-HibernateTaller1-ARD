package com.nttdata.hibernate.persistence;

import java.util.List;

import org.hibernate.Session;

/**
 * HIBERNATE - TALLER 1
 * 
 * DAO of table NTTDATA_CLIENT
 * 
 * @author DarknessYamii
 *
 */
public class NttDataClientDaoImpl extends CommonDaoImpl<NttDataClient> implements NttDataClientDaoI {

	/** Session Connection BBDD */
	private Session session;

	/**
	 * Constructor Method
	 */
	public NttDataClientDaoImpl(Session session) {
		super(session);
		this.session = session;
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<NttDataClient> searchByNameAndFirstName(final String name, final String firstName) {
		// Verify if session is working
		if (!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}
		// Get every client with name and firstName
		final List<NttDataClient> clientList = session.createQuery("FROM NttDataClient WHERE NAME='" + name	+"' AND FIRST_NAME='" +firstName + "'").list();
		return clientList;
	}


}
