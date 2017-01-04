package def.knockout;
import def.dom.Document;
import def.js.Function;
@jsweet.lang.Interface
public abstract class KnockoutTemplateEngine extends KnockoutNativeTemplateEngine {
    native public String createJavaScriptEvaluatorBlock(String script);
    native public Object makeTemplateSource(Object template, Document templateDocument);
    native public Object renderTemplate(Object template, KnockoutBindingContext bindingContext, Object options, Document templateDocument);
    native public Boolean isTemplateRewritten(Object template, Document templateDocument);
    native public void rewriteTemplate(Object template, Function rewriterCallback, Document templateDocument);
    native public Object makeTemplateSource(Object template);
}

