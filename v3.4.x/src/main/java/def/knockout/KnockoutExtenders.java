package def.knockout;
@jsweet.lang.Interface
public abstract class KnockoutExtenders extends def.js.Object {
    native public KnockoutComputed<?> throttle(Object target, double timeout);
    native public Object notify(Object target, String notifyWhen);
    native public Object rateLimit(Object target, double timeout);
    native public Object rateLimit(Object target, Options options);
    native public Object trackArrayChanges(Object target);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Options extends def.js.Object {
        public double timeout;
        @jsweet.lang.Optional
        public String method;
    }
}

