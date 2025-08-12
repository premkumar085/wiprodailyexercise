package com.wipro.hibarnatedemoo.repo;



import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.wipro.hibarnatedemoo.entity.Movie1;
import com.wipro.hibarnatedemoo.util.HibernateUtil;

public class MovieRepo {
	
	 public static void updateMovie()
	    {
	    	
	    	Scanner sc= new Scanner(System.in); 
	    	
	    	System.out.println("Please enter movie id");
	    	int id= sc.nextInt();
	    	System.out.println("Please enter movie name");
	    	String movieName= sc.next();
	    	System.out.println("Please enter movie language");
	    	String movieLanguage= sc.next();
	    	System.out.println("Please enter movie rating");
	    	Double movieRating= sc.nextDouble();
	    	Movie1 m= new Movie1(id,movieName,movieLanguage,movieRating);
	    	save(m);
	    }
	    
	 public static void createMovie()
	    {
	    	Scanner sc= new Scanner(System.in); 
	    	
	    	System.out.println("Please enter movie name");
	    	String movieName= sc.next();
	    	System.out.println("Please enter movie language");
	    	String movieLanguage= sc.next();
	    	System.out.println("Please enter movie rating");
	    	Double movieRating= sc.nextDouble();
	    	Movie1 m= new Movie1(movieName,movieLanguage,movieRating);
	    	save(m);
	    	
	    	
	    }
	    //insert and update
	 public static void save(Movie1 m)
	    {
	    	Session session= HibernateUtil.getSessionFactory().getCurrentSession();
	    	Transaction transaction=session.beginTransaction();
	    	
	    	if(m.getId()!=0)//update
	    	{
	    		Movie1 m1=findById(m.getId());
	    		m1.setImdbRating(m.getImdbRating());
	    		m1.setMovieLanguage(m.getMovieLanguage());
	    		m1.setMovieName(m.getMovieName());
	    		session.persist(m1);
	    	}
	    	else {//insert
	    	   	session.persist(m);
	    	}
	    	transaction.commit();     	
	    	
	    }
	    
	 public static Movie1 findById(int id)
	    {
	     	Session session= HibernateUtil.getSessionFactory().getCurrentSession();
	    	Transaction transaction=session.beginTransaction();
	    	Movie1 m=session.find(Movie1.class, id);
	    	return m;
	    	
	    }
	    
	 public static Movie1 deleteById(int id)
	    {
	     	Session session= HibernateUtil.getSessionFactory().getCurrentSession();
	    	Transaction transaction=session.beginTransaction();
	    	Movie1 m=session.find(Movie1.class, id);
	    	session.remove(m);
	    	transaction.commit();
	    	return m;
	    	
	    }
	    
	 public static List<Movie1> findAll()
	    {
	    	Session session= HibernateUtil.getSessionFactory().getCurrentSession();
	    	Transaction transaction=session.beginTransaction();
	    	//sql=>db tables
	    	//hql->java entities
	    	String hqlQuery="from Movie1";//select * from movie
	    	Query query=session.createQuery(hqlQuery);
	    	List<Movie1> list=query.list();
	    	return list;
	    	
	    	
	    	
	    }
	    
	 public static List<String> findAllMovieNames()
	    {
	    	Session session= HibernateUtil.getSessionFactory().getCurrentSession();
	    	Transaction transaction=session.beginTransaction();
	    	//sql=>db tables
	    	//hql->java entities
	    	String hqlQuery="SELECT movieName from Movie1";//select movie_name from movie
	    	Query query=session.createQuery(hqlQuery);
	    	List<String> list=query.list();
	    	return list;   	
	    	
	    	
	    }
	    
	 public static List<Movie1> findByMovieLanguages(String movieLanguage)
	    {
	    	Session session= HibernateUtil.getSessionFactory().getCurrentSession();
	    	Transaction transaction=session.beginTransaction();
	    	//sql=>db tables
	    	//hql->java entities
	    	String hqlQuery="from Movie1 where movieLanguage=:mLanguage";//select *  from movie where movie_language=''
	    	Query query=session.createQuery(hqlQuery,Movie1.class);
	    	query.setParameter("mLanguage",movieLanguage);
	    	List<Movie1> list=query.list();
	    	return list;   	
	    	
	    	
	    }

}
