package com.ever;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class FirstApp extends Application
{
    @Override
    public synchronized Restlet createInboundRoot()
    {
        System.out.println("1111111111");
        Router router = new Router(getContext());
        router.attach("/hello",HelloWorld.class);
        return router;
    }
}
