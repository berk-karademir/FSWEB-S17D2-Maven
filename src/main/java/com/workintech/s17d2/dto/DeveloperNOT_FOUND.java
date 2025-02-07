package com.workintech.s17d2.dto;

import com.workintech.s17d2.model.Developer;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class DeveloperNOT_FOUND extends  DeveloperResponse{
    public DeveloperNOT_FOUND() {
        super(null , HttpStatus.NOT_FOUND.value(), "Could not find any data about your process.");
    }
}
