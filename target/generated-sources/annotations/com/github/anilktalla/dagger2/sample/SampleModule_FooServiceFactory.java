package com.github.anilktalla.dagger2.sample;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SampleModule_FooServiceFactory implements Factory<IFooService> {
  private final SampleModule module;

  public SampleModule_FooServiceFactory(SampleModule module) {
    this.module = module;
  }

  @Override
  public IFooService get() {
    return Preconditions.checkNotNull(
        module.fooService(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<IFooService> create(SampleModule module) {
    return new SampleModule_FooServiceFactory(module);
  }
}
