package com.alma.crud_fullstack_angular.service.invoice;

import com.alma.crud_fullstack_angular.entity.Invoice;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InvoiceService {

    Invoice save(Invoice invoice);
    List<Invoice> findAll();
    Invoice findById(Integer id);
    Invoice update(Invoice invoice);
    void deleteById(Integer id);
}
