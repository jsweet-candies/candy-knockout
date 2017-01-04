package def.knockout;
import def.dom.Node;
@jsweet.lang.Interface
public abstract class KnockoutVirtualElements extends def.js.Object {
    public AllowedBindings allowedBindings;
    native public void emptyNode(KnockoutVirtualElement node);
    native public KnockoutVirtualElement firstChild(KnockoutVirtualElement node);
    native public void insertAfter(KnockoutVirtualElement container, Node nodeToInsert, Node insertAfter);
    native public Node nextSibling(KnockoutVirtualElement node);
    native public void prepend(KnockoutVirtualElement node, Node toInsert);
    native public void setDomNodeChildren(KnockoutVirtualElement node, NewChildren newChildren);
    native public Node[] childNodes(KnockoutVirtualElement node);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class AllowedBindings extends def.js.Object {
        native public java.lang.Boolean $get(String bindingName);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class NewChildren extends def.js.Object {
        public double length;
        native public Node $get(double index);
    }
}

