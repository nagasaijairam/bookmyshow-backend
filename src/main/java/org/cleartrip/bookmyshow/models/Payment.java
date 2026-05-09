package org.cleartrip.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
public class Payment extends BaseModel{
    private String referenceNumber;
    private int amount;
    @Enumerated(EnumType.ORDINAL)
    private PaymentProvider paymentProvider;
    @Enumerated(EnumType.ORDINAL)
    private PaymetMode  paymetMode;
    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus  paymentStatus;
}
