package com.pdomingo.shipping.domain.model.ids;

import com.pdoming.kernel.core.ddd.DelegatedIdentifier;

import java.util.UUID;

public class ClientId extends DelegatedIdentifier<UUID> {
	public ClientId(UUID value) {
		super(value);
	}
	public ClientId(String value) {
		super(UUID.fromString(value));
	}
}
