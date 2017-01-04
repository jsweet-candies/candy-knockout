package def.knockout;
import jsweet.util.union.Union3;
@jsweet.lang.Interface
public abstract class KnockoutArrayChange<T> extends def.js.Object {
    public Union3<def.knockout.StringTypes.added,def.knockout.StringTypes.deleted,def.knockout.StringTypes.retained> status;
    public T value;
    public double index;
    @jsweet.lang.Optional
    public double moved;
}

