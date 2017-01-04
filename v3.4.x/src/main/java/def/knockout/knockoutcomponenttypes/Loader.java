package def.knockout.knockoutcomponenttypes;
import def.dom.Node;
@jsweet.lang.Interface
public abstract class Loader extends def.js.Object {
    native public void getConfig(String componentName, java.util.function.Consumer<ComponentConfig> callback);
    native public void loadComponent(String componentName, ComponentConfig config, java.util.function.Consumer<Definition> callback);
    native public void loadTemplate(String componentName, Object templateConfig, java.util.function.Consumer<Node[]> callback);
    native public void loadViewModel(String componentName, Object viewModelConfig, java.util.function.Consumer<Object> callback);
    @jsweet.lang.Optional
    public Boolean suppressLoaderExceptions;
}

