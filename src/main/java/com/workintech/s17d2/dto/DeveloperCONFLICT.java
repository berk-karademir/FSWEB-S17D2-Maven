package com.workintech.s17d2.dto;

import com.workintech.s17d2.model.Developer;
import org.springframework.http.HttpStatus;

public class DeveloperCONFLICT extends DeveloperResponse {
    public DeveloperCONFLICT() {
        super(null, HttpStatus.CONFLICT.value(), "That developer already exist, check your fields.");
    }

    public DeveloperCONFLICT(Developer developer) {
        //STATUS'E NOT_MDF VERİRSEK RESPONSE BODY BOŞ DONUYOR
        super(developer, HttpStatus.CONFLICT.value(), "Developer could not modified. Nothing could change. Fields are the same. Same exact request body!");
    }
}
