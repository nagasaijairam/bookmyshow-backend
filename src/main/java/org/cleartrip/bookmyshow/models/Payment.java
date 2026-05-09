package org.cleartrip.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class Payment extends BaseModel{
    private String referenceNumber;
    private int amount;
    private PaymentProvider paymentProvider;
    private PaymetMode  paymetMode;
    private PaymentStatus  paymentStatus;
}
