package com.pdomingo.shipping.domain.model;

import com.pdomingo.shipping.domain.model.ids.OrderId;

public class Order {

	private final OrderId orderId;

	public Order(OrderId orderId) {
		this.orderId = orderId;
	}
}
