package web.service.newsfeed.repository;

import web.service.newsfeed.model.NewsGroup;

public interface NewsGroupDAO {
    public NewsGroup getFirstByUserId(String userId);
}
