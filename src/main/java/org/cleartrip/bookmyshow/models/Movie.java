package org.cleartrip.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.util.List;
@Entity
@Getter
@Setter
public class Movie extends BaseModel{
    private String name;
    private Date releaseDate;
    private List<Feature> features;
}
