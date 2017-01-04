package def.knockout;
import def.js.Array;
import def.dom.Node;
import def.dom.Element;
import def.js.Function;
@jsweet.lang.Interface
public abstract class KnockoutUtils extends def.js.Object {
    public DomData domData;
    public DomNodeDisposal domNodeDisposal;
    native public <T> void addOrRemoveItem(T[] array, T value, T included);
    native public <T> T[] arrayFilter(T[] array, java.util.function.Function<T,Boolean> predicate);
    native public <T> T arrayFirst(T[] array, java.util.function.Function<T,Boolean> predicate, Object predicateOwner);
    native public <T> void arrayForEach(T[] array, java.util.function.BiConsumer<T,Double> action);
    native public <T> T[] arrayGetDistinctValues(T[] array);
    native public <T> double arrayIndexOf(T[] array, T item);
    native public <T,U> U[] arrayMap(T[] array, java.util.function.Function<T,U> mapping);
    native public <T> T[] arrayPushAll(T[] array, T[] valuesToPush);
    native public void arrayRemoveItem(Object[] array, Object itemToRemove);
    native public <T> Array<KnockoutArrayChange<T>> compareArrays(T[] a, T[] b);
    native public Object extend(Object target, Object source);
    public Object[] fieldsIncludedWithJsonPost;
    native public Object[] getFormFields(Object form, String fieldName);
    native public void objectForEach(Object obj, java.util.function.BiConsumer<Object,Object> action);
    native public Object[] parseHtmlFragment(String html);
    native public Object parseJson(String jsonString);
    native public void postJson(Object urlOrForm, Object data, Object options);
    native public <T> T peekObservable(KnockoutObservable<T> value);
    native public Object range(Object min, Object max);
    native public void registerEventHandler(Object element, Object eventType, Function handler);
    native public void setHtml(Element node, java.util.function.Supplier<String> html);
    native public void setHtml(Element node, String html);
    native public void setTextContent(Object element, String textContent);
    native public String stringifyJson(Object data, Function replacer, String space);
    native public void toggleDomNodeCssClass(Object node, String className, Boolean shouldHaveClass);
    native public void triggerEvent(Object element, Object eventType);
    native public <T> T unwrapObservable(KnockoutObservable<T> value);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class DomData extends def.js.Object {
        native public Object get(Element node, String key);
        native public void set(Element node, String key, Object value);
        native public Object getAll(Element node, Boolean createIfNotFound);
        native public Boolean clear(Element node);
    }
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class DomNodeDisposal extends def.js.Object {
        native public void addDisposeCallback(Element node, Function callback);
        native public void removeDisposeCallback(Element node, Function callback);
        native public Element cleanNode(Node node);
        native public void removeNode(Node node);
    }
    native public <T> T arrayFirst(T[] array, java.util.function.Function<T,Boolean> predicate);
    native public String stringifyJson(Object data, Function replacer);
    native public String stringifyJson(Object data);
    native public <T> void addOrRemoveItem(KnockoutObservable<T> array, T value, T included);
    native public <T> T[] arrayPushAll(KnockoutObservableArray<T> array, T[] valuesToPush);
    native public void setTextContent(Object element, KnockoutObservable<String> textContent);
    native public <T> T unwrapObservable(T value);
}

