package def.knockout;
@jsweet.lang.Interface
public abstract class KnockoutObservableStatic extends def.js.Object {
    public KnockoutObservableFunctions<?> fn;
    native public <T> KnockoutObservable<T> apply(T value);
    native public <T> KnockoutObservable<T> apply();
    native public <T> KnockoutObservable<T> apply(null value);
}

