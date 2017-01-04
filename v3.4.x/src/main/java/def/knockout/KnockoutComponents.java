package def.knockout;
import def.dom.Node;
@jsweet.lang.Interface
public abstract class KnockoutComponents extends def.js.Object {
    native public void register(String componentName, def.knockout.knockoutcomponenttypes.Config config);
    native public Boolean isRegistered(String componentName);
    native public void unregister(String componentName);
    native public void get(String componentName, java.util.function.Consumer<def.knockout.knockoutcomponenttypes.Definition> callback);
    native public void clearCachedDefinition(String componentName);
    public def.knockout.knockoutcomponenttypes.Loader defaultLoader;
    public def.knockout.knockoutcomponenttypes.Loader[] loaders;
    native public String getComponentNameForNode(Node node);
    native public void register(String componentName, def.knockout.knockoutcomponenttypes.EmptyConfig config);
}

