package com.github.anilktalla.dagger2.sample;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class SampleModule {

	@Provides
	@Singleton
	public IAggregateService aggregateService(IFooService fooService, IBarService barService) {
		return new AggregateService(fooService, barService);
	}

	@Provides
	@Singleton
	public IBarService barService() {
		return new BarService();
	}

	@Provides
	@Singleton
	public IFooService fooService() {
		return new FooService();
	}
}
