package def.knockout;
@jsweet.lang.Interface
public abstract class KnockoutComputedContext extends def.js.Object {
    native public double getDependenciesCount();
    public java.util.function.Supplier<Boolean> isInitial;
    public Boolean isSleeping;
}

