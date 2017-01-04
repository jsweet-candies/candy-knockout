package def.knockout;
@jsweet.lang.Interface
public abstract class KnockoutObservableFunctions<T> extends def.js.Object {
    native public jsweet.util.union.Union<KnockoutBindingHandler,Object> $get(String key);
    native public Boolean equalityComparer(Object a, Object b);
}

