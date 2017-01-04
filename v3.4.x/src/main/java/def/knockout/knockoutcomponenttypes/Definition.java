package def.knockout.knockoutcomponenttypes;
import def.dom.Node;
@jsweet.lang.Interface
public abstract class Definition extends def.js.Object {
    public Node[] template;
    native public Object createViewModel(Object params, Options options);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Options extends def.js.Object {
        public Node element;
    }
}

