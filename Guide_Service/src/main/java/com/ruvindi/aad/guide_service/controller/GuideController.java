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


    @PostMapping(value = "/add_guide")
    public Response addGuide(@ModelAttribute Guide guide) {
        return new Response("OK", "Guide Added", guideService.addGuide(guide));

    }

    @PutMapping(value = "/update_guide")
    public Response updateGuide(@RequestBody Guide guide) {
        return new Response("OK", "Guide Updated", guideService.updateGuide(guide));
    }

    @DeleteMapping(value = "/del_guide")
    public Response deleteGuide(@RequestParam String guideId) {
        guideService.deleteGuide(guideId);
        return new Response("OK", "Guide Deleted", null);
    }

    @GetMapping(value = "/available")
    public Response getAvailableGuide() {
        return new Response("OK", "", guideService.getAvailableGuide());
    }

    @PutMapping(value = "/unavailable")
    public Response setUnavailableGuide(@RequestParam String id) {
        guideService.setUnavailableGuide(id);
        return new Response("OK", "", null);
    }

    @GetMapping(value = "/getGuide")
    public Response getGuide() {
        return new Response("OK", "Done", guideService.getAllGuide());
    }

    @GetMapping(value = "/get")
    public Response getGuideById(@RequestParam String id) {
        return new Response("OK", "Done", guideService.getGuideById(id));
    }
}

