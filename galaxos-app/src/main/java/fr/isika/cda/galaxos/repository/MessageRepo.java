package fr.isika.cda.galaxos.repository;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.isika.cda.galaxos.model.Message;

@Stateless
public class MessageRepo {

	@PersistenceContext
	private EntityManager manager;
	
	public Message envoyer (Message msg)
	{
		try {
			this.manager.persist(msg);
			return msg;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
	
}
