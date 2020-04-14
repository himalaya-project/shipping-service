package com.pdomingo.shipping.domain.port.primary.event;

import com.pdoming.kernel.core.vobjects.Address;
import com.pdomingo.kernel.event.client.ClientDataUpdated;
import com.pdomingo.shipping.domain.model.ids.ClientId;

public interface ClientDataUpdatedEventHandler {

	void onClientDataUpdatedEvent(ClientDataUpdated<ClientId, Address> event);
}
