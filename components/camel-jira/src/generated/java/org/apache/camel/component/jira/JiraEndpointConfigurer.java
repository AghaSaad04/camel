/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jira;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class JiraEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        JiraEndpoint target = (JiraEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": target.getConfiguration().setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "consumerkey":
        case "consumerKey": target.getConfiguration().setConsumerKey(property(camelContext, java.lang.String.class, value)); return true;
        case "delay": target.getConfiguration().setDelay(property(camelContext, java.lang.Integer.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "jiraurl":
        case "jiraUrl": target.getConfiguration().setJiraUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "jql": target.setJql(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxresults":
        case "maxResults": target.setMaxResults(property(camelContext, java.lang.Integer.class, value)); return true;
        case "password": target.getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "privatekey":
        case "privateKey": target.getConfiguration().setPrivateKey(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "username": target.getConfiguration().setUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "verificationcode":
        case "verificationCode": target.getConfiguration().setVerificationCode(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

}

