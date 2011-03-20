/*
 *    Copyright 2009-2010 The 99 Software Foundation
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.nnsoft.guice.rocoto.configuration.readers;

import static org.nnsoft.guice.rocoto.configuration.readers.PropertiesIterator.newPropertiesIterator;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * A simple {@code Entry<String, String>} implementation.
 *
 * @since 4.0
 */
public final class MapReader extends AbstractConfigurationReader {

    /**
     * The properties have to be read.
     */
    private final Map<String, String> properties;

    /**
     * Creates a new properties reader adapter.
     *
     * @param properties the properties have to be read.
     */
    public MapReader(Map<String, String> properties) {
        this.properties = properties;
    }

    /**
     * {@inheritDoc}
     */
    public Iterator<Entry<String, String>> readConfiguration() throws Exception {
        return newPropertiesIterator(getPrefix(), properties);
    }

}