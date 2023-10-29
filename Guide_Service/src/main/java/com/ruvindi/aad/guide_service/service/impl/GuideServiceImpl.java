package com.ruvindi.aad.guide_service.service.impl;

import com.ruvindi.aad.guide_service.entity.Guide;
import com.ruvindi.aad.guide_service.repo.GuideRepo;
import com.ruvindi.aad.guide_service.service.GuideService;
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
    public void deleteGuide(String guideId) {
        guideRepo.deleteById(guideId);}

    @Override
    public Guide getAvailableGuide() {
        List<Guide> guideList=guideRepo.findAllByStatus();
        if (guideList.isEmpty()){
            throw new RuntimeException("There is no available guide at this moment");
        }
        Guide returningGuide = guideList.get(0);
        return returningGuide;
    }

    @Override
    public void setUnavailableGuide(String id) {
        Guide guide= getGuideById(id);
        guide.setStatus("Unavailable");
        guideRepo.save(guide);

    }

    @Override
    public List<Guide> getAllGuide() {return guideRepo.findAll();
    }


    @Override
    public Guide getGuideById(String id) {
        return guideRepo.findById(id).get();
    }

}





