package org.cleartrip.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Entity
@Getter
@Setter
public class Show extends BaseModel{
    private Movie movie;
    private Data startTime;
    private Data endTime;
    private Screen screen;
    private List<Feature> features;
}
