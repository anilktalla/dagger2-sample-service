package com.github.anilktalla.dagger2.sample;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = { SampleModule.class })
public interface SampleComponent {

	IAggregateService aggregate();
}
