package web.service.newsfeed.config;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean("follow-service")
    ManagedChannel followGrpcBeanChanel(){
        return ManagedChannelBuilder.forAddress("localhost", 6569).usePlaintext().build();
    }
}
