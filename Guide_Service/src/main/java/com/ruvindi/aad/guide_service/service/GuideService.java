package com.ruvindi.aad.guide_service.service;

import com.ruvindi.aad.guide_service.entity.Guide;

import java.util.List;

public interface GuideService {

    Guide addGuide(Guide guide);

    Guide updateGuide(Guide guide);

    void deleteGuide(String guideId);

    Guide getAvailableGuide();

    void setUnavailableGuide(String id);

    Guide getGuideById(String id);

    List<Guide> getAllGuide();
}
