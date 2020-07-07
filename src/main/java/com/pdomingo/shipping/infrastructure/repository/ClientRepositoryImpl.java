package com.pdomingo.shipping.infrastructure.repository;

import com.pdomingo.shipping.domain.model.Client;
import com.pdomingo.shipping.domain.model.ids.ClientId;
import com.pdomingo.shipping.domain.port.secondary.ClientRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class ClientRepositoryImpl implements ClientRepository {

    Map<ClientId, Client> storage;

    public ClientRepositoryImpl() {
        storage = new HashMap<>();
    }

    @Override
    public Client save(Client newClient) {
        storage.put(newClient.id(), newClient);
        return newClient;
    }

    @Override
    public Optional<Client> findById(ClientId clientId) {
        return Optional.empty();
    }
}
