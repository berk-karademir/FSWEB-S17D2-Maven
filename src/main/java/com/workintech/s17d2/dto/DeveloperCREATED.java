package com.workintech.s17d2.dto;

import com.workintech.s17d2.model.Developer;
import com.workintech.s17d2.tax.Taxable;
import org.springframework.http.HttpStatus;

public class DeveloperCREATED extends DeveloperResponse{
    public DeveloperCREATED(Developer developer) {
        super(developer, HttpStatus.CREATED.value(), "Developer created successfully: " + developer);
    }
}
