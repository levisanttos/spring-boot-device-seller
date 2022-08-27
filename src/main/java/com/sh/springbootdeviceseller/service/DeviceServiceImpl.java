package com.sh.springbootdeviceseller.service;

import com.sh.springbootdeviceseller.model.Device;
import com.sh.springbootdeviceseller.repository.DeviceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DeviceServiceImpl implements DeviceService {

    @Autowired
    private DeviceRepository deviceRepository;

    @Override
    public Device save(Device device) {
        device.setCreationDate(LocalDateTime.now());
        return this.deviceRepository.save(device);
    }

    @Override
    public void delete(Long id) {
        this.deviceRepository.deleteById(id);
    }

    @Override
    public List<Device> findAll() {
        return this.deviceRepository.findAll();
    }
}
