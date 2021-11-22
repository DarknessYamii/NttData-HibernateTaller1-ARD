package com.nttdata.hibernate.services;

import java.util.List;

import com.nttdata.hibernate.persistence.NttDataClient;

/**
 * HIBERNATE - TALLER 1
 * 
 * Interface of service Client
 * 
 * @author DarknessYamii
 *
 */
public interface NttDataClientManagementServiceI {

	/**
	 * Insert new client
	 * 
	 * @param newClient
	 */
	public void insertNewClient(final NttDataClient newClient);
	
	/**
	 * Update a client 
	 * 
	 * @param updatedPlayer
	 */
	public void updatePlayer(final NttDataClient updatedPlayer);
	
	/**
	 * Delete a client
	 * 
	 * @param deletedPlayer
	 */
	public void deletePlayer(final NttDataClient deletedPlayer);
	
	/**
	 * Search by ID a Client
	 * 
	 * @param playerID
	 */
	public NttDataClient searchById(final Long ID);
	
	/**
	 * Get every client
	 * 
	 * @param ID
	 * 
	 */
	
	public List<NttDataClient> searchAll();
	
	/**
	 * Search by Name and firstName a client
	 * @param name
	 * @param firstName
	 * @return List<NttDataClient>
	 */
	public List<NttDataClient> searchByNameAndFirstName(final String name, final String firstName);
	
}

