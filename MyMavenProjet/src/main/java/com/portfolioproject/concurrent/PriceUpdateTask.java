package com.portfolioproject.concurrent;

import com.protfolioproject.model.Stock;

public class PriceUpdateTask implements Runnable 
{

    private String stockSymbol;
    public PriceUpdateTask(String stockSymbol)
    {
        this.stockSymbol = stockSymbol;
    }
public PriceUpdateTask(Stock stockForUpdate) {
		// TODO Auto-generated constructor stub
	}
@Override
    public void run() 
    {
        System.out.println("Updating price for " + stockSymbol +
                " - Thread: " +Thread.currentThread().getName());

        System.out.println("Price updated for " + stockSymbol +
                " - Thread: " +Thread.currentThread().getName());
    }
}
