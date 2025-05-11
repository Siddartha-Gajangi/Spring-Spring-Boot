package com.sid.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public final class DTDC implements ICourier{
	@Override
	public String deliver(int oid) {
		return oid+"order id items will be delivered using DTDC";
	}

}
