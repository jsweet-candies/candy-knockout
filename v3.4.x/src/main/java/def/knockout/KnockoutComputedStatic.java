package def.knockout;
@jsweet.lang.Interface
public abstract class KnockoutComputedStatic extends def.js.Object {
    public KnockoutComputedFunctions<?> fn;
    native public <T> KnockoutComputed<T> apply();
    native public <T> KnockoutComputed<T> apply(java.util.function.Supplier<T> func, Object context, Object options);
    native public <T> KnockoutComputed<T> apply(KnockoutComputedDefine<T> def, Object context);
    native public <T> KnockoutComputed<T> apply(java.util.function.Supplier<T> func, Object context);
    native public <T> KnockoutComputed<T> apply(java.util.function.Supplier<T> func);
    native public <T> KnockoutComputed<T> apply(KnockoutComputedDefine<T> def);
}

