package com.springapp.mvc.model.dao;


import com.springapp.mvc.model.domain.Archive;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.hibernate.event.spi.SaveOrUpdateEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository("archiveDAO")
public class ArchiveDAO extends GenericDAO {
    public ArchiveDAO() {
    }

    public List<Archive> getArchive() {
        Criteria criteria = getSession().createCriteria(Archive.class);
        return (List<Archive>) criteria.list();
    }


    public List<Archive> getArchiveByStatus(String status) {
        Criteria criteria = getSession().createCriteria(Archive.class);
        criteria.add(Restrictions.eq("status",status));
        return (List<Archive>) criteria.list();
    }
    public List<Archive> searchArchive(String search){
        Criteria criteria=getSession().createCriteria(Archive.class);
        criteria.add(Restrictions.like("mark", search, MatchMode.ANYWHERE));
        //поиск по всему остальному
        //2 текстовых поиска, 2 дропдауна
        //добавить даты создания/выставления оценок
        //привести в нормальный вид меню
        List <Archive> courses = criteria.list();
        return courses.size()>0 ? courses:null;
    }
    public Archive getArchiveById(int id) {
        Criteria criteria = getSession().createCriteria(Archive.class);
        criteria.add(Restrictions.eq("id", id));
        List<Archive> archive = criteria.list();
        return archive.size() > 0 ? archive.get(0) : null;
    }

    @Transactional
    public void addNew(Archive archive) {
        getSession().save(archive);
    }

    @Transactional
    public void changeStatus(int id, String status) {
        Archive archive = getArchiveById(id);
        archive.setStatus(status);
        getSession().update(archive);
    }

}
