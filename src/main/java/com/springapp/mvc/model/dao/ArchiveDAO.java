package com.springapp.mvc.model.dao;


import com.springapp.mvc.model.domain.Archive;
import com.springapp.mvc.model.service.CoursesService;
import com.springapp.mvc.model.service.LectorsService;
import com.springapp.mvc.model.service.StudentService;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.hibernate.event.spi.SaveOrUpdateEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository("archiveDAO")
public class ArchiveDAO extends GenericDAO {
    @Autowired
    StudentService studentService;
    @Autowired
    LectorsService lectorsService;
    @Autowired
    CoursesService coursesService;
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
    public List<Archive> searchArchive(String Stud,String Lect,String course,String mark){
        Criteria criteria=getSession().createCriteria(Archive.class,"archive");
        criteria.createAlias("archive.student","student");
        criteria.createAlias("archive.lector","lector");
        criteria.createAlias("archive.course","course");
        criteria.add(Restrictions.or(Restrictions.eq("mark", Integer.valueOf(mark)), Restrictions.like("student.name", Stud, MatchMode.ANYWHERE), Restrictions.like("lector.name", Lect, MatchMode.ANYWHERE), Restrictions.like("course.name", course,MatchMode.ANYWHERE)));
        List <Archive> marks = criteria.list();
        return marks.size()>0 ? marks:null;
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
