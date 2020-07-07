package com.pdomingo.shipping.domain.model;

import com.pdomingo.kernel.core.ddd.AggregateRoot;
import com.pdomingo.shipping.domain.model.ids.ShipmentId;

import java.util.Objects;

public class Shipment extends AggregateRoot<ShipmentId> {

	private final ShipmentId shipmentId;
	private final Client     client;
	private final Order      order;

	private ShipmentStatus status;

	public Shipment(ShipmentId shipmentId, Client client, Order order) {
		this.shipmentId = Objects.requireNonNull(shipmentId);
		this.client = Objects.requireNonNull(client);
		this.order = Objects.requireNonNull(order);
	}

	@Override
	public ShipmentId id() {
		return shipmentId;
	}
}
