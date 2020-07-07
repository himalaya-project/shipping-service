package com.pdomingo.shipping.domain.model;

import com.pdoming.kernel.core.vobjects.Address;
import com.pdomingo.shipping.domain.model.ids.ClientId;

public class Client {

	private final ClientId clientId;
	private final Address  shippingAddress;

	public Client(ClientId clientId, Address shippingAddress) {
		this.clientId = clientId;
		this.shippingAddress = shippingAddress;
	}


	public ClientId id() {
		return clientId;
	}
}
