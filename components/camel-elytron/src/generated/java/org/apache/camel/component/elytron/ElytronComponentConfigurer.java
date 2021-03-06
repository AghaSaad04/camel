/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.elytron;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.component.undertow.UndertowComponentConfigurer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class ElytronComponentConfigurer extends UndertowComponentConfigurer implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        ElytronComponent target = (ElytronComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "elytronprovider":
        case "elytronProvider": target.setElytronProvider(property(camelContext, org.wildfly.security.WildFlyElytronBaseProvider.class, value)); return true;
        case "mechanismname":
        case "mechanismName": target.setMechanismName(property(camelContext, java.lang.String.class, value)); return true;
        case "securitydomainbuilder":
        case "securityDomainBuilder": target.setSecurityDomainBuilder(property(camelContext, org.wildfly.security.auth.server.SecurityDomain.Builder.class, value)); return true;
        default: return super.configure(camelContext, obj, name, value, ignoreCase);
        }
    }

}

