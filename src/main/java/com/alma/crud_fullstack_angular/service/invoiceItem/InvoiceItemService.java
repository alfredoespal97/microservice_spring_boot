package com.alma.crud_fullstack_angular.service.invoiceItem;

import com.alma.crud_fullstack_angular.entity.InvoiceItem;
import com.alma.crud_fullstack_angular.repository.InvoiceItemRepository;

import java.util.List;

public interface InvoiceItemService {
    InvoiceItem save(InvoiceItem invoiceItem);
    List<InvoiceItem> findAll();
    InvoiceItem findById(Integer id);
    InvoiceItem update(InvoiceItem invoiceItem);
    void delete(Integer id);
}
