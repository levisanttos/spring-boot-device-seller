package com.sh.springbootdeviceseller.service;

import com.sh.springbootdeviceseller.model.Purchase;
import com.sh.springbootdeviceseller.repository.projections.PurchaseItem;

import java.util.List;

public interface PurchaseService {
    Purchase save(Purchase purchase);

    List<PurchaseItem> findPurchaseItensOfUser(Long userId);
}
