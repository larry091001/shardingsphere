/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.core.strategy.route;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

import java.lang.reflect.Constructor;

import org.apache.shardingsphere.api.sharding.ShardingAlgorithm;
import org.apache.shardingsphere.core.exception.ShardingException;

/**
 * Sharding algorithm factory.
 * 
 * @author zhangliang
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ShardingAlgorithmFactory {
    
    /**
     * Create sharding algorithm.
     * 
     * @param shardingAlgorithmClassName sharding algorithm class name
     * @param superShardingAlgorithmClass sharding algorithm super class
     * @param <T> class generic type
     * @return sharding algorithm instance
     */
    @SneakyThrows
    @SuppressWarnings("unchecked")
    public static <T extends ShardingAlgorithm> T newInstance(final String shardingAlgorithmClassName, final Class<T> superShardingAlgorithmClass) {
        Class<?> result = Class.forName(shardingAlgorithmClassName);
        if (!superShardingAlgorithmClass.isAssignableFrom(result)) {
            throw new ShardingException("Class %s should be implement %s", shardingAlgorithmClassName, superShardingAlgorithmClass.getName());
        }
        return (T) result.newInstance();
    }
    
    /**
     * TODO larry 添加方法
     * @param shardingAlgorithmClassName
     * @param superShardingAlgorithmClass
     * @param paramsTypes 构造器参数类型
     * @param params 构造器参数
     * @param <T>
     * @return
     */
 	public static <T extends ShardingAlgorithm> T newInstance(final String shardingAlgorithmClassName, final Class<T> superShardingAlgorithmClass,  Class<?>[] paramsTypes, Object ... params) {
     	try {
     		Class<?> result = Class.forName(shardingAlgorithmClassName);
     		if(!superShardingAlgorithmClass.isAssignableFrom(result)) {
     			throw new ShardingException("Class %s should be implement %s", shardingAlgorithmClassName, superShardingAlgorithmClass.getName());
     		}
     		
     		if (null != params && params.length > 0) {
     			Constructor constructor = result.getConstructor(paramsTypes);
     			if (null != constructor) return (T) constructor.newInstance(params);
 			}
     		return (T) result.newInstance();
 		} catch (final ReflectiveOperationException ex) {
 			throw new ShardingException(ex);
 		}
     	
     }
}
