package com.example.application;

import com.example.infrastructure.AwsClient;
import com.example.infrastructure.dto.AwsResourceDto;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

class AwsConsoleManagementServiceTest {

    @Mock
    private AwsClient awsClient;

    @InjectMocks
    private AwsConsoleManagementService awsConsoleManagementService;

    public AwsConsoleManagementServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetAwsResource() {
        AwsResourceDto resourceDto = new AwsResourceDto("id", "type", "config");
        when(awsClient.getResource("id")).thenReturn(resourceDto);
        AwsResourceDto result = awsConsoleManagementService.getAwsResource("id");
        assert result.equals(resourceDto);
    }

    @Test
    void testConfigureAwsResource() {
        AwsResourceDto resourceDto = new AwsResourceDto("id", "type", "config");
        awsConsoleManagementService.configureAwsResource(resourceDto);
        verify(awsClient).configureResource(resourceDto);
    }
}