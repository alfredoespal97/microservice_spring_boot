package com.alma.crud_fullstack_angular.service.invoiceItem;

import com.alma.crud_fullstack_angular.entity.InvoiceItem;
import com.alma.crud_fullstack_angular.repository.InvoiceItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceItemServiceImpl implements InvoiceItemService{
    public final InvoiceItemRepository invoiceItemRepository;

    public InvoiceItemServiceImpl(InvoiceItemRepository invoiceItemRepository){
        this.invoiceItemRepository = invoiceItemRepository;
    }

    @Override
    public InvoiceItem save(InvoiceItem invoiceItem) {
        return invoiceItemRepository.save(invoiceItem);
    }

    @Override
    public List<InvoiceItem> findAll() {
        return invoiceItemRepository.findAll();
    }

    @Override
    public InvoiceItem findById(Integer id) {
        return invoiceItemRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Could not find invoice item with id: " + id)
        );
    }

    @Override
    public InvoiceItem update(InvoiceItem invoiceItem) {
        return invoiceItemRepository.save(invoiceItem);
    }

    @Override
    public void delete(Integer id) {
        invoiceItemRepository.deleteById(id);
    }
}
