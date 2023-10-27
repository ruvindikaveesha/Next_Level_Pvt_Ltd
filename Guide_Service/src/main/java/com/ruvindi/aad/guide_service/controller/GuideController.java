package com.ruvindi.aad.guide_service.controller;

import com.ruvindi.aad.guide_service.entity.Guide;
import com.ruvindi.aad.guide_service.service.GuideService;
import com.ruvindi.aad.guide_service.utill.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/guide")
public class GuideController {
    @Autowired
    private GuideService guideService;


    @PostMapping(value = "/save_guide")
    public void saveGuide(@ModelAttribute Guide guide){
        guideService.addGuide(guide);
    }

    @PutMapping(value = "/update_guide")
    public Response updateGuide(@RequestBody Guide guide){
        return new Response("OK","Guide Updated",guideService.updateGuide(guide));
    }

    @DeleteMapping(value = "/del_guide")
    public Response deleteGuide(@RequestParam Integer guideId){
        guideService.deleteGuide(guideId);
        return new Response("OK","Guide Deleted",null);
    }

    @GetMapping(value = "/available")
    public Response getAvailableGuide(){
        return new Response("OK","",guideService.getAvailableGuide());
    }

    @GetMapping(value = "/getGuide")
    public Response getGuide(){
        return new Response("Okay","Done",guideService.getAllGuide());
    }
}


