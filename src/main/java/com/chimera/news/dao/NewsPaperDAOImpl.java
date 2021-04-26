package com.chimera.news.dao;

import java.util.Objects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.chimera.news.entity.NewsPaperEntity;
@Repository
@Component
public class NewsPaperDAOImpl implements NewsPaperDAO {

	@Autowired
	private SessionFactory factory;

	public NewsPaperDAOImpl() {
		super();
		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	public boolean saveNewspaperInfo(NewsPaperEntity entity) {
		System.out.println("invoked saveNewspaperInfo");
		Session session = null;
		try {
			session = factory.openSession();
			session.beginTransaction();
			session.save(entity);
			session.getTransaction().commit();
			System.out.println("NewspaperDTO is saved");
		}catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(session)) {
				session.close();
				System.out.println("session is closed");
			} else {
				System.out.println("session is not closed");
			}
		}
		return true;
	}

}
