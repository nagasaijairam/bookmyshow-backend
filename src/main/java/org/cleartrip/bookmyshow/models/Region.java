package org.cleartrip.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Entity
@Getter
@Setter
public class Region extends BaseModel{
    private String name;
    @ManyToOne
    private Region region;
    @OneToMany
    private List<Theater> theaters;

}
