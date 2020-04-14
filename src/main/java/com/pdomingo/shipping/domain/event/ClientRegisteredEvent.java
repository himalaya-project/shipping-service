package com.pdomingo.shipping.domain.event;

import com.pdoming.kernel.core.vobjects.Address;
import com.pdoming.kernel.core.vobjects.Email;
import com.pdoming.kernel.core.vobjects.PhoneNumber;
import com.pdomingo.kernel.event.client.ClientRegistered;
import com.pdomingo.shipping.domain.model.ids.ClientId;

import java.time.Instant;

public class ClientRegisteredEvent extends ClientRegistered<ClientId> {
	public ClientRegisteredEvent(ClientId sourceId, Email email, PhoneNumber phoneNumber, Address shippingAddress) {
		super(sourceId, Instant.now(), email, phoneNumber, shippingAddress);
	}
}
