package com.example.recyclerviewsports;

public class Sport {

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
