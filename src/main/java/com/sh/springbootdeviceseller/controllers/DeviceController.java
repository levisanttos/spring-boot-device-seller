package com.sh.springbootdeviceseller.controllers;

import com.sh.springbootdeviceseller.model.Device;
import com.sh.springbootdeviceseller.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/devices")
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    @PostMapping
    public ResponseEntity save(@RequestBody Device device) {
        return new ResponseEntity(deviceService.save(device), HttpStatus.CREATED);
    }

    @DeleteMapping("{deviceId}")
    public ResponseEntity delete(@PathVariable("deviceId") Long deviceId) {
        deviceService.delete(deviceId);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity getAll() {
        return new ResponseEntity(deviceService.findAll(), HttpStatus.OK);
    }
}
