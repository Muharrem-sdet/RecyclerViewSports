package com.example.recyclerviewsports;

import java.io.Serializable;

public class Sport implements Serializable {

    public String sportTitle;
    public String sportInfo;
    public int sportImageId;
    public String sportExplanation;

    public Sport(String sportTitle, String sportInfo, String sportExplanation, int sportImageId) {
        this.sportTitle = sportTitle;
        this.sportInfo = sportInfo;
        this.sportImageId = sportImageId;
        this.sportExplanation = sportExplanation;
    }
}
