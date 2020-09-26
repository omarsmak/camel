/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.mybatis;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class MyBatisEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":statement";

    private static final Set<String> PROPERTY_NAMES;
    static {
        Set<String> set = new HashSet<>(33);
        set.add("statement");
        set.add("bridgeErrorHandler");
        set.add("maxMessagesPerPoll");
        set.add("onConsume");
        set.add("routeEmptyResultSet");
        set.add("sendEmptyMessageWhenIdle");
        set.add("transacted");
        set.add("useIterator");
        set.add("exceptionHandler");
        set.add("exchangePattern");
        set.add("pollStrategy");
        set.add("processingStrategy");
        set.add("executorType");
        set.add("inputHeader");
        set.add("lazyStartProducer");
        set.add("outputHeader");
        set.add("statementType");
        set.add("basicPropertyBinding");
        set.add("synchronous");
        set.add("backoffErrorThreshold");
        set.add("backoffIdleThreshold");
        set.add("backoffMultiplier");
        set.add("delay");
        set.add("greedy");
        set.add("initialDelay");
        set.add("repeatCount");
        set.add("runLoggingLevel");
        set.add("scheduledExecutorService");
        set.add("scheduler");
        set.add("schedulerProperties");
        set.add("startScheduler");
        set.add("timeUnit");
        set.add("useFixedDelay");
        PROPERTY_NAMES = set;
    }


    @Override
    public boolean isEnabled(String scheme) {
        return "mybatis".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "statement", null, true, copy);
        uri = buildQueryParameters(uri, copy);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}
