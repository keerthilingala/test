package com.examplemockito.mockitodemo;

public class SomeBussinessImpl {
private DataService dataService;
int FindTheGreatestFromAllData() {
	int[] data=dataService.retrieveAllData();
	int greatest=Integer.MIN_VALUE;
	for(int value:data) {
		if(value>greatest) {
			greatest=value;
			
		}
		return greatest;
	}
}
}
