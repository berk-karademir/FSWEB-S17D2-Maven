package com.workintech.s17d2.dto;

import com.workintech.s17d2.model.Developer;
import org.springframework.http.HttpStatus;

public class DeveloperNO_CONTENT extends DeveloperResponse {
    public DeveloperNO_CONTENT() {
        super(null, HttpStatus.OK.value(), "Removed successfully.");
    }
}
