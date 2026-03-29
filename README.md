##1: EUREKA SERVER REGISTRY
<img width="1427" height="852" alt="Screenshot 2026-03-23 at 9 51 06 PM" src="https://github.com/user-attachments/assets/5d3125f2-8e8f-4c38-900c-9730978170a6" />


##2: In case of Mac user following dependencies in api-gateway

```
<dependency>
    <groupId>io.netty</groupId>
    <artifactId>netty-resolver-dns-native-macos</artifactId>
    <classifier>osx-aarch_64</classifier> <!-- M1/M2 -->
</dependency>
```

##3: Logging - We're using followings - OpenTelemetry → Jaeger / Tempo in Order-Service
```
<dependencies>
    <!-- Actuator (REQUIRED) -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-actuator</artifactId>
    </dependency>

    <!-- OpenTelemetry bridge -->
    <dependency>
        <groupId>io.micrometer</groupId>
        <artifactId>micrometer-tracing-bridge-otel</artifactId>
    </dependency>

    <!-- Export traces -->
    <dependency>
        <groupId>io.opentelemetry</groupId>
        <artifactId>opentelemetry-exporter-otlp</artifactId>
    </dependency>

</dependencies>
```

##4: Jaeger UI -> http://localhost:16686/
<img width="1429" height="842" alt="Screenshot 2026-03-24 at 11 50 29 PM" src="https://github.com/user-attachments/assets/f58bf20a-50f1-451a-ba95-cb9abbb949b9" />



##5: Implemented circuitBreaker && retryAttempt Pattern b/w Catelog-serivce & Discount-service
