package com.ruvindi.aad.guide_service.service.impl;

import com.ruvindi.aad.guide_service.entity.Guide;
import com.ruvindi.aad.guide_service.repo.GuideRepo;
import com.ruvindi.aad.guide_service.service.GuideService;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class GuideServiceImpl implements GuideService {

    @Autowired
    private GuideRepo guideRepo;

    @Override
    public Guide addGuide(Guide guide) {
        return guideRepo.save(guide);
    }

    @Override
    public Guide updateGuide(Guide guide) {
        return guideRepo.save(guide);
    }

    @Override
    public void deleteGuide(Integer guideId) {
        guideRepo.deleteById(guideId);
    }

    @Override
    public Guide getAvailableGuide() {
        Guide guide = guideRepo.findFirstAvailableGuide();
        if (guide == null){
            throw new RuntimeException("There is no available guide at this moment");
        }
        guide.setStatus("Unavailable");
        updateGuide(guide);
        return guide;
    }

    @Override
    public List<Guide> getAllGuide() {
        return guideRepo.findAll();
    }
}





