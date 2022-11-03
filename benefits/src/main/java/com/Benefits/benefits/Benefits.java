package com.Benefits.benefits;

import java.util.ArrayList;
import java.util.List;

public class Benefits {
    private ArrayList wellBeing;
    private Boolean travel;
    private List<Training> trainings;

    public Benefits() {
    }

    public ArrayList getWellBeing() {
        return wellBeing;
    }

    public void setWellBeing(ArrayList wellBeing) {
        this.wellBeing = wellBeing;
    }

    public Boolean getTravel() {
        return travel;
    }

    public void setTravel(Boolean travel) {
        this.travel = travel;
    }

    public List<Training> getTrainings() {
        return trainings;
    }

    public void setTrainings(List<Training> trainings) {
        this.trainings = trainings;
    }
}


