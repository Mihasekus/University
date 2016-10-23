package com.springapp.mvc.web.controllers.admin;


import com.springapp.mvc.model.service.ArchiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ArchiveControllerAdmin {
    @Autowired
    private ArchiveService archiveService;

    @RequestMapping(value = "/archiveAdmin.html", method = RequestMethod.GET)
    public ModelAndView ArchiveTable(ModelMap modelMap, HttpServletRequest request) {
        ModelAndView showArchive = new ModelAndView("admin/archiveAdmin");
        showArchive.addObject("Archive", archiveService.getArchiveByStatus("active"));
        showArchive.addObject("dropdown",archiveService.getArchive());
        showArchive.addObject("menuIndex",request.getParameter("point"));
        return showArchive;
    }

    @RequestMapping("/ArchiveAdminTableSearch")
    public ModelAndView searchTable(ModelMap modelMap, HttpServletRequest request){
        ModelAndView searchTable=new ModelAndView("user/ArchiveTable");
        searchTable.addObject("Archive",archiveService.searchArchive(request.getParameter("searchStud"),request.getParameter("searchLect"),request.getParameter("course"),request.getParameter("mark")));
        searchTable.addObject("menuIndex",request.getParameter("point"));
        return searchTable;
    }
}