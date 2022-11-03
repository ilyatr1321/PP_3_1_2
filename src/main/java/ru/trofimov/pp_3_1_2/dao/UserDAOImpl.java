package com.dao;

import com.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO{

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<User> getAllUsers() {

        return entityManager.createQuery(
                "select u from User u ", User.class).getResultList();
    }

    @Override
    public void saveUser(User user) {

        entityManager.persist(user);
    }


    @Override
    public User getUserById(int id) {


        return entityManager.find(User.class, id);
    }

    @Override
    public void updateUser(User updateUser, int id) {

        entityManager.merge(updateUser);
    }

    @Override
    public void deleteUser(int id) {
        User user = entityManager.find(User.class, id);
        entityManager.remove(user);

    }

}