package de.kosmos_lab.platform.plugins.web.example.servlets;

import de.kosmos_lab.kosmos.platform.IController;
import de.kosmos_lab.kosmos.platform.web.KosmoSHttpServletRequest;
import de.kosmos_lab.kosmos.platform.web.WebServer;
import de.kosmos_lab.kosmos.platform.web.servlets.AuthedServlet;
import org.pf4j.Extension;
import org.pf4j.ExtensionPoint;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Extension
@WebServlet(urlPatterns = {"/example/authed"}, loadOnStartup = 1)
public class PluginHelloWorldAuthedServlet extends AuthedServlet implements ExtensionPoint {


    public PluginHelloWorldAuthedServlet(WebServer webServer, IController controller) {
        super(webServer, controller);
    }

    public void get(KosmoSHttpServletRequest request, HttpServletResponse response)

            throws  IOException {

        sendText(request,response,String.format("Hello %s!", request.getKosmoSUser().getName()));
    }


}

