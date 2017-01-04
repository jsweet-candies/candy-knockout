package def.knockout;
import def.js.Error;
import def.js.Function;
import def.dom.Node;
import def.dom.HTMLElement;
import jsweet.util.function.Consumer5;
import def.dom.Document;
import def.dom.Element;
@jsweet.lang.Interface
public abstract class KnockoutStatic extends def.js.Object {
    public KnockoutUtils utils;
    public KnockoutMemoization memoization;
    public KnockoutBindingHandlers bindingHandlers;
    native public KnockoutBindingHandler getBindingHandler(String handler);
    public KnockoutVirtualElements virtualElements;
    public KnockoutExtenders extenders;
    native public void applyBindings(Object viewModelOrBindingContext, Object rootNode);
    native public void applyBindingsToDescendants(Object viewModelOrBindingContext, Object rootNode);
    native public void applyBindingAccessorsToNode(Node node, java.lang.Object bindings, KnockoutBindingContext bindingContext);
    native public void applyBindingAccessorsToNode(Node node, java.lang.Object bindings, Object viewModel);
    native public Object applyBindingsToNode(Node node, Object bindings, Object viewModelOrBindingContext);
    public KnockoutSubscribableStatic subscribable;
    public KnockoutObservableStatic observable;
    public KnockoutComputedStatic computed;
    native public <T> KnockoutComputed<T> pureComputed(java.util.function.Supplier<T> evaluatorFunction, Object context);
    native public <T> KnockoutComputed<T> pureComputed(KnockoutComputedDefine<T> options, Object context);
    public KnockoutObservableArrayStatic observableArray;
    native public Object contextFor(Object node);
    native public Boolean isSubscribable(Object instance);
    native public String toJSON(Object viewModel, Function replacer, Object space);
    native public Object toJS(Object viewModel);
    native public Boolean isObservable(Object instance);
    native public Boolean isWriteableObservable(Object instance);
    native public Boolean isComputed(Object instance);
    native public Object dataFor(Object node);
    native public void removeNode(Element node);
    native public Element cleanNode(Element node);
    native public Object renderTemplate(Function template, Object viewModel, Object options, Object target, Object renderMode);
    native public Object renderTemplate(String template, Object viewModel, Object options, Object target, Object renderMode);
    native public <T> T unwrap(KnockoutObservable<T> value);
    public KnockoutComputedContext computedContext;
    public KnockoutTemplateSources templateSources;
    public TemplateEngine templateEngine;
    public TemplateRewriting templateRewriting;
    public NativeTemplateEngine nativeTemplateEngine;
    public JqueryTmplTemplateEngine jqueryTmplTemplateEngine;
    native public void setTemplateEngine(KnockoutNativeTemplateEngine templateEngine);
    native public Object renderTemplate(Function template, KnockoutBindingContext dataOrBindingContext, Object options, Node targetNodeOrNodeArray, String renderMode);
    native public Object renderTemplate(Object template, KnockoutBindingContext dataOrBindingContext, Object options, Node targetNodeOrNodeArray, String renderMode);
    native public Object renderTemplate(Function template, Object dataOrBindingContext, Object options, Node targetNodeOrNodeArray, String renderMode);
    native public Object renderTemplate(Object template, Object dataOrBindingContext, Object options, Node targetNodeOrNodeArray, String renderMode);
    native public Object renderTemplate(Function template, KnockoutBindingContext dataOrBindingContext, Object options, Node[] targetNodeOrNodeArray, String renderMode);
    native public Object renderTemplate(Object template, KnockoutBindingContext dataOrBindingContext, Object options, Node[] targetNodeOrNodeArray, String renderMode);
    native public Object renderTemplate(Function template, Object dataOrBindingContext, Object options, Node[] targetNodeOrNodeArray, String renderMode);
    native public Object renderTemplate(Object template, Object dataOrBindingContext, Object options, Node[] targetNodeOrNodeArray, String renderMode);
    native public Object renderTemplateForEach(Function template, Object[] arrayOrObservableArray, Object options, Node targetNode, KnockoutBindingContext parentBindingContext);
    native public Object renderTemplateForEach(Object template, Object[] arrayOrObservableArray, Object options, Node targetNode, KnockoutBindingContext parentBindingContext);
    native public Object renderTemplateForEach(Function template, KnockoutObservable<?> arrayOrObservableArray, Object options, Node targetNode, KnockoutBindingContext parentBindingContext);
    native public Object renderTemplateForEach(Object template, KnockoutObservable<?> arrayOrObservableArray, Object options, Node targetNode, KnockoutBindingContext parentBindingContext);
    public ExpressionRewriting expressionRewriting;
    public BindingProvider bindingProvider;
    public SelectExtensions selectExtensions;
    public KnockoutComponents components;
    public Options options;
    public KnockoutTasks tasks;
    @jsweet.lang.Optional
    public java.util.function.Consumer<Error> onError;
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class TemplateEngine extends def.js.Object {
        public KnockoutTemplateEngine prototype;
        public TemplateEngine(){}
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class TemplateRewriting extends def.js.Object {
        native public Object ensureTemplateIsRewritten(Node template, KnockoutTemplateEngine templateEngine, Document templateDocument);
        native public Object ensureTemplateIsRewritten(String template, KnockoutTemplateEngine templateEngine, Document templateDocument);
        native public Object memoizeBindingAttributeSyntax(String htmlString, KnockoutTemplateEngine templateEngine);
        native public String applyMemoizedBindingsToNextSibling(Object bindings, String nodeName);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class NativeTemplateEngine extends def.js.Object {
        public KnockoutNativeTemplateEngine prototype;
        public NativeTemplateEngine(){}
        public KnockoutNativeTemplateEngine instance;
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class JqueryTmplTemplateEngine extends def.js.Object {
        public KnockoutTemplateEngine prototype;
        native public Node[] renderTemplateSource(Object templateSource, KnockoutBindingContext bindingContext, Object options);
        native public String createJavaScriptEvaluatorBlock(String script);
        native public void addTemplate(String templateName, String templateMarkup);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class ExpressionRewriting extends def.js.Object {
        public Object[] bindingRewriteValidators;
        public Object twoWayBindings;
        public java.util.function.Function<String,Object[]> parseObjectLiteral;
        /**
        Internal, private KO utility for updating model properties from within bindings
        property:            If the property being updated is (or might be) an observable, pass it here
                             If it turns out to be a writable observable, it will be written to directly
        allBindings:         An object with a get method to retrieve bindings in the current execution context.
                             This will be searched for a '_ko_property_writers' property in case you're writing to a non-observable
                             (See note below)
        key:                 The key identifying the property to be written. Example: for { hasFocus: myValue }, write to 'myValue' by specifying the key 'hasFocus'
        value:               The value to be written
        checkIfDifferent:    If true, and if the property being written is a writable observable, the value will only be written if
                             it is !== existing value on that writable observable

        Note that if you need to write to the viewModel without an observable property,
        you need to set ko.expressionRewriting.twoWayBindings[key] = true; *before* the binding evaluation.
        */
        public Consumer5<jsweet.util.union.Union<KnockoutObservable<?>,?>,KnockoutAllBindingsAccessor,String,Object,Boolean> writeValueToProperty;
        native public void writeValueToProperty(jsweet.util.union.Union<KnockoutObservable<?>,?> p1, KnockoutAllBindingsAccessor p2, String p3, Object p4, Boolean p5);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class BindingProvider extends def.js.Object {
        public KnockoutBindingProvider instance;
        public BindingProvider(){}
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class SelectExtensions extends def.js.Object {
        native public Object readValue(HTMLElement element);
        native public void writeValue(HTMLElement element, Object value);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Options extends def.js.Object {
        public Boolean deferUpdates;
        public Boolean useOnlyNativeEvents;
    }
    native public void applyBindings(Object viewModelOrBindingContext);
    native public void applyBindings();
    native public Object applyBindingsToNode(Node node, Object bindings);
    native public <T> KnockoutComputed<T> pureComputed(java.util.function.Supplier<T> evaluatorFunction);
    native public <T> KnockoutComputed<T> pureComputed(KnockoutComputedDefine<T> options);
    native public String toJSON(Object viewModel, Function replacer);
    native public String toJSON(Object viewModel);
    native public Object renderTemplate(Function template, Object viewModel, Object options, Object target);
    native public Object renderTemplate(Function template, Object viewModel, Object options);
    native public Object renderTemplate(Function template, Object viewModel);
    native public Object renderTemplate(String template, Object viewModel, Object options, Object target);
    native public Object renderTemplate(String template, Object viewModel, Object options);
    native public Object renderTemplate(String template, Object viewModel);
    native public <T> T unwrap(T value);
    native public void setTemplateEngine(Object templateEngine);
    native public <T> def.knockout.KnockoutObservable<T> observable(T value);
    native public <T> def.knockout.KnockoutObservable<T> observable();
    native public <T> def.knockout.KnockoutComputed<T> computed();
    native public <T> def.knockout.KnockoutComputed<T> computed(java.util.function.Supplier<T> func, Object context, Object options);
    native public <T> def.knockout.KnockoutComputed<T> computed(def.knockout.KnockoutComputedDefine<T> def, Object context);
    native public <T> def.knockout.KnockoutComputed<T> computed(java.util.function.Supplier<T> func, Object context);
    native public <T> def.knockout.KnockoutComputed<T> computed(java.util.function.Supplier<T> func);
    native public <T> def.knockout.KnockoutComputed<T> computed(def.knockout.KnockoutComputedDefine<T> def);
    native public <T> def.knockout.KnockoutObservableArray<T> observableArray(T[] value);
    native public <T> def.knockout.KnockoutObservableArray<T> observableArray();
}

