package org.cleartrip.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Seat extends BaseModel{
    private int rowNumber;
    private int columnNumber;
    private String seatNumber;
    @Enumerated(EnumType.ORDINAL)
    private SeatType seatType;

}
