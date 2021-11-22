package com.nttdata.hibernate;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;

import com.nttdata.hibernate.persistence.NttDataClient;
import com.nttdata.hibernate.services.NttDataClientManagementServiceI;
import com.nttdata.hibernate.services.NttDataClientManagementServiceImpl;

/**
 * Hello world!
 *
 */
public class NttDataHibernateMain 
{
    public static void main( String[] args )
    {
    	// Open Session
        final Session session = NttDataHibernateUtil.getSessionFactory().openSession();
        
        // Init servicies
        final NttDataClientManagementServiceI clientService = new NttDataClientManagementServiceImpl(session);
        
        // Auditory
        final String updatedUser = "NTTDATAINFO_SYS";
        final Date updatedDate = new Date();
        
        // Generate Client
        final NttDataClient clientA = new NttDataClient();
        clientA.setName("Andres");
        clientA.setFirstName("Ruiz");
        clientA.setSecondName("Delgado");
        clientA.setDNI("15456782T");
        clientA.setUpdatedDate(updatedDate);
        clientA.setUpdatedUser(updatedUser);
        
        
        clientService.insertNewClient(clientA);
        
        // Consults 
        List<NttDataClient> clients = clientService.searchByNameAndFirstName("Andres", "Ruiz");
        for (final NttDataClient client : clients) {
        	System.out.println(client.getName() + " | " + client.getFirstName());
        }
    
        session.close();
    
    }
}
