package com.pdomingo.shipping.domain.port.primary.event;

import com.pdomingo.shipping.domain.event.ClientRegisteredEvent;

public interface ClientRegisteredEventHandler {

	void onClientRegisteredEvent(ClientRegisteredEvent event);
}
