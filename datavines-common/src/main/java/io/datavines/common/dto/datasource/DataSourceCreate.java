/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.datavines.common.dto.datasource;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NotNull(message = "DataSource Create cannot be null")
public class DataSourceCreate {

    @NotBlank(message = "DataSource workspaceId cannot be empty")
    private long workspaceId;

    @NotBlank(message = "DataSource name cannot be empty")
    private String name;

    @NotBlank(message = "DataSource type cannot be empty")
    private String type;

    @NotBlank(message = "DataSource param cannot be empty")
    private String param;
}