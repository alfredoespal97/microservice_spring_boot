package com.alma.crud_fullstack_angular.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceItem extends JpaRepository<Invoice, Integer> {
}
