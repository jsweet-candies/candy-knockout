package def.knockout;
@jsweet.lang.Interface
@jsweet.lang.Extends({KnockoutComputedFunctions.class})
public abstract class KnockoutComputed<T> extends KnockoutObservable<T> {
    public KnockoutComputedFunctions<?> fn;
    native public void dispose();
    native public Boolean isActive();
    native public double getDependenciesCount();
    native public KnockoutComputed<T> extend(RequestedExtenders requestedExtenders);
}

