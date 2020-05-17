package web.service.newsfeed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import web.service.newsfeed.model.Post;
import web.service.newsfeed.service.NewsFeedService;

import java.util.List;

@Controller
public class NewsFeedController {

    @Autowired
    private NewsFeedService service;

    @MessageMapping("/get.newsfeed")
    @SendTo("/news")
    public List<Post> getPost() {
        return service.getAllNewsFeed();
    }
}
