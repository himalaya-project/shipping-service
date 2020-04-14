package com.pdomingo.shipping.domain.model;

import com.pdoming.kernel.core.ddd.AggregateRoot;
import com.pdomingo.shipping.domain.model.ids.ShipmentId;

public class Shipment extends AggregateRoot<ShipmentId> {

	private final ShipmentId shipmentId;
	private final Client     client;
	private final Order      order;

	private ShipmentStatus status;

	public Shipment(ShipmentId shipmentId, Client client, Order order) {
		this.shipmentId = shipmentId;
		this.client = client;
		this.order = order;
	}

	@Override
	public ShipmentId id() {
		return shipmentId;
	}
}
