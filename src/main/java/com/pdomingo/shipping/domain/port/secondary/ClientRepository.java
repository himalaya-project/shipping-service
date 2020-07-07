package com.pdomingo.shipping.domain.port.secondary;

import com.pdomingo.kernel.core.ddd.Repository;
import com.pdomingo.shipping.domain.model.Client;
import com.pdomingo.shipping.domain.model.ids.ClientId;

public interface ClientRepository extends Repository<Client, ClientId> {

	Client save(Client newClient);
}
