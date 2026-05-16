package org.cleartrip.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
@Entity
@Table(name = "shows")
@Getter
@Setter
public class Show extends BaseModel{
    @ManyToOne
    private Movie movie;

    private Date startTime;
    private Date endTime;

    @ManyToOne
    private Screen screen;

    @Enumerated(EnumType.ORDINAL)
    @ElementCollection
    private List<Feature> features;
}


/*
1           1
SHOW -----> Movie  M:1
M           1

1           M
Show -----> Screen
M           1

 */