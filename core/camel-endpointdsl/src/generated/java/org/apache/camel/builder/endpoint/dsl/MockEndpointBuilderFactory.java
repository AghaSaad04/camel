/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The mock component is used for testing routes and mediation rules using
 * mocks.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface MockEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Mock component.
     */
    public interface MockEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedMockEndpointBuilder advanced() {
            return (AdvancedMockEndpointBuilder) this;
        }
        /**
         * Sets a grace period after which the mock endpoint will re-assert to
         * ensure the preliminary assertion is still valid. This is used for
         * example to assert that exactly a number of messages arrives. For
         * example if expectedMessageCount(int) was set to 5, then the assertion
         * is satisfied when 5 or more message arrives. To ensure that exactly 5
         * messages arrives, then you would need to wait a little period to
         * ensure no further message arrives. This is what you can use this
         * method for. By default this period is disabled.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 0
         * Group: producer
         */
        default MockEndpointBuilder assertPeriod(long assertPeriod) {
            doSetProperty("assertPeriod", assertPeriod);
            return this;
        }
        /**
         * Sets a grace period after which the mock endpoint will re-assert to
         * ensure the preliminary assertion is still valid. This is used for
         * example to assert that exactly a number of messages arrives. For
         * example if expectedMessageCount(int) was set to 5, then the assertion
         * is satisfied when 5 or more message arrives. To ensure that exactly 5
         * messages arrives, then you would need to wait a little period to
         * ensure no further message arrives. This is what you can use this
         * method for. By default this period is disabled.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Default: 0
         * Group: producer
         */
        default MockEndpointBuilder assertPeriod(String assertPeriod) {
            doSetProperty("assertPeriod", assertPeriod);
            return this;
        }
        /**
         * Specifies the expected number of message exchanges that should be
         * received by this endpoint. Beware: If you want to expect that 0
         * messages, then take extra care, as 0 matches when the tests starts,
         * so you need to set a assert period time to let the test run for a
         * while to make sure there are still no messages arrived; for that use
         * setAssertPeriod(long). An alternative is to use NotifyBuilder, and
         * use the notifier to know when Camel is done routing some messages,
         * before you call the assertIsSatisfied() method on the mocks. This
         * allows you to not use a fixed assert period, to speedup testing
         * times. If you want to assert that exactly n'th message arrives to
         * this mock endpoint, then see also the setAssertPeriod(long) method
         * for further details.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: -1
         * Group: producer
         */
        default MockEndpointBuilder expectedCount(int expectedCount) {
            doSetProperty("expectedCount", expectedCount);
            return this;
        }
        /**
         * Specifies the expected number of message exchanges that should be
         * received by this endpoint. Beware: If you want to expect that 0
         * messages, then take extra care, as 0 matches when the tests starts,
         * so you need to set a assert period time to let the test run for a
         * while to make sure there are still no messages arrived; for that use
         * setAssertPeriod(long). An alternative is to use NotifyBuilder, and
         * use the notifier to know when Camel is done routing some messages,
         * before you call the assertIsSatisfied() method on the mocks. This
         * allows you to not use a fixed assert period, to speedup testing
         * times. If you want to assert that exactly n'th message arrives to
         * this mock endpoint, then see also the setAssertPeriod(long) method
         * for further details.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: -1
         * Group: producer
         */
        default MockEndpointBuilder expectedCount(String expectedCount) {
            doSetProperty("expectedCount", expectedCount);
            return this;
        }
        /**
         * Sets whether assertIsSatisfied() should fail fast at the first
         * detected failed expectation while it may otherwise wait for all
         * expected messages to arrive before performing expectations
         * verifications. Is by default true. Set to false to use behavior as in
         * Camel 2.x.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default MockEndpointBuilder failFast(boolean failFast) {
            doSetProperty("failFast", failFast);
            return this;
        }
        /**
         * Sets whether assertIsSatisfied() should fail fast at the first
         * detected failed expectation while it may otherwise wait for all
         * expected messages to arrive before performing expectations
         * verifications. Is by default true. Set to false to use behavior as in
         * Camel 2.x.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default MockEndpointBuilder failFast(String failFast) {
            doSetProperty("failFast", failFast);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default MockEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default MockEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * A number that is used to turn on throughput logging based on groups
         * of the size.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: producer
         */
        default MockEndpointBuilder reportGroup(int reportGroup) {
            doSetProperty("reportGroup", reportGroup);
            return this;
        }
        /**
         * A number that is used to turn on throughput logging based on groups
         * of the size.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: producer
         */
        default MockEndpointBuilder reportGroup(String reportGroup) {
            doSetProperty("reportGroup", reportGroup);
            return this;
        }
        /**
         * Sets the minimum expected amount of time (in millis) the
         * assertIsSatisfied() will wait on a latch until it is satisfied.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 0
         * Group: producer
         */
        default MockEndpointBuilder resultMinimumWaitTime(
                long resultMinimumWaitTime) {
            doSetProperty("resultMinimumWaitTime", resultMinimumWaitTime);
            return this;
        }
        /**
         * Sets the minimum expected amount of time (in millis) the
         * assertIsSatisfied() will wait on a latch until it is satisfied.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Default: 0
         * Group: producer
         */
        default MockEndpointBuilder resultMinimumWaitTime(
                String resultMinimumWaitTime) {
            doSetProperty("resultMinimumWaitTime", resultMinimumWaitTime);
            return this;
        }
        /**
         * Sets the maximum amount of time (in millis) the assertIsSatisfied()
         * will wait on a latch until it is satisfied.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 0
         * Group: producer
         */
        default MockEndpointBuilder resultWaitTime(long resultWaitTime) {
            doSetProperty("resultWaitTime", resultWaitTime);
            return this;
        }
        /**
         * Sets the maximum amount of time (in millis) the assertIsSatisfied()
         * will wait on a latch until it is satisfied.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Default: 0
         * Group: producer
         */
        default MockEndpointBuilder resultWaitTime(String resultWaitTime) {
            doSetProperty("resultWaitTime", resultWaitTime);
            return this;
        }
        /**
         * Specifies to only retain the first n'th number of received Exchanges.
         * This is used when testing with big data, to reduce memory consumption
         * by not storing copies of every Exchange this mock endpoint receives.
         * Important: When using this limitation, then the getReceivedCounter()
         * will still return the actual number of received Exchanges. For
         * example if we have received 5000 Exchanges, and have configured to
         * only retain the first 10 Exchanges, then the getReceivedCounter()
         * will still return 5000 but there is only the first 10 Exchanges in
         * the getExchanges() and getReceivedExchanges() methods. When using
         * this method, then some of the other expectation methods is not
         * supported, for example the expectedBodiesReceived(Object...) sets a
         * expectation on the first number of bodies received. You can configure
         * both setRetainFirst(int) and setRetainLast(int) methods, to limit
         * both the first and last received.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: -1
         * Group: producer
         */
        default MockEndpointBuilder retainFirst(int retainFirst) {
            doSetProperty("retainFirst", retainFirst);
            return this;
        }
        /**
         * Specifies to only retain the first n'th number of received Exchanges.
         * This is used when testing with big data, to reduce memory consumption
         * by not storing copies of every Exchange this mock endpoint receives.
         * Important: When using this limitation, then the getReceivedCounter()
         * will still return the actual number of received Exchanges. For
         * example if we have received 5000 Exchanges, and have configured to
         * only retain the first 10 Exchanges, then the getReceivedCounter()
         * will still return 5000 but there is only the first 10 Exchanges in
         * the getExchanges() and getReceivedExchanges() methods. When using
         * this method, then some of the other expectation methods is not
         * supported, for example the expectedBodiesReceived(Object...) sets a
         * expectation on the first number of bodies received. You can configure
         * both setRetainFirst(int) and setRetainLast(int) methods, to limit
         * both the first and last received.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: -1
         * Group: producer
         */
        default MockEndpointBuilder retainFirst(String retainFirst) {
            doSetProperty("retainFirst", retainFirst);
            return this;
        }
        /**
         * Specifies to only retain the last n'th number of received Exchanges.
         * This is used when testing with big data, to reduce memory consumption
         * by not storing copies of every Exchange this mock endpoint receives.
         * Important: When using this limitation, then the getReceivedCounter()
         * will still return the actual number of received Exchanges. For
         * example if we have received 5000 Exchanges, and have configured to
         * only retain the last 20 Exchanges, then the getReceivedCounter() will
         * still return 5000 but there is only the last 20 Exchanges in the
         * getExchanges() and getReceivedExchanges() methods. When using this
         * method, then some of the other expectation methods is not supported,
         * for example the expectedBodiesReceived(Object...) sets a expectation
         * on the first number of bodies received. You can configure both
         * setRetainFirst(int) and setRetainLast(int) methods, to limit both the
         * first and last received.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: -1
         * Group: producer
         */
        default MockEndpointBuilder retainLast(int retainLast) {
            doSetProperty("retainLast", retainLast);
            return this;
        }
        /**
         * Specifies to only retain the last n'th number of received Exchanges.
         * This is used when testing with big data, to reduce memory consumption
         * by not storing copies of every Exchange this mock endpoint receives.
         * Important: When using this limitation, then the getReceivedCounter()
         * will still return the actual number of received Exchanges. For
         * example if we have received 5000 Exchanges, and have configured to
         * only retain the last 20 Exchanges, then the getReceivedCounter() will
         * still return 5000 but there is only the last 20 Exchanges in the
         * getExchanges() and getReceivedExchanges() methods. When using this
         * method, then some of the other expectation methods is not supported,
         * for example the expectedBodiesReceived(Object...) sets a expectation
         * on the first number of bodies received. You can configure both
         * setRetainFirst(int) and setRetainLast(int) methods, to limit both the
         * first and last received.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: -1
         * Group: producer
         */
        default MockEndpointBuilder retainLast(String retainLast) {
            doSetProperty("retainLast", retainLast);
            return this;
        }
        /**
         * Allows a sleep to be specified to wait to check that this endpoint
         * really is empty when expectedMessageCount(int) is called with zero.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 0
         * Group: producer
         */
        default MockEndpointBuilder sleepForEmptyTest(long sleepForEmptyTest) {
            doSetProperty("sleepForEmptyTest", sleepForEmptyTest);
            return this;
        }
        /**
         * Allows a sleep to be specified to wait to check that this endpoint
         * really is empty when expectedMessageCount(int) is called with zero.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Default: 0
         * Group: producer
         */
        default MockEndpointBuilder sleepForEmptyTest(String sleepForEmptyTest) {
            doSetProperty("sleepForEmptyTest", sleepForEmptyTest);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Mock component.
     */
    public interface AdvancedMockEndpointBuilder
            extends
                EndpointProducerBuilder {
        default MockEndpointBuilder basic() {
            return (MockEndpointBuilder) this;
        }
        /**
         * Sets whether to make a deep copy of the incoming Exchange when
         * received at this mock endpoint. Is by default true.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer (advanced)
         */
        default AdvancedMockEndpointBuilder copyOnExchange(
                boolean copyOnExchange) {
            doSetProperty("copyOnExchange", copyOnExchange);
            return this;
        }
        /**
         * Sets whether to make a deep copy of the incoming Exchange when
         * received at this mock endpoint. Is by default true.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer (advanced)
         */
        default AdvancedMockEndpointBuilder copyOnExchange(String copyOnExchange) {
            doSetProperty("copyOnExchange", copyOnExchange);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedMockEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedMockEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedMockEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedMockEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    public interface MockBuilders {
        /**
         * Mock (camel-mock)
         * The mock component is used for testing routes and mediation rules
         * using mocks.
         * 
         * Category: core,testing
         * Since: 1.0
         * Maven coordinates: org.apache.camel:camel-mock
         * 
         * Syntax: <code>mock:name</code>
         * 
         * Path parameter: name (required)
         * Name of mock endpoint
         */
        default MockEndpointBuilder mock(String path) {
            return MockEndpointBuilderFactory.mock(path);
        }
    }
    /**
     * Mock (camel-mock)
     * The mock component is used for testing routes and mediation rules using
     * mocks.
     * 
     * Category: core,testing
     * Since: 1.0
     * Maven coordinates: org.apache.camel:camel-mock
     * 
     * Syntax: <code>mock:name</code>
     * 
     * Path parameter: name (required)
     * Name of mock endpoint
     */
    static MockEndpointBuilder mock(String path) {
        class MockEndpointBuilderImpl extends AbstractEndpointBuilder implements MockEndpointBuilder, AdvancedMockEndpointBuilder {
            public MockEndpointBuilderImpl(String path) {
                super("mock", path);
            }
        }
        return new MockEndpointBuilderImpl(path);
    }
}