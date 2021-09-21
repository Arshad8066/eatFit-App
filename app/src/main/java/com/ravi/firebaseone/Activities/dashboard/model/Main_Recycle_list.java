package com.ravi.firebaseone.Activities.dashboard.model;

import java.io.Serializable;

public class Main_Recycle_list implements Serializable {
    private String dietName;
    private Integer dietImage;


    public String getDietName() {
        return dietName;
    }

    public void setdietName(String dietName) {
        this.dietName = dietName;
    }



    public Integer getdietImage() {
        return dietImage;
    }

    public void setdietImage(Integer exerImage) {
        this.dietImage = dietImage;
    }

    public Main_Recycle_list(String dietName, Integer dietImage) {
        this.dietName = dietName;
//        this.exerDuration = exerDuration;
        this.dietImage = dietImage;
    }
}