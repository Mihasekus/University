package com.springapp.mvc.web.controllers.user;


import com.springapp.mvc.model.service.ArchiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ArchiveController {
    @Autowired
    private ArchiveService archiveService;

    @RequestMapping(value = "/Archive.html", method = RequestMethod.GET)
    public ModelAndView ArchiveTable(ModelMap modelMap, HttpServletRequest request) {
        ModelAndView showArchive = new ModelAndView("user/Archive");
        showArchive.addObject("Archive", archiveService.getArchiveByStatus("active"));
        return showArchive;
    }

    @RequestMapping("/ArchiveTableSearch")
    public ModelAndView searchTable(ModelMap modelMap, HttpServletRequest request){
        ModelAndView searchTable=new ModelAndView("user/Archive");
        searchTable.addObject("Archive",archiveService.searchArchive(request.getParameter("search")));
        return searchTable;
    }
}