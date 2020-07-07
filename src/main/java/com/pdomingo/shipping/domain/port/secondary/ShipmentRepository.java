package com.pdomingo.shipping.domain.port.secondary;

import com.pdomingo.kernel.core.ddd.Repository;
import com.pdomingo.shipping.domain.model.Shipment;
import com.pdomingo.shipping.domain.model.ShipmentSpec;
import com.pdomingo.shipping.domain.model.ids.ShipmentId;

public interface ShipmentRepository extends Repository<Shipment, ShipmentId> {

	Shipment create(ShipmentSpec spec);
}
