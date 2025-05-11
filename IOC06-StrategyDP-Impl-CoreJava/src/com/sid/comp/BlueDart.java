package com.sid.comp;

public final class BlueDart implements ICourier{
	@Override
	public String deliver(int oid) {
		return oid+"order id items will be delivered using BlueDart";
	}

}
