package ch.bzz.bookshelf.model.service;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 *  Configure the web services and properties
 */

@ApplicationPath("/resource")

public class Config extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        HashSet providers = new HashSet<Class<?>>();
        providers.add(TestService.class);
        return providers;
    }
}
