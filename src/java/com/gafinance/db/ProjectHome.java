package com.gafinance.db;

// Generated Jul 15, 2013 1:05:23 PM by Hibernate Tools 3.4.0.CR1

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Home object for domain model class Project.
 * @see com.gafinance.db.Project
 * @author Hibernate Tools
 */
public class ProjectHome {

	private static final Log log = LogFactory.getLog(ProjectHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			//return (SessionFactory) new InitialContext()
			//		.lookup("SessionFactory");
			Configuration configuration = new Configuration().configure();
			ServiceRegistry serviceRegistry = new
			ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
			return configuration.buildSessionFactory(serviceRegistry);
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException(
					"Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Object obj){
		persist((Project)obj);
	}
	
	public void persist(Project transientInstance) {
		log.debug("persisting Project instance");
		try {
			sessionFactory.getCurrentSession().beginTransaction();
			sessionFactory.getCurrentSession().persist(transientInstance);
			sessionFactory.getCurrentSession().getTransaction().commit();
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Project instance) {
		log.debug("attaching dirty Project instance");
		try {
			sessionFactory.getCurrentSession().beginTransaction();
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			sessionFactory.getCurrentSession().getTransaction().commit();
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	@SuppressWarnings("deprecation")
	public void attachClean(Project instance) {
		log.debug("attaching clean Project instance");
		try {
			sessionFactory.getCurrentSession().beginTransaction();
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			sessionFactory.getCurrentSession().getTransaction().commit();
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Project persistentInstance) {
		log.debug("deleting Project instance");
		try {
			sessionFactory.getCurrentSession().beginTransaction();
			sessionFactory.getCurrentSession().delete(persistentInstance);
			sessionFactory.getCurrentSession().getTransaction().commit();
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Project merge(Project detachedInstance) {
		log.debug("merging Project instance");
		try {
			Project result = (Project) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Project findById(java.lang.Integer id) {
		log.debug("getting Project instance with id: " + id);
		try {
			sessionFactory.getCurrentSession().beginTransaction();
			Project instance = (Project) sessionFactory.getCurrentSession()
					.get("com.gafinance.db.Project", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			sessionFactory.getCurrentSession().getTransaction().commit();
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Project instance) {
		log.debug("finding Project instance by example");
		try {
			sessionFactory.getCurrentSession().beginTransaction();
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.gafinance.db.Project")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			sessionFactory.getCurrentSession().getTransaction().commit();
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
