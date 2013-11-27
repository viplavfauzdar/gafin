/**
 * 
 * @author Viplav Fauzdar
 * created May 08, 2013
 * 
 */
package com.gafinance.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * @author Viplav - This class guarantees that only one single SessionFactory is
 *         instantiated and that the configuration is done thread safe as
 *         singleton. Actually it only wraps the Hibernate SessionFactory. You
 *         are free to use any kind of JTA or Thread transactionFactories.
 */
public class SessionFactoryUtil {

	/** The single instance of hibernate SessionFactory */
	private static SessionFactory sessionFactory;
	private static ServiceRegistry serviceRegistry;
	//final static Logger logger = LoggerFactory.getLogger(SessionFactoryUtil.class);

	/**
	 * disable constructor to guaranty a single instance
	 */
	private SessionFactoryUtil() {
	}

	static {

		try {
			// Annotation and XML
			// sessionFactory = new
			// AnnotationConfiguration().configure().buildSessionFactory();
			Configuration configuration = new Configuration().configure();
			ServiceRegistry serviceRegistry = new
			ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);

			// XML only
			//sessionFactory = new Configuration().configure().buildSessionFactory();
		} catch (Exception he) {
			//logger.error("Error creating Session: " + he);
			throw new ExceptionInInitializerError(he);
		}
	}

	public static SessionFactory getInstance() {
		return sessionFactory;
	}

	/**
	 * Opens a session and will not bind it to a session context
	 * 
	 * @return the session
	 */
	public Session openSession() {
		return sessionFactory.openSession();
	}

	/**
	 * Returns a session from the session context. If there is no session in the
	 * context it opens a session, stores it in the context and returns it. This
	 * factory is intended to be used with a hibernate.cfg.xml including the
	 * following property <property
	 * name="current_session_context_class">thread</property> This would return
	 * the current open session or if this does not exist, will create a new
	 * session
	 * 
	 * @return the session
	 */
	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	/**
	 * closes the session factory
	 */
	public static void close() {
		if (sessionFactory != null)
			sessionFactory.close();
		sessionFactory = null;

	}
}
