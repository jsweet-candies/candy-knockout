package def.knockout;
import jsweet.util.function.Function5;
import def.js.Array;
import jsweet.util.function.Consumer5;
@jsweet.lang.Interface
public abstract class KnockoutBindingHandler extends def.js.Object {
    @jsweet.lang.Optional
    public Array<String> after;
    @jsweet.lang.Optional
    public Function5<Object,java.util.function.Supplier<Object>,KnockoutAllBindingsAccessor,Object,KnockoutBindingContext,Init> init;
    @jsweet.lang.Optional
    public Consumer5<Object,java.util.function.Supplier<Object>,KnockoutAllBindingsAccessor,Object,KnockoutBindingContext> update;
    @jsweet.lang.Optional
    public Object options;
    @jsweet.lang.Optional
    public jsweet.util.function.TriFunction<String,String,java.util.function.BiConsumer<String,String>,String> preprocess;
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Init extends def.js.Object {
        public Boolean controlsDescendantBindings;
    }
    native public Init init(Object p1, java.util.function.Supplier<Object> p2, KnockoutAllBindingsAccessor p3, Object p4, KnockoutBindingContext p5);
    native public void update(Object p1, java.util.function.Supplier<Object> p2, KnockoutAllBindingsAccessor p3, Object p4, KnockoutBindingContext p5);
}

