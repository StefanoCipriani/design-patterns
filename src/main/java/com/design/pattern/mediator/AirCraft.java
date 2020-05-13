package com.design.pattern.mediator;

public abstract class AirCraft {

	protected AtcMediator mediator;
	protected String name;
	
	public AirCraft(AtcMediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;
	}
	
	public abstract void send(String msg);
	public abstract void receive (String msg);

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AirCraft other = (AirCraft) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	
}
