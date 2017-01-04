package def.knockout;
@jsweet.lang.Interface
public abstract class KnockoutSubscribable<T> extends KnockoutSubscribableFunctions<T> {
    native public KnockoutSubscription subscribe(java.util.function.Consumer<T> callback, Object target, def.knockout.StringTypes.beforeChange event);
    native public KnockoutSubscription subscribe(java.util.function.Consumer<T> callback, Object target, def.knockout.StringTypes.change event);
    native public <TEvent> KnockoutSubscription subscribe(java.util.function.Consumer<TEvent> callback, Object target, String event);
    native public KnockoutSubscribable<T> extend(RequestedExtenders requestedExtenders);
    native public double getSubscriptionsCount();
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class RequestedExtenders extends def.js.Object {
        native public java.lang.Object $get(String key);
    }
    native public KnockoutSubscription subscribe(java.util.function.Consumer<T> callback, Object target);
    native public KnockoutSubscription subscribe(java.util.function.Consumer<T> callback);
}

