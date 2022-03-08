package de.kosmos_lab.platform.plugins.web.example;




import org.pf4j.Plugin;
import org.pf4j.PluginWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class WebExamplePlugin extends Plugin {
    protected static final Logger logger = LoggerFactory.getLogger("WebExamplePlugin");
    
    public WebExamplePlugin(PluginWrapper wrapper) {
        super(wrapper);
    }
    
    @Override
    public void start() {
        System.out.println("WebExamplePlugin.start()");
    }
    
    @Override
    public void stop() {
        System.out.println("WebExamplePlugin.stop()");
    }
   
    
}

