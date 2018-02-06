package com.dp.chainofresponsibility;

public class Multiply implements Chain {


	private Chain nextInChain;
	@Override
	public void setNextChain(Chain chain) {
		// TODO Auto-generated method stub
		this.nextInChain=chain;
	}

	
	@Override
	public void calculate(Numbers request) {
		// TODO Auto-generated method stub
		
		if(request.getCalculateResult()=="mul"){
			System.out.println(request.getNumber1() + " * "+ request.getNumber2() + " = " + (request.getNumber1()* request.getNumber2()));
		}
		else
		{
			nextInChain.calculate(request);
		}
		
	}


}
