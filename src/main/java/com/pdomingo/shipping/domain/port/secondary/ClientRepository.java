package com.pdomingo.shipping.domain.port.secondary;

import com.pdomingo.shipping.domain.model.Client;

public interface ClientRepository {

	Client save(Client newClient);
}
