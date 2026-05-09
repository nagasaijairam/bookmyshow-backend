package org.cleartrip.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Booking extends BaseModel{ //Ticket object
    private String bookingNumber;
    @ManyToOne
    private User user;

    @ManyToOne
    private Show show;

    @ManyToMany
    List<ShowSeat> showSeats;
    private int amount;

    @OneToMany
    private List<Payment> payments;


    @Enumerated(EnumType.ORDINAL)
    private BookingStatus bookingStatus;
}

/*
1           1
Bookings -> User  Many to one
M           1


1                   1
Booking -------> Show  one to Many
M                   1

1             M
Booking ----> Show
M              1

1             M
Booking ----> Payment
1              1

 */