package com.github.anilktalla.dagger2.sample;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SampleModule_BarServiceFactory implements Factory<IBarService> {
  private final SampleModule module;

  public SampleModule_BarServiceFactory(SampleModule module) {
    this.module = module;
  }

  @Override
  public IBarService get() {
    return Preconditions.checkNotNull(
        module.barService(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<IBarService> create(SampleModule module) {
    return new SampleModule_BarServiceFactory(module);
  }
}
