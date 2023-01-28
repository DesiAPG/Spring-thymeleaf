package com.example.thymeleaf.Controller;

import com.example.thymeleaf.Model.Post;
import com.example.thymeleaf.config.Pages;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class RestControl {

    public List<Post> getPosts() {
        ArrayList<Post> post = new ArrayList<>();
        post.add(new Post(1, "Web development is the work involved in developing a website for the Internet or an intranet.", "https://blog.openclassrooms.com/en/wp-content/uploads/sites/4/2018/03/web-develoment.jpg", new Date(), "Web Development"));
        post.add(new Post(2, "Web development is the work involved in developing a website for the Internet or an intranet.", "https://blog.openclassrooms.com/en/wp-content/uploads/sites/4/2018/03/web-develoment.jpg", new Date(), "Web Development"));
        post.add(new Post(3, "Web development is the work involved in developing a website for the Internet or an intranet.", "https://blog.openclassrooms.com/en/wp-content/uploads/sites/4/2018/03/web-develoment.jpg", new Date(), "Web Development"));
        post.add(new Post(4, "Web development is the work involved in developing a website for the Internet or an intranet.", "https://blog.openclassrooms.com/en/wp-content/uploads/sites/4/2018/03/web-develoment.jpg", new Date(), "Web Development"));
        return post;
    }

    @GetMapping(path = {"/", "/home"})
    public ModelAndView post() {
        ModelAndView modelAndView = new ModelAndView(Pages.HOME);
        modelAndView.addObject("posts", this.getPosts());
        return modelAndView;
    }

    @GetMapping(path = {"/post"})
    public ModelAndView getPostIndividual(@RequestParam(defaultValue = "1", name = "id", required = false) int id) {

        ModelAndView modelAndView = new ModelAndView(Pages.POST);
        List<Post> postFilter = this.getPosts().stream().filter((p -> {
            return p.getId() == id;
        })).collect(Collectors.toList());
        modelAndView.addObject("post", postFilter.get(0));
        return modelAndView;
    }
}
