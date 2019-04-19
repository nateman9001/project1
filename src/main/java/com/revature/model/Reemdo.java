package com.revature.model;

public class Reemdo {

	private int reemId;
	private double amount;
	private String description;
	private String status;
	private String manager;
	
	
	
	
	
	
	public Reemdo() {
	
	}
	
	
	
	public Reemdo(int reemId, double amount, String description, String status, String manager) {
		super();
		this.reemId = reemId;
		this.amount = amount;
		this.description = description;
		this.status = status;
		this.manager = manager;
	}



	public int getReemId() {
		return reemId;
	}
	public void setReemId(int reemId) {
		this.reemId = reemId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((manager == null) ? 0 : manager.hashCode());
		result = prime * result + reemId;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		Reemdo other = (Reemdo) obj;
		if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (manager == null) {
			if (other.manager != null)
				return false;
		} else if (!manager.equals(other.manager))
			return false;
		if (reemId != other.reemId)
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Reemdo [reemId=" + reemId + ", amount=" + amount + ", description=" + description + ", status=" + status
				+ ", manager=" + manager + "]";
	}
	
	
	
	
}
