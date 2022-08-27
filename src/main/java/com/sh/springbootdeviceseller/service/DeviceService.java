package com.sh.springbootdeviceseller.service;

import com.sh.springbootdeviceseller.model.Device;

import java.util.List;

public interface DeviceService {
    Device save(Device device);

    void delete(Long id);

    List<Device> findAll();
}
