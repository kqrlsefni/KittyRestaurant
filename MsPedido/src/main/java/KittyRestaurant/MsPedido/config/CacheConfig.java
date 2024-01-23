package main.java.KittyRestaurant.MsPedido.config;

import java.time.Duration;

@Configuration
@EnableCaching
public class CacheConfig {
    @Bean
    public RedisConnectionFactory redisConnectionFactory(){
        return new LettuceConnectionFactory();
    }

    @Bean
    public CacheManager cacheManager(RedisConnectionFactory redisConnectionFactory){
        RedisCacheConfiguration redisCacheConfiguration = RedisCacheConfiguration.defaultCcaheConfig().entryTtl(Duration.ofMinutes(5));
        return RedisCacheManager.builder(redisCacheFactory).cacheDefaults(redisCacheConfiguration).build();
    }
}
