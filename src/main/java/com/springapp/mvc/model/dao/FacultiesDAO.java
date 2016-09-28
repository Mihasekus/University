package com.springapp.mvc.model.dao;


import com.springapp.mvc.model.domain.Faculties;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository("facultiesDAO")
public class FacultiesDAO extends GenericDAO {
    public FacultiesDAO() {
    }

    public List<Faculties> getFaculties() {
        Criteria criteria = getSession().createCriteria(Faculties.class);
        return (List<Faculties>) criteria.list();
    }


    @Transactional
    public void addNew(Faculties faculties) {
        getSession().save(faculties);
    }

    @Transactional
    public void delOne(Faculties faculties) {
        getSession().delete(faculties);
    }

    @Transactional
    public void UpOne(Faculties faculties) {
        getSession().update(faculties);
    }
}
