package org.cleartrip.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class ShowSeatType  extends BaseModel{

    @ManyToOne
    private Show show;
    @Enumerated(EnumType.ORDINAL)
    private SeatType seatType;

    private int price;

    @Enumerated(EnumType.ORDINAL)
    private ShowSeatStatus showSeatStatus;

}

/*
1                      1
ShowSeatType     ----> Show
M                      1
 */