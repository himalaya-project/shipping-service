package com.pdomingo.shipping.domain.port.primary.event;


import static com.pdomingo.events.client.ClientEvents.ClientRegisteredEvent;

public interface ClientRegisteredEventHandler {

	void onClientRegisteredEvent(ClientRegisteredEvent event);
}
