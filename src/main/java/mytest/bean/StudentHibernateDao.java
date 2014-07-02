package mytest.bean;

import java.util.Collection;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class StudentHibernateDao extends HibernateDaoSupport implements StudentDAO {

	public Student get(Long id) {
        return (Student) getSession().get(Student.class, id);
    }

    @Override
    protected HibernateTemplate createHibernateTemplate(SessionFactory sessionFactory) {
        HibernateTemplate result = super.createHibernateTemplate(sessionFactory);
        result.setAllowCreate(false);
        System.out.println("=== " + result);
        return result;
    }

    public StudentHibernateDao() {
    }

    public Student save(Student objectToSave) {
        getSession().saveOrUpdate(objectToSave);
        return objectToSave;
    }

    @SuppressWarnings("unchecked")
    public Collection<Student> find(String name) {
        return getSession().createQuery("from Student s where s.name like :name").setString("name", name).list();
    }
	
}
