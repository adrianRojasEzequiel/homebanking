package com.minhub.homebanking.repositories;

import com.minhub.homebanking.DTO.ClientDTO;
import com.minhub.homebanking.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface ClientRepositories extends JpaRepository<Client, Long> {
    Client findByEmail(String email);

}
