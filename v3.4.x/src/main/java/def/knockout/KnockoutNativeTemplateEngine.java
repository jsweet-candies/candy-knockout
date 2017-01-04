package def.knockout;
@jsweet.lang.Interface
public abstract class KnockoutNativeTemplateEngine extends def.js.Object {
    native public Object[] renderTemplateSource(Object templateSource, KnockoutBindingContext bindingContext, Object options);
    native public Object[] renderTemplateSource(Object templateSource, KnockoutBindingContext bindingContext);
    native public Object[] renderTemplateSource(Object templateSource);
}

