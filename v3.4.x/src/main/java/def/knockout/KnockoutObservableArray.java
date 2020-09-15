package def.knockout;
@jsweet.lang.Interface
@jsweet.lang.Extends({KnockoutObservableArrayFunctions.class})
public abstract class KnockoutObservableArray<T> extends KnockoutObservable<T[]> {
    native public KnockoutSubscription subscribe(java.util.function.Consumer<T[]> callback, Object target, def.knockout.StringTypes.beforeChange event);
    native public KnockoutSubscription subscribe(java.util.function.Consumer<T[]> callback, Object target, def.knockout.StringTypes.change event);
    native public <TEvent> KnockoutSubscription subscribe(java.util.function.Consumer<TEvent> callback, Object target, String event);
    native public KnockoutObservableArray<T> extend(RequestedExtenders requestedExtenders);
    native public double indexOf(T searchElement, double fromIndex);
    native public T[] slice(double start, double end);
    native public T[] splice(double start);
    native public T[] splice(double start, double deleteCount, @SuppressWarnings("unchecked") T... items);
    native public T pop();
    native public void push(@SuppressWarnings("unchecked") T... items);
    native public T shift();
    native public double unshift(@SuppressWarnings("unchecked") T... items);
    native public KnockoutObservableArray<T> reverse();
    native public KnockoutObservableArray<T> sort();
    native public KnockoutObservableArray<T> sort(java.util.function.BiFunction<T,T,Double> compareFunction);
    native public jsweet.util.union.Union<KnockoutBindingHandler,Object> $get(String key);
    native public void replace(T oldItem, T newItem);
    native public T[] remove(T item);
    native public T[] remove(java.util.function.Function<T,Boolean> removeFunction);
    native public T[] removeAll(T[] items);
    native public T[] removeAll();
    native public void destroy(T item);
    native public void destroy(java.util.function.Function<T,Boolean> destroyFunction);
    native public void destroyAll(T[] items);
    native public void destroyAll();
    native public KnockoutSubscription subscribe(java.util.function.Consumer<T[]> callback, Object target);
    native public KnockoutSubscription subscribe(java.util.function.Consumer<T[]> callback);
    native public double indexOf(T searchElement);
    native public T[] slice(double start);
}

