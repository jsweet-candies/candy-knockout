package def.knockout;
import def.dom.Node;
@jsweet.lang.Interface
public abstract class KnockoutBindingProvider extends def.js.Object {
    native public Boolean nodeHasBindings(Node node);
    native public java.lang.Object getBindings(Node node, KnockoutBindingContext bindingContext);
    native public GetBindingAccessors getBindingAccessors(Node node, KnockoutBindingContext bindingContext);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class GetBindingAccessors extends def.js.Object {
        native public java.lang.String $get(String key);
    }
}

