package com.mxl.common;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactory {
	//ָ����ȡ�����ļ�·��
	private static String CONFIG_FILE_LOCATION="/hibernate.cfg.xml";
	//ʵ����ThreadLocal��
	private static final ThreadLocal<Session>thread_Local = new ThreadLocal<Session>();
	//ʵ����Configuration��
	private static Configuration configuration = new Configuration();
	//����SessionFactory�ӿ�
	private static SessionFactory sessionFactory;
	//����configFile���Բ���ֵ
	private static String configFile = CONFIG_FILE_LOCATION;
	static {
		try{
			//��ȡĬ�ϵ������ļ�
			configuration.configure(configFile);
			//ʵ����SessionFactory
			sessionFactory = configuration.buildSessionFactory();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	//�����޲ε�HibernateSessionFactory���캯��
	private HibernateSessionFactory(){}
	
	//��ȡSession
	public static Session getSession() throws HibernateException{
		Session session = (Session)thread_Local.get();
		//�ж��Ƿ��Ѿ�����Session
		if(session == null||!session.isOpen()){
			//���SessionFactory����Ϊnull���򴴽�SessionFactory
			if(session == null){
				rebuildSessionFactory();//����rebuildSessionFactory��������SessionFactory
			}
			//�ж�SessionFactory�����Ƿ�Ϊnull��������ǣ����Session
			session = (sessionFactory != null)?sessionFactory.openSession():null;
			thread_Local.set(session);
		}
		return session;
	}
	
	//����SessionFactory
	public static void rebuildSessionFactory(){
		try{
			configuration.configure(configFile);
			sessionFactory = configuration.buildSessionFactory();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//�ر�Session
	public static void closeSession() throws HibernateException{
		Session session = (Session) thread_Local.get();
		thread_Local.set(null);
		if(session != null){
			session.close();
		}
	} 
	
	//SessionFactory�����getXxx��������
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	
	//configFile���Ե�setXxx��������
	public static void setConfigFile(String configFile){
		HibernateSessionFactory.configFile = configFile;
		sessionFactory = null;
	}
	
	//configFile���Ե�getXxx��������
	public static Configuration getConfiguration(){
		return configuration;
	}
	}
