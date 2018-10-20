package com.imooc.sell.repository;

import com.imooc.sell.dataobject.OrderMaster;
import org.hibernate.criterion.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 廖师兄
 * 2017-06-11 17:24
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {

    OrderMaster findByOrderId(String id);

    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);
}
