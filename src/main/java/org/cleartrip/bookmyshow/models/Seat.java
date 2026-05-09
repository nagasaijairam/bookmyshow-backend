package org.cleartrip.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class Seat extends BaseModel{
    private int rowNumber;
    private int columnNumber;
    private String seatNumber;
    private SeatType seatType;

}
