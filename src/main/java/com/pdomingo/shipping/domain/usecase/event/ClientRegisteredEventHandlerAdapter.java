package com.pdomingo.shipping.domain.usecase.event;

import com.pdomingo.shipping.domain.event.ClientRegisteredEvent;
import com.pdomingo.shipping.domain.model.Client;
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
		clientRepository.save(
				new Client(
						event.getSourceId(),
						event.getShippingAddress()
				)
		);
	}
}
