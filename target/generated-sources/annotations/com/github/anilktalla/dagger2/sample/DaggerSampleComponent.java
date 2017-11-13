package com.github.anilktalla.dagger2.sample;

import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerSampleComponent implements SampleComponent {
  private Provider<IFooService> fooServiceProvider;

  private Provider<IBarService> barServiceProvider;

  private Provider<IAggregateService> aggregateServiceProvider;

  private DaggerSampleComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static SampleComponent create() {
    return new Builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.fooServiceProvider =
        DoubleCheck.provider(SampleModule_FooServiceFactory.create(builder.sampleModule));
    this.barServiceProvider =
        DoubleCheck.provider(SampleModule_BarServiceFactory.create(builder.sampleModule));
    this.aggregateServiceProvider =
        DoubleCheck.provider(
            SampleModule_AggregateServiceFactory.create(
                builder.sampleModule, fooServiceProvider, barServiceProvider));
  }

  @Override
  public IAggregateService aggregate() {
    return aggregateServiceProvider.get();
  }

  public static final class Builder {
    private SampleModule sampleModule;

    private Builder() {}

    public SampleComponent build() {
      if (sampleModule == null) {
        this.sampleModule = new SampleModule();
      }
      return new DaggerSampleComponent(this);
    }

    public Builder sampleModule(SampleModule sampleModule) {
      this.sampleModule = Preconditions.checkNotNull(sampleModule);
      return this;
    }
  }
}
