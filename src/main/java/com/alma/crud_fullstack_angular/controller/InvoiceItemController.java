package com.alma.crud_fullstack_angular.controller;

import com.alma.crud_fullstack_angular.entity.InvoiceItem;
import com.alma.crud_fullstack_angular.service.invoiceItem.InvoiceItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/invoiceitems")
public class InvoiceItemController {

    private final InvoiceItemService invoiceItemService;

    public InvoiceItemController(InvoiceItemService invoiceItemService) {
        this.invoiceItemService = invoiceItemService;
    }

    @GetMapping
    public List<InvoiceItem> getAllInvoiceItems() {
        return invoiceItemService.findAll();
    }

    @GetMapping("/idInvoiceItem")
    public InvoiceItem getInvoiceItemById(@RequestParam("idInvoiceItem") Integer id) {
        return invoiceItemService.findById(id);
    }

    @PostMapping
    public InvoiceItem createInvoiceItem(@RequestBody InvoiceItem invoiceItem) {
        return invoiceItemService.save(invoiceItem);
    }

    @PutMapping
    public InvoiceItem updateInvoiceItem(@RequestBody InvoiceItem invoiceItem) {
        return invoiceItemService.save(invoiceItem);
    }

    @DeleteMapping("/idInvoiceItem")
    public void deleteInvoiceItemById(@RequestParam("idInvoiceItem") Integer id) {
        invoiceItemService.delete(id);
    }
}
