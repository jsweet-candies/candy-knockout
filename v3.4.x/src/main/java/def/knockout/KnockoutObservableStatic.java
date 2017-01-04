package def.knockout;
@jsweet.lang.Interface
public abstract class KnockoutObservableStatic extends def.js.Object {
    public KnockoutObservableFunctions<?> fn;
    native public <T> KnockoutObservable<T> apply(T value);
    native public <T> KnockoutObservable<T> apply();
}

