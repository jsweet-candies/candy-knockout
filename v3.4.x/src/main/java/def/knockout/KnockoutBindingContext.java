package def.knockout;
import def.dom.Node;
import def.js.Function;
@jsweet.lang.Interface
public abstract class KnockoutBindingContext extends def.js.Object {
    public Object $parent;
    public Object[] $parents;
    public Object $root;
    public Object $data;
    public jsweet.util.union.Union<?,KnockoutObservable<?>> $rawData;
    @jsweet.lang.Optional
    public KnockoutObservable<Double> $index;
    @jsweet.lang.Optional
    public KnockoutBindingContext $parentContext;
    public Object $component;
    public Node[] $componentTemplateNodes;
    native public Object extend(Object properties);
    native public Object createChildContext(Object dataItemOrAccessor, Object dataItemAlias, Function extendCallback);
    native public Object createChildContext(Object dataItemOrAccessor, Object dataItemAlias);
    native public Object createChildContext(Object dataItemOrAccessor);
    native public Double $index();
    native public void $index(Double value);
}

