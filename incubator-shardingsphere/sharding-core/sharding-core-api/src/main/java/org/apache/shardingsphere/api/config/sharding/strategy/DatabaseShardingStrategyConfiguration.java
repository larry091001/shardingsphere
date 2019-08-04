/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
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
 * </p>
 */

package org.apache.shardingsphere.api.config.sharding.strategy;

import org.apache.shardingsphere.api.sharding.DatabaseShardingAlgorithm;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Hint sharding strategy configuration.
 *
 * @author zhangliang
 * @author larry
 */
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
public final class DatabaseShardingStrategyConfiguration implements ShardingStrategyConfiguration {
    private final String shardingColumn;
    private final String algorithmClassName;
    private volatile DatabaseShardingAlgorithm algorithm;

}