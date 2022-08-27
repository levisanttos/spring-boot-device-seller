package com.sh.springbootdeviceseller.repository;

import com.sh.springbootdeviceseller.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Long> {
}
