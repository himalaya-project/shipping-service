package com.pdomingo.shipping.domain.model.ids;

import com.pdomingo.kernel.core.ddd.DelegatedIdentifier;

import java.util.UUID;

public class ShipmentId extends DelegatedIdentifier<UUID> {
	public ShipmentId(UUID value) {
		super(value);
	}
	public ShipmentId(String value) {
		super(UUID.fromString(value));
	}
}
