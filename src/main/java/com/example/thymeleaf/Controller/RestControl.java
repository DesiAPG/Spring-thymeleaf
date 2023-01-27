package com.example.thymeleaf.Controller;

import com.example.thymeleaf.Model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class RestControl {

    public List<Post> getPosts(){
        ArrayList<Post> post = new ArrayList<>();
        post.add(new Post(1,"Web development is the work involved in developing a website for the Internet or an intranet.","https://blog.openclassrooms.com/en/wp-content/uploads/sites/4/2018/03/web-develoment.jpg",new Date(),"Web Development"));
        post.add(new Post(2,"Web development is the work involved in developing a website for the Internet or an intranet.","https://blog.openclassrooms.com/en/wp-content/uploads/sites/4/2018/03/web-develoment.jpg",new Date(),"Web Development"));
        post.add(new Post(3,"Web development is the work involved in developing a website for the Internet or an intranet.","https://blog.openclassrooms.com/en/wp-content/uploads/sites/4/2018/03/web-develoment.jpg",new Date(),"Web Development"));
        post.add(new Post(4,"Web development is the work involved in developing a website for the Internet or an intranet.","https://blog.openclassrooms.com/en/wp-content/uploads/sites/4/2018/03/web-develoment.jpg",new Date(),"Web Development"));
        return post;
    }
    @GetMapping(path = {"/","/home"})
    public String wave(Model model){
        model.addAttribute("posts",this.getPosts());
        return "index";
    }
}
