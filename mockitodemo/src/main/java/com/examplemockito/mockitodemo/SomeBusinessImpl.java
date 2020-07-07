package com.examplemockito.mockitodemo;

public class SomeBusinessImpl {
private DataServices dataService;
  public SomeBusinessImpl(DataServices dataService) {
	  super();
	  this.dataService = dataService;
  }



 int findTheGreatestFromAllData() {
	int[] data=dataService.retrieveAllData();
	int greatest=Integer.MIN_VALUE;
	
	for(int value : data) {
		if(value>greatest) {
			greatest = value;
		}
	}
	return greatest;
}
}
