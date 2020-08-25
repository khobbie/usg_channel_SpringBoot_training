package com.usg.training.controllers;

import com.usg.training.models.MemberModel;
import com.usg.training.services.MembersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/members")
public class MembersController {

    @Autowired
    MembersService membersService;

    @GetMapping(value = "/get-all-members")
    public String get_all_member(){
        String result = membersService.get_all_members();
        return result;
    }

    @GetMapping(value = "/get-one-member/{member_id}")
    public  String get_one_member(@PathVariable int member_id){
        return "Getting member of id: " + member_id;
    }

    @PostMapping(value = "/add-member", consumes = "application/json", produces = "application/json")
    public MemberModel add_member(@RequestBody MemberModel member){
            return member;
        }

}
