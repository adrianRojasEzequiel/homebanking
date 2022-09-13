package com.minhub.homebanking.repositories;

import com.minhub.homebanking.models.ClientLoan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ClientLoanRepositories extends JpaRepository<ClientLoan, Long> {
}