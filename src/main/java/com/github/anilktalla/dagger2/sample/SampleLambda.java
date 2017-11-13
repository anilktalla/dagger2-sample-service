package com.github.anilktalla.dagger2.sample;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class SampleLambda implements RequestHandler<Request,Response>{

	private final SampleComponent component;
	
	public SampleLambda(){
		component = DaggerSampleComponent.builder().build();
	}
	
	@Override
	public Response handleRequest(Request request, Context ctx) {
		Response response = new Response();
		response.setMessage(component.aggregate().aggregate());
		return response;
	}

}
