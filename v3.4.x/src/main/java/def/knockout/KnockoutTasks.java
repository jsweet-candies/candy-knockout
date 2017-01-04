package def.knockout;
import def.js.Function;
@jsweet.lang.Interface
public abstract class KnockoutTasks extends def.js.Object {
    public java.util.function.Function<Function,Object> scheduler;
    native public double schedule(Function task);
    native public void cancel(double handle);
    native public void runEarly();
}

