package com.sh.springbootdeviceseller.controllers;

import com.sh.springbootdeviceseller.model.Purchase;
import com.sh.springbootdeviceseller.security.UserPrincipal;
import com.sh.springbootdeviceseller.service.PurchaseService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/purcharses")
public class PurcharseController {

    @Autowired
    private PurchaseService purchaseService;

    @PostMapping
    public ResponseEntity save(@RequestBody Purchase purchase) {
        return new ResponseEntity(purchaseService.save(purchase), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity getAllPurchasesOfUser(@AuthenticationPrincipal UserPrincipal userPrincipal) {
        return new ResponseEntity(purchaseService.findPurchaseItensOfUser(userPrincipal.getId()), HttpStatus.OK);
    }
}
