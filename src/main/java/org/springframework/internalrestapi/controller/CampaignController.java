package org.springframework.internalrestapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.internalrestapi.models.Campaign;
import org.springframework.internalrestapi.repository.CampaignRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/campaign")
public class CampaignController {
    @Autowired
    CampaignRepository campaignRepository;

    @RequestMapping("")
    public List<Campaign> getAllUsers(){
        return campaignRepository.findAll();
    }

}
