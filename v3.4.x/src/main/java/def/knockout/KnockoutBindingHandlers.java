package def.knockout;
@jsweet.lang.Interface
public abstract class KnockoutBindingHandlers extends def.js.Object {
    native public KnockoutBindingHandler $get(String bindingHandler);
    public KnockoutBindingHandler visible;
    public KnockoutBindingHandler text;
    public KnockoutBindingHandler html;
    public KnockoutBindingHandler css;
    public KnockoutBindingHandler style;
    public KnockoutBindingHandler attr;
    public KnockoutBindingHandler foreach;
    @jsweet.lang.Name("if")
    public KnockoutBindingHandler If;
    public KnockoutBindingHandler ifnot;
    public KnockoutBindingHandler with;
    public KnockoutBindingHandler click;
    public KnockoutBindingHandler event;
    public KnockoutBindingHandler submit;
    public KnockoutBindingHandler enable;
    public KnockoutBindingHandler disable;
    public KnockoutBindingHandler value;
    public KnockoutBindingHandler textInput;
    public KnockoutBindingHandler hasfocus;
    public KnockoutBindingHandler checked;
    public KnockoutBindingHandler options;
    public KnockoutBindingHandler selectedOptions;
    public KnockoutBindingHandler uniqueName;
    public KnockoutBindingHandler template;
    public KnockoutBindingHandler component;
}

