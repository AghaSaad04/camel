/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.model;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.apache.camel.CamelContext;

public class LogDefinitionPropertiesProvider implements PropertyPlaceholderAware {

    private final LogDefinition definition;
    private final Map<String, Supplier<String>> readPlaceholders = new HashMap<>();
    private final Map<String, Consumer<String>> writePlaceholders = new HashMap<>();

    public LogDefinitionPropertiesProvider(Object obj) {
        this.definition = (LogDefinition) obj;

        readPlaceholders.put("id", definition::getId);
        readPlaceholders.put("message", definition::getMessage);
        readPlaceholders.put("logName", definition::getLogName);
        readPlaceholders.put("marker", definition::getMarker);
        readPlaceholders.put("loggerRef", definition::getLoggerRef);
        writePlaceholders.put("id", definition::setId);
        writePlaceholders.put("message", definition::setMessage);
        writePlaceholders.put("logName", definition::setLogName);
        writePlaceholders.put("marker", definition::setMarker);
        writePlaceholders.put("loggerRef", definition::setLoggerRef);
    }

    @Override
    public Map<String, Supplier<String>> getReadPropertyPlaceholderOptions(CamelContext camelContext) {
        return readPlaceholders;
    }

    @Override
    public Map<String, Consumer<String>> getWritePropertyPlaceholderOptions(CamelContext camelContext) {
        return writePlaceholders;
    }
}