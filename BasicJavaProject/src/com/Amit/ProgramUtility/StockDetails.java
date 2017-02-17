package com.Amit.ProgramUtility;

public class StockDetails
{
	private String stockName;
	private int noOfShares;
	private double sharePrice;
	
	public StockDetails(String stockName, int noOfShares, double sharePrice) {
		this.stockName = stockName;
		this.noOfShares = noOfShares;
		this.sharePrice = sharePrice;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public int getNoOfShares() {
		return noOfShares;
	}
	public void setNoOfShares(int noOfShares) {
		this.noOfShares = noOfShares;
	}
	public double getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}
	@Override
	public String toString() {
		return "StockDetails [stockName=" + stockName + ", noOfShares=" + noOfShares + ", sharePrice=" + sharePrice
				+ "]";
	}
	

}
