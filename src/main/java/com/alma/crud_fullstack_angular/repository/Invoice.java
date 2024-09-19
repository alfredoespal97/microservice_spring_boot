package com.alma.crud_fullstack_angular.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Invoice extends JpaRepository<Invoice, Integer> {
}
