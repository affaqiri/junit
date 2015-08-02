package org.junit.poc.ProteinTracker;

public class HistoryItem {

	private final int amount;
	
	private final String operation;
	
	private final int total;
	
	private final int id;
	
	public HistoryItem(int id, int amount, String operation, int total) {
		this.id = id;
		this.amount = amount;
		this.operation = operation;
		this.total = total;
	}

	public int getAmount() {
		return amount;
	}
	
	public String getOperation() {
		return operation;
	}

	public int getTotal() {
		return total;
	}

	public int getId() {
		return id;
	}
	
}