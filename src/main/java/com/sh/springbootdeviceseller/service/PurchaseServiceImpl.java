package com.sh.springbootdeviceseller.service;

import com.sh.springbootdeviceseller.model.Purchase;
import com.sh.springbootdeviceseller.repository.PurchaseRepository;
import com.sh.springbootdeviceseller.repository.projections.PurchaseItem;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PurchaseServiceImpl implements PurchaseService {

    @Autowired
    private PurchaseRepository purchaseRepository;

    @Override
    public Purchase save(Purchase purchase) {
        purchase.setPurchaseTime(LocalDateTime.now());
        return this.purchaseRepository.save(purchase);
    }

    @Override
    public List<PurchaseItem> findPurchaseItensOfUser(Long userId) {
        return this.purchaseRepository.findaAllPurchaseOfUser(userId);
    }
}
