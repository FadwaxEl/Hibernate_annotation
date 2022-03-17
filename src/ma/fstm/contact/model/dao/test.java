package ma.fstm.contact.model.dao;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import ma.fstm.contact.model.bo.Contact;
import ma.fstm.contact.model.bo.Type;

public class test {

	public static void main(String[] args) {
		Type T = new Type();
		//T.setTitre("Famille");
		T.setId(Long.valueOf(2));
		/*ConnexionHibernat.getSession();
		
		//T.setId(Long.valueOf(2));
		 SessionFactory sessionFactory = ConnexionHibernat.getSession();
		    Session session = sessionFactory.openSession();
		     session.beginTransaction();
				 session.save(T);
		 System.out.println("Inserted Successfully");
				session.getTransaction().commit();
				    session.close();
				    sessionFactory.close();*/
		DAOcontact dao = new DAOcontact();
		/*Collection<Contact> lestypes = dao.Retrieve();
		for (Contact type : lestypes) {
	       System.out.println(type.getId()+":"+type.getNom());		
		}*/
		/*Contact c= new Contact();
		c.setId(Long.valueOf(8));
		c.setNom("fadma");
		dao.Update(c);*/
	   /* Contact C= new Contact();
	    C.setId(Long.valueOf(2));
	    C.setNom("chouchou");
	    dao.Update(C);*/
	    
		//c=dao.Create(new Contact("Mama","Mana","032659874",T));
	  // System.out.println("l'id"+c.getId());
		//	System.out.println(dao.getId("Famille").getId());
				    
				 
	}
}
