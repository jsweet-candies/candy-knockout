package def.knockout;
import def.dom.Node;
@jsweet.lang.Interface
public abstract class KnockoutComputedDefine<T> extends def.js.Object {
    native public T read();
    native public void write(T value);
    @jsweet.lang.Optional
    public Node disposeWhenNodeIsRemoved;
    native public Boolean disposeWhen();
    @jsweet.lang.Optional
    public Object owner;
    @jsweet.lang.Optional
    public Boolean deferEvaluation;
    @jsweet.lang.Optional
    public Boolean pure;
}

