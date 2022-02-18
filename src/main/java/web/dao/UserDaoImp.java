package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
@Repository
public class UserDaoImp implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    @Override
    public List<User> show() {
       return entityManager.createQuery("select u from User u", User.class).getResultList();

    }

    @Transactional
    @Override
    public User getUserById(int id) {
        return entityManager.find(User.class,id);
    }

    @Transactional
    @Override
    public void addUser(User user) {
        entityManager.persist(user);
    }

    @Override
    public void removeUser(int id) {
        entityManager.remove(getUserById(id));
    }

    @Transactional
    @Override
    public void updateUser(User user) {
        entityManager.merge(user);
    }

}