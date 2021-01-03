package com.example.recyclerviewsports;

import java.io.Serializable;

public class Sport implements Serializable {

    private String sportTitle;
    private String sportInfo;
    private int sportImageId;
    private String sportExplanation;

    public Sport(String sportTitle, String sportInfo, String sportExplanation, int sportImageId) {
        this.sportTitle = sportTitle;
        this.sportInfo = sportInfo;
        this.sportImageId = sportImageId;
        this.sportExplanation = sportExplanation;
    }

    public String getSportTitle() {
        return sportTitle;
    }

    public String getSportInfo() {
        return sportInfo;
    }

    public int getSportImageId() {
        return sportImageId;
    }

    public String getSportExplanation() {
        return sportExplanation;
    }
}
