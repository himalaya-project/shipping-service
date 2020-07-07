package com.pdomingo.shipping.domain.adapter.usecase.event;

import com.pdoming.kernel.core.vobjects.Address;
import com.pdomingo.shipping.domain.event.ClientRegisteredEvent;
import com.pdomingo.shipping.domain.model.Client;
import com.pdomingo.shipping.domain.model.ids.ClientId;
import com.pdomingo.shipping.domain.port.primary.event.ClientRegisteredEventHandler;
import com.pdomingo.shipping.domain.port.secondary.ClientRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class ClientRegisteredEventHandlerAdapter implements ClientRegisteredEventHandler {

	private final ClientRepository clientRepository;

	@Override
	public void onClientRegisteredEvent(ClientRegisteredEvent event) {

		ClientId clientId = event.getSourceId();
		Address shippingAddress = event.getShippingAddress();

		log.info("Registering new client <{}> on database", clientId);

		clientRepository.save(new Client(clientId, shippingAddress));
	}
}