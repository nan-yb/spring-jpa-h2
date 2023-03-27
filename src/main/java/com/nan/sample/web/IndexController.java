package com.nan.sample.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nan.sample.domain.Person;
import com.nan.sample.service.PersonService;

import java.util.List;

/**
 * Created by mbart on 28.02.2016.
 */
@Controller
public class IndexController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/")
    public String showIndex(Model model) {
        List<Person> personList = personService.loadAll();

        model.addAttribute("personList", personList);

        return "index"; 
    }

    @PostMapping("/insert.api")
    @ResponseBody
    public ResponseEntity<Person> insertPerson() {

        personService.saveSamplePerson(null);

        ResponseEntity<Person> entity = new ResponseEntity<>(HttpStatus.OK);

        return entity; 
    }
}
