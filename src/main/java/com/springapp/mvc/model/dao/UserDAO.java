package com.springapp.mvc.model.dao;

import com.springapp.mvc.model.domain.User;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAO extends GenericDAO {
    public User getUser(String login, String password) {
        Criteria criteria = getSession().createCriteria(User.class);
        criteria.add(Restrictions.eq("login", login)).add(Restrictions.eq("password", password));
        List<User> users = criteria.list();
        return users.size() > 0 ? users.get(0) : null;
    }
    public User getUserByStatus(String login, String password,String status) {
        Criteria criteria = getSession().createCriteria(User.class);
        criteria.add(Restrictions.eq("login", login)).add(Restrictions.eq("password", password)).add(Restrictions.eq("status",status));
        List<User> users = criteria.list();
        return users.size() > 0 ? users.get(0) : null;
    }

    public void setUser(User user) {
        getSession().save(user);
    }

    public void delUser(User user) {
        getSession().delete(user);
    }
}
