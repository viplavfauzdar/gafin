/**
 * 
 */
package com.gafinance.db;

/**
 * 
 */
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Viplav
 * 
 */
public class ManageProjects {

	final static Logger logger = LoggerFactory
			.getLogger(ManageProjects.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logger.info("Starting....!");
		ManageProjects mm = new ManageProjects();
		mm.listAll();
	}

	
	public List listAll() {
		logger.info("Listing all.....!");
		Transaction tx = null;
		Session session = SessionFactoryUtil.getInstance().getCurrentSession();
		List project = null;
		try {
			tx = session.beginTransaction();
			project = session.createQuery("from Project").list();
			/*for (Iterator iter = urlmappings.iterator(); iter.hasNext();) {
				Urlmapping urlmapping = (Urlmapping) iter.next();
				logger.debug("{}", urlmapping);
				System.out.println(urlmapping.getUrl());
			}*/
			tx.commit();
			Thread.sleep(1000);			
		} catch (Exception e) {
			if (tx != null && tx.isActive()) {
				try {
					// Second try catch as the roll back could fail as well
					tx.rollback();
				} catch (HibernateException e1) {
					logger.debug("Error rolling back transaction");
				}
			}

		} finally {
			//session.close(); //not needed with sessionfactoryutil
		}
		return project;
	}
	
	public void add(Project project) {
		Transaction tx = null;
		Session session = SessionFactoryUtil.getInstance().getCurrentSession();
		try {
			tx = session.beginTransaction();
			session.save(project);
			tx.commit();
			Thread.sleep(1000);
		} catch (Exception e) {
			if (tx != null && tx.isActive()) {
				try {
					// Second try catch as the rollback could fail as well
					tx.rollback();
				} catch (HibernateException e1) {
					logger.debug("Error rolling back transaction");
				}
			}
		} finally {
			//session.close(); //not needed with sessionfactoryutil
		}		
	}
	
	public void delete(Project project) {
		Transaction tx = null;
		Session session = SessionFactoryUtil.getInstance().getCurrentSession();
		try {
			tx = session.beginTransaction();
			session.delete(project);
			tx.commit();
			Thread.sleep(1000);
		} catch (Exception e) {
			if (tx != null && tx.isActive()) {
				try {
					// Second try catch as the rollback could fail as well
					tx.rollback();
				} catch (HibernateException e1) {
					logger.debug("Error rolling back transaction");
				}				
			}
		}finally {
			//session.close(); //not needed with sessionfactoryutil
		}
	}

	public void update(Project project) {
		Transaction tx = null;
		Session session = SessionFactoryUtil.getInstance().getCurrentSession();
		try {
			tx = session.beginTransaction();
			session.update(project);
			tx.commit();
			Thread.sleep(1000);
		} catch (Exception e) {
			logger.info("Error updating");
			if (tx != null && tx.isActive()) {
				try {
					// Second try catch as the rollback could fail as well
					tx.rollback();
				} catch (HibernateException e1) {
					logger.debug("Error rolling back transaction");
				}				
			}
		}finally {
			//session.close(); //not needed with sessionfactoryutil
		}
	}

}

