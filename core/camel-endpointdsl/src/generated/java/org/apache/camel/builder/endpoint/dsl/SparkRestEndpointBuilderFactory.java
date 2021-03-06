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
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The spark-rest component is used for hosting REST services which has been
 * defined using Camel rest-dsl.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface SparkRestEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Spark Rest component.
     */
    public interface SparkRestEndpointBuilder extends EndpointConsumerBuilder {
        default AdvancedSparkRestEndpointBuilder advanced() {
            return (AdvancedSparkRestEndpointBuilder) this;
        }
        /**
         * Accept type such as: 'text/xml', or 'application/json'. By default we
         * accept all kinds of types.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default SparkRestEndpointBuilder accept(String accept) {
            doSetProperty("accept", accept);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default SparkRestEndpointBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default SparkRestEndpointBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Determines whether or not the raw input stream from Spark
         * HttpRequest#getContent() is cached or not (Camel will read the stream
         * into a in light-weight memory based Stream caching) cache. By default
         * Camel will cache the Netty input stream to support reading it
         * multiple times to ensure Camel can retrieve all data from the stream.
         * However you can set this option to true when you for example need to
         * access the raw stream, such as streaming it directly to a file or
         * other persistent store. Mind that if you enable this option, then you
         * cannot read the Netty stream multiple times out of the box, and you
         * would need manually to reset the reader index on the Spark raw
         * stream.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default SparkRestEndpointBuilder disableStreamCache(
                boolean disableStreamCache) {
            doSetProperty("disableStreamCache", disableStreamCache);
            return this;
        }
        /**
         * Determines whether or not the raw input stream from Spark
         * HttpRequest#getContent() is cached or not (Camel will read the stream
         * into a in light-weight memory based Stream caching) cache. By default
         * Camel will cache the Netty input stream to support reading it
         * multiple times to ensure Camel can retrieve all data from the stream.
         * However you can set this option to true when you for example need to
         * access the raw stream, such as streaming it directly to a file or
         * other persistent store. Mind that if you enable this option, then you
         * cannot read the Netty stream multiple times out of the box, and you
         * would need manually to reset the reader index on the Spark raw
         * stream.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default SparkRestEndpointBuilder disableStreamCache(
                String disableStreamCache) {
            doSetProperty("disableStreamCache", disableStreamCache);
            return this;
        }
        /**
         * If this option is enabled, then during binding from Spark to Camel
         * Message then the headers will be mapped as well (eg added as header
         * to the Camel Message as well). You can turn off this option to
         * disable this. The headers can still be accessed from the
         * org.apache.camel.component.sparkrest.SparkMessage message with the
         * method getRequest() that returns the Spark HTTP request instance.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: consumer
         */
        default SparkRestEndpointBuilder mapHeaders(boolean mapHeaders) {
            doSetProperty("mapHeaders", mapHeaders);
            return this;
        }
        /**
         * If this option is enabled, then during binding from Spark to Camel
         * Message then the headers will be mapped as well (eg added as header
         * to the Camel Message as well). You can turn off this option to
         * disable this. The headers can still be accessed from the
         * org.apache.camel.component.sparkrest.SparkMessage message with the
         * method getRequest() that returns the Spark HTTP request instance.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: consumer
         */
        default SparkRestEndpointBuilder mapHeaders(String mapHeaders) {
            doSetProperty("mapHeaders", mapHeaders);
            return this;
        }
        /**
         * If enabled and an Exchange failed processing on the consumer side,
         * and if the caused Exception was send back serialized in the response
         * as a application/x-java-serialized-object content type. This is by
         * default turned off. If you enable this then be aware that Java will
         * deserialize the incoming data from the request to Java and that can
         * be a potential security risk.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default SparkRestEndpointBuilder transferException(
                boolean transferException) {
            doSetProperty("transferException", transferException);
            return this;
        }
        /**
         * If enabled and an Exchange failed processing on the consumer side,
         * and if the caused Exception was send back serialized in the response
         * as a application/x-java-serialized-object content type. This is by
         * default turned off. If you enable this then be aware that Java will
         * deserialize the incoming data from the request to Java and that can
         * be a potential security risk.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default SparkRestEndpointBuilder transferException(
                String transferException) {
            doSetProperty("transferException", transferException);
            return this;
        }
        /**
         * If this option is enabled, then during binding from Spark to Camel
         * Message then the header values will be URL decoded (eg %20 will be a
         * space character.).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default SparkRestEndpointBuilder urlDecodeHeaders(
                boolean urlDecodeHeaders) {
            doSetProperty("urlDecodeHeaders", urlDecodeHeaders);
            return this;
        }
        /**
         * If this option is enabled, then during binding from Spark to Camel
         * Message then the header values will be URL decoded (eg %20 will be a
         * space character.).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default SparkRestEndpointBuilder urlDecodeHeaders(
                String urlDecodeHeaders) {
            doSetProperty("urlDecodeHeaders", urlDecodeHeaders);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Spark Rest component.
     */
    public interface AdvancedSparkRestEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default SparkRestEndpointBuilder basic() {
            return (SparkRestEndpointBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a: <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedSparkRestEndpointBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedSparkRestEndpointBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a: <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedSparkRestEndpointBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedSparkRestEndpointBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
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
        default AdvancedSparkRestEndpointBuilder basicPropertyBinding(
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
        default AdvancedSparkRestEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether or not the consumer should try to find a target consumer by
         * matching the URI prefix if no exact match is found.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedSparkRestEndpointBuilder matchOnUriPrefix(
                boolean matchOnUriPrefix) {
            doSetProperty("matchOnUriPrefix", matchOnUriPrefix);
            return this;
        }
        /**
         * Whether or not the consumer should try to find a target consumer by
         * matching the URI prefix if no exact match is found.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedSparkRestEndpointBuilder matchOnUriPrefix(
                String matchOnUriPrefix) {
            doSetProperty("matchOnUriPrefix", matchOnUriPrefix);
            return this;
        }
        /**
         * To use a custom SparkBinding to map to/from Camel message.
         * 
         * The option is a:
         * <code>org.apache.camel.component.sparkrest.SparkBinding</code> type.
         * 
         * Group: advanced
         */
        default AdvancedSparkRestEndpointBuilder sparkBinding(
                Object sparkBinding) {
            doSetProperty("sparkBinding", sparkBinding);
            return this;
        }
        /**
         * To use a custom SparkBinding to map to/from Camel message.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.sparkrest.SparkBinding</code> type.
         * 
         * Group: advanced
         */
        default AdvancedSparkRestEndpointBuilder sparkBinding(
                String sparkBinding) {
            doSetProperty("sparkBinding", sparkBinding);
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
        default AdvancedSparkRestEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedSparkRestEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    public interface SparkRestBuilders {
        /**
         * Spark Rest (camel-spark-rest)
         * The spark-rest component is used for hosting REST services which has
         * been defined using Camel rest-dsl.
         * 
         * Category: rest
         * Since: 2.14
         * Maven coordinates: org.apache.camel:camel-spark-rest
         * 
         * Syntax: <code>spark-rest:verb:path</code>
         * 
         * Path parameter: verb (required)
         * get, post, put, patch, delete, head, trace, connect, or options.
         * The value can be one of: get, post, put, patch, delete, head, trace,
         * connect, options
         * 
         * Path parameter: path (required)
         * The content path which support Spark syntax.
         */
        default SparkRestEndpointBuilder sparkRest(String path) {
            return SparkRestEndpointBuilderFactory.sparkRest(path);
        }
    }
    /**
     * Spark Rest (camel-spark-rest)
     * The spark-rest component is used for hosting REST services which has been
     * defined using Camel rest-dsl.
     * 
     * Category: rest
     * Since: 2.14
     * Maven coordinates: org.apache.camel:camel-spark-rest
     * 
     * Syntax: <code>spark-rest:verb:path</code>
     * 
     * Path parameter: verb (required)
     * get, post, put, patch, delete, head, trace, connect, or options.
     * The value can be one of: get, post, put, patch, delete, head, trace,
     * connect, options
     * 
     * Path parameter: path (required)
     * The content path which support Spark syntax.
     */
    static SparkRestEndpointBuilder sparkRest(String path) {
        class SparkRestEndpointBuilderImpl extends AbstractEndpointBuilder implements SparkRestEndpointBuilder, AdvancedSparkRestEndpointBuilder {
            public SparkRestEndpointBuilderImpl(String path) {
                super("spark-rest", path);
            }
        }
        return new SparkRestEndpointBuilderImpl(path);
    }
}