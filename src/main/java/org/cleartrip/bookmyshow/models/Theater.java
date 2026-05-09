package org.cleartrip.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Entity
@Getter
@Setter
public class Theater extends BaseModel{
    private String name;

    @ManyToOne
    private Region region;


    @OneToMany
    private List<Screen> screens;


}


/*

Region --> Theater
 */