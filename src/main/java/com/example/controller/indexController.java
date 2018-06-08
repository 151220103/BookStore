package com.example.controller;

import com.example.entity.User;
import com.example.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class indexController {
    @Autowired
    private UserRepository userRepository;
    @RequestMapping("/index")
    public String index(Integer id){
        List<User> u= userRepository.findall();
        return u.toString();
    }
    @RequestMapping("/index/{id}")
    public String indexforID(@PathVariable Integer id){
        if(userRepository.FindById(id).toString()==null)
            return "null";
        else return userRepository.FindById(id).toString();
    }
}
