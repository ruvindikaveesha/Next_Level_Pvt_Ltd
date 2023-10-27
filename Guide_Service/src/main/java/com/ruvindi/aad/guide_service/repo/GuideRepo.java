package com.ruvindi.aad.guide_service.repo;

import com.ruvindi.aad.guide_service.entity.Guide;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
public interface GuideRepo extends MongoRepository<Guide,Integer> {
    @Query("SELECT guide FROM Guide guide WHERE guide.status='Available'")
    Guide findFirstAvailableGuide();
}
