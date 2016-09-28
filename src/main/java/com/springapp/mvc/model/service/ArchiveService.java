package com.springapp.mvc.model.service;


import com.springapp.mvc.model.dao.ArchiveDAO;
import com.springapp.mvc.model.domain.Archive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service("archiveService")
@Transactional
public class ArchiveService {
    @Autowired
    private ArchiveDAO archiveDAO;

    public List<Archive> getArchive() {
        return archiveDAO.getArchive();
    }
    public List<Archive> getArchiveByStatus(String status) {
        return archiveDAO.getArchiveByStatus(status);
    }
    public List<Archive> searchArchive(String search) {
        return archiveDAO.searchArchive(search);
    }
    public void setMark(Archive archive) {
        archiveDAO.addNew(archive);
    }

    public void changeStatus(int id, String status) {
        archiveDAO.changeStatus(id, status);
    }
}
