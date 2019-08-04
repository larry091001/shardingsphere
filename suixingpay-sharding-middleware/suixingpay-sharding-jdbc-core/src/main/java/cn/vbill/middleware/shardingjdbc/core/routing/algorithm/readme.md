# 说明

# 标准路由策略
`
    标准分片策略,仅支持单一主键分片
    PreciseShardingAlgorithm 必须实现，处理 = IN
    RangeShardingAlgorithm 可选实现，处理 BETWEEN，默认全库查询
`
- StandardShardingStrategy
    * RangeShardingAlgorithm
    * PreciseShardingAlgorithm


# 内联分片策略，groovy语法
- InlineShardingStrategy


# 强制路由，通过ThreadLocal实现
`
    只有在当前线程指定过HintManger规则后，实际路由时才会执行doSharding方法
`
- HintShardingStrategy
    * HintShardingAlgorithm


# 复合分片策略，支持多分片键
-  ComplexShardingStrategy
    * ComplexKeysShardingAlgorithm

# 不分片
- NoneShardingStrategy