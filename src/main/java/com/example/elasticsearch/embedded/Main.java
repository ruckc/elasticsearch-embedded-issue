/*
 * Copyright 2016 ruckc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.elasticsearch.embedded;

import java.io.IOException;
import java.io.InputStream;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.node.Node;

/**
 *
 * @author ruckc
 */
public class Main {

    public static void main(String... args) throws IOException {
        try (InputStream is = Main.class.getResourceAsStream("/elasticsearch.yml")) {
            Settings settings = Settings.builder().loadFromStream("elasticsearch.yml", is).build();

            Node node = new Node(settings);
            node.start();
        }
    }
}
