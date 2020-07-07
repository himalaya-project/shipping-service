package com.pdomingo.shipping.domain.model;

import com.pdomingo.kernel.core.ddd.AggregateRoot;
import com.pdomingo.kernel.core.vobjects.Address;
import com.pdomingo.shipping.domain.model.ids.ClientId;

public class Client extends AggregateRoot<ClientId> {

	// A client can mutate independently from a Shipment (eg by modifying its shipping address) as such it's an Aggregate

	private final ClientId clientId;
	private final Address  shippingAddress;

	public Client(ClientId clientId, Address shippingAddress) {
		this.clientId = clientId;
		this.shippingAddress = shippingAddress;
	}

	public ClientId id() {
		return clientId;
	}

	public Address shippingAddress() {
		return shippingAddress;
	}
}
