package com.github.anilktalla.dagger2.sample;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AggregateService_Factory implements Factory<AggregateService> {
  private final Provider<IFooService> fooServiceProvider;

  private final Provider<IBarService> barServiceProvider;

  public AggregateService_Factory(
      Provider<IFooService> fooServiceProvider, Provider<IBarService> barServiceProvider) {
    this.fooServiceProvider = fooServiceProvider;
    this.barServiceProvider = barServiceProvider;
  }

  @Override
  public AggregateService get() {
    return new AggregateService(fooServiceProvider.get(), barServiceProvider.get());
  }

  public static Factory<AggregateService> create(
      Provider<IFooService> fooServiceProvider, Provider<IBarService> barServiceProvider) {
    return new AggregateService_Factory(fooServiceProvider, barServiceProvider);
  }
}
