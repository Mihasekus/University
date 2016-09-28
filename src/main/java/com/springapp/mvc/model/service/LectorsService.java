package com.springapp.mvc.model.service;


import com.springapp.mvc.model.dao.LectorsDAO;
import com.springapp.mvc.model.dao.StudentDAO;
import com.springapp.mvc.model.domain.Lectors;
import com.springapp.mvc.model.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service("LectorsService")
@Transactional
public class LectorsService {
    @Autowired
    private LectorsDAO lectorsDAO;

    public List<Lectors> getLectors() {
        return lectorsDAO.getLectors();
    }
    public List<Lectors> getLectorsByStatus(String status) {
        return lectorsDAO.getLectorsByStatus(status);
    }
    public List<Lectors> searchLector(String search){return lectorsDAO.searchLectors(search);}
    public void setLectors(Lectors lectors) {
        lectorsDAO.addNew(lectors);
    }

    public Lectors getLector(int id) {
        return lectorsDAO.getLector(id);
    }

    public void changeStatus(int id, String status) {
        lectorsDAO.changeStatus(id, status);
    }
}
