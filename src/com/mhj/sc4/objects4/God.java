package com.mhj.sc4.objects4;

public final class God {
	
	private final String NAME = "";
	
	private static God god;
	
	private God() {}
	
	public static God getInstance() {
		if(God.god == null) {
			God.god = new God();
		}
		return God.god;
	}

	public final String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
