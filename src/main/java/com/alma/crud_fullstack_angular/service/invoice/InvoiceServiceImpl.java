package com.alma.crud_fullstack_angular.service.invoice;

import com.alma.crud_fullstack_angular.entity.Customer;
import com.alma.crud_fullstack_angular.entity.Invoice;
import com.alma.crud_fullstack_angular.entity.InvoiceItem;
import com.alma.crud_fullstack_angular.repository.InvoiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    private final InvoiceRepository invoiceRepository;

    public InvoiceServiceImpl(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }
    @Override
    public Invoice save(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    @Override
    public List<Invoice> findAll() {
        return invoiceRepository.findAll();
    }

    @Override
    public Invoice findById(Integer id) {
        return invoiceRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("Invoice not found")
        );
    }

    @Override
    public Invoice update(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    @Override
    public void deleteById(Integer id) {
        invoiceRepository.deleteById(id);
    }
}
