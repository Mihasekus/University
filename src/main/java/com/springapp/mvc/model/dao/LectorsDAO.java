package com.springapp.mvc.model.dao;


import com.springapp.mvc.model.domain.Lectors;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository("lectorsDAO")
public class LectorsDAO extends GenericDAO {
    public LectorsDAO() {
    }

    public List<Lectors> getLectors() {
        Criteria criteria = getSession().createCriteria(Lectors.class);
        return (List<Lectors>) criteria.list();
    }
    public List<Lectors> getLectorsByStatus(String status) {
        Criteria criteria = getSession().createCriteria(Lectors.class);
        criteria.add(Restrictions.eq("status", status));
        return (List<Lectors>) criteria.list();
    }

    public Lectors getLector(int id) {
        Criteria criteria = getSession().createCriteria(Lectors.class);
        criteria.add(Restrictions.eq("id", id));
        List<Lectors> lectors = criteria.list();
        return lectors.size() > 0 ? lectors.get(0) : null;
    }
    public List<Lectors> searchLectors(String search){
        Criteria criteria=getSession().createCriteria(Lectors.class);
        criteria.add(Restrictions.or(Restrictions.like("name", search, MatchMode.ANYWHERE),Restrictions.like("surname", search,MatchMode.ANYWHERE)));
        List <Lectors> lectors = criteria.list();//по этому примеру пофиксить прочие поиски
        return lectors.size()>0 ? lectors:null;
    }
    @Transactional
    public void addNew(Lectors lectors) {
        getSession().save(lectors);
    }

    @Transactional
    public void changeStatus(int id, String status) {
        Lectors lectors = getLector(id);
        lectors.setStatus(status);
        getSession().update(lectors);
    }

    @Transactional
    public void UpOne(Lectors lectors) {
        getSession().update(lectors);
    }

}
