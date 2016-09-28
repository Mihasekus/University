package com.springapp.mvc.model.service;


import com.springapp.mvc.model.dao.FacultiesDAO;
import com.springapp.mvc.model.domain.Faculties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("FacultiesService")
@Transactional
public class FacultiesService {
    @Autowired
    private FacultiesDAO facultiesDAO;

    public List<Faculties> getFaculties() {
        return facultiesDAO.getFaculties();
    }

    public void setFaculties(Faculties faculties) {
        facultiesDAO.addNew(faculties);
    }

    public void delFaculties(Faculties faculties) {
        facultiesDAO.delOne(faculties);
    }
}