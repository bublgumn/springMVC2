package web.dao;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void add(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public void deleteUser(User user) {
        sessionFactory.getCurrentSession().delete(user);
    }

    @Override
    public void updateUser(User user) {
        sessionFactory.getCurrentSession().update(user);
    }

    @Override
    public List<User> listUsers() {
        TypedQuery<User> query=sessionFactory.getCurrentSession().createQuery("from User");
        return query.getResultList();
    }

    @Override
    public User getUserById(Long id) {
        Query query = sessionFactory.openSession().createQuery("From User u where u.id = :nowId ");
        query.setParameter("nowId", id);
        return (User) query.uniqueResult();
    }

    @Override
    public User getUserByEmail(String email) {
        Query query = sessionFactory.openSession().createQuery("From User u where u.email = :nowEmail ");
        query.setParameter("nowEmail", email);
        return (User) query.uniqueResult();
    }

}
