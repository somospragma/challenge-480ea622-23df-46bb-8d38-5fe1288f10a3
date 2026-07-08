package com.example.infrastructure;

import com.example.infrastructure.dto.AwsResourceDto;
import org.springframework.stereotype.Component;

@Component
public class AwsClient {

    public AwsResourceDto getResource(String resourceId) {
        // Implementación para obtener un recurso de AWS
        return new AwsResourceDto();
    }

    public void configureResource(AwsResourceDto resourceDto) {
        // Implementación para configurar un recurso de AWS
    }
}