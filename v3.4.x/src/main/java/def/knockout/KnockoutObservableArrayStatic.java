package def.knockout;
@jsweet.lang.Interface
public abstract class KnockoutObservableArrayStatic extends def.js.Object {
    public KnockoutObservableArrayFunctions<?> fn;
    native public <T> KnockoutObservableArray<T> $apply(T[] value);
    native public <T> KnockoutObservableArray<T> $apply();
}

