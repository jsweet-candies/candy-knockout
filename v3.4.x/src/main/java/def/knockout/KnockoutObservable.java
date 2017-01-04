package def.knockout;
@jsweet.lang.Interface
@jsweet.lang.Extends({KnockoutObservableFunctions.class})
public abstract class KnockoutObservable<T> extends KnockoutSubscribable<T> {
    native public T apply();
    native public void apply(T value);
    native public T peek();
    @jsweet.lang.Optional
    public ValueHasMutated valueHasMutated;
    @jsweet.lang.Optional
    public ValueWillMutate valueWillMutate;
    native public KnockoutObservable<T> extend(RequestedExtenders requestedExtenders);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class ValueHasMutated extends def.js.Object {
        native public void apply();
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class ValueWillMutate extends def.js.Object {
        native public void apply();
    }
    native public Boolean equalityComparer(Object a, Object b);
    native public void valueHasMutated();
    native public void valueWillMutate();
}

