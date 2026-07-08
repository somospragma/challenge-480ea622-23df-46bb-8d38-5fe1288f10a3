package com.example.application;

import com.example.infrastructure.AwsClient;
import com.example.infrastructure.dto.AwsResourceDto;
import org.springframework.stereotype.Service;

@Service
public class AwsConsoleManagementService {

    private final AwsClient awsClient;

    public AwsConsoleManagementService(AwsClient awsClient) {
        this.awsClient = awsClient;
    }

    public AwsResourceDto getAwsResource(String resourceId) {
        return awsClient.getResource(resourceId);
    }

    public void configureAwsResource(AwsResourceDto resourceDto) {
        awsClient.configureResource(resourceDto);
    }
}