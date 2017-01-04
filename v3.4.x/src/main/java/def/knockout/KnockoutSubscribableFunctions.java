package def.knockout;
@jsweet.lang.Interface
public abstract class KnockoutSubscribableFunctions<T> extends def.js.Object {
    native public jsweet.util.union.Union<KnockoutBindingHandler,Object> $get(String key);
    native public void notifySubscribers(T valueToWrite, String event);
    native public void notifySubscribers(T valueToWrite);
    native public void notifySubscribers();
}

