package com.sh.springbootdeviceseller.repository.projections;

import com.sh.springbootdeviceseller.model.DeviceType;

import java.time.LocalDateTime;

public interface PurchaseItem {

    String getName();
    DeviceType getDeviceType();
    Double getPrice();
    String getColor();
    LocalDateTime getPurchaseTime();
}
