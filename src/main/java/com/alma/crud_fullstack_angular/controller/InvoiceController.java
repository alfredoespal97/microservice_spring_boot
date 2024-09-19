package com.alma.crud_fullstack_angular.controller;

import com.alma.crud_fullstack_angular.entity.Invoice;
import com.alma.crud_fullstack_angular.service.invoice.InvoiceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/invoice")
public class InvoiceController {

    private final InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @GetMapping
    public List<Invoice> listAll() {
        return invoiceService.findAll();
    }

    @GetMapping("/{idInvoice}")
    public Invoice findById(@PathVariable("idInvoice") Integer id) {
        return invoiceService.findById(id);
    }

    @PostMapping
    public Invoice save(@RequestBody Invoice invoice) {
        return invoiceService.save(invoice);
    }

    @PutMapping
    public Invoice update(@RequestBody Invoice invoice) {
        return invoiceService.update(invoice);
    }

    @DeleteMapping("/{idInvoice}")
    public void delete(@PathVariable("idInvoice") Integer id) {
        invoiceService.deleteById(id);
    }
}
