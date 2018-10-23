package com.hotels.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by Punit on 2018-10-23.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SandboxResult {

    @JsonProperty(value = "results")
    private List<HotelInfo> results;


    public List<HotelInfo> getResults() {
        return results;
    }

    public void setResults(List<HotelInfo> results) {
        this.results = results;
    }
}
