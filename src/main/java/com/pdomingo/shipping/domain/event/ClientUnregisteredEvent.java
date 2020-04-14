package com.pdomingo.shipping.domain.event;

import com.pdomingo.kernel.event.client.ClientUnregistered;
import com.pdomingo.shipping.domain.model.ids.ClientId;

import java.time.Instant;

public class ClientUnregisteredEvent extends ClientUnregistered<ClientId> {
	public ClientUnregisteredEvent(ClientId sourceId) {
		super(sourceId, Instant.now());
	}
}
