package com.github.anilktalla.dagger2.sample;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SampleModule_AggregateServiceFactory implements Factory<IAggregateService> {
  private final SampleModule module;

  private final Provider<IFooService> fooServiceProvider;

  private final Provider<IBarService> barServiceProvider;

  public SampleModule_AggregateServiceFactory(
      SampleModule module,
      Provider<IFooService> fooServiceProvider,
      Provider<IBarService> barServiceProvider) {
    this.module = module;
    this.fooServiceProvider = fooServiceProvider;
    this.barServiceProvider = barServiceProvider;
  }

  @Override
  public IAggregateService get() {
    return Preconditions.checkNotNull(
        module.aggregateService(fooServiceProvider.get(), barServiceProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<IAggregateService> create(
      SampleModule module,
      Provider<IFooService> fooServiceProvider,
      Provider<IBarService> barServiceProvider) {
    return new SampleModule_AggregateServiceFactory(module, fooServiceProvider, barServiceProvider);
  }
}
