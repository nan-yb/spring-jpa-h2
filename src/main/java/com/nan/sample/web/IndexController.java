package com.nan.sample.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nan.sample.domain.TbMember;
import com.nan.sample.service.MemberService;

/**
 * Created by mbart on 28.02.2016.
 */
@Controller
public class IndexController {

    @Autowired
    private MemberService memberService;

    @RequestMapping("/")
    public String showIndex(Model model) {
        List<TbMember> memberList = memberService.loadAll();

        model.addAttribute("memberList", memberList);

        return "index"; 
    }

    @PostMapping("/insert.api")
    @ResponseBody
    public ResponseEntity<TbMember> insertMember() {

        memberService.saveMember(null);

        ResponseEntity<TbMember> entity = new ResponseEntity<>(HttpStatus.OK);

        return entity; 
    }
}
