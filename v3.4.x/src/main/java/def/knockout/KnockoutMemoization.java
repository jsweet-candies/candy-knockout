package def.knockout;
@jsweet.lang.Interface
public abstract class KnockoutMemoization extends def.js.Object {
    native public String memoize(java.util.function.Supplier<String> callback);
    native public Boolean unmemoize(String memoId, Object[] callbackParams);
    native public Boolean unmemoizeDomNodeAndDescendants(Object domNode, Object[] extraCallbackParamsArray);
    native public String parseMemoText(String memoText);
}

