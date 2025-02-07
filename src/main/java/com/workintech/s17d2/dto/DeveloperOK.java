package com.workintech.s17d2.dto;

import com.workintech.s17d2.dto.DeveloperResponse;
import com.workintech.s17d2.model.Developer;
import org.springframework.http.HttpStatus;

import java.util.List;

public class DeveloperOK extends DeveloperResponse {
    // Tek bir Developer için constructor
    public DeveloperOK(Developer developer) {
        super(developer, HttpStatus.OK.value(), "Developer retrieved successfully.");
    }

    // Liste için yeni constructor
    public DeveloperOK(List<Developer> developers) {
        super(developers, HttpStatus.OK.value(), "Developers retrieved successfully.");
    }

    //FOR DELETE ONLY, USE WITH CAUTION
public DeveloperOK(){
    super(null, HttpStatus.OK.value(), "Developer deleted successfully.");

}

    public DeveloperOK(Object data, int status, String message) {
        super(data, status, message);
    }
}