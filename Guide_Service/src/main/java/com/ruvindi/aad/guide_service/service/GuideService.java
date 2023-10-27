package com.ruvindi.aad.guide_service.service;

import com.ruvindi.aad.guide_service.entity.Guide;

import java.util.List;

public interface GuideService {

    Guide addGuide(Guide guide);

    Guide updateGuide(Guide guide);

    void deleteGuide(Integer guide);

    Guide getAvailableGuide();

    List<Guide> getAllGuide();
}
