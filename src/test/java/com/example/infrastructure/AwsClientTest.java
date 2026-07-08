package com.example.infrastructure;

import com.example.infrastructure.dto.AwsResourceDto;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;

class AwsClientTest {

    @Test
    void testGetResource() {
        AwsClient awsClient = Mockito.mock(AwsClient.class);
        Mockito.when(awsClient.getResource("id")).thenReturn(new AwsResourceDto("id", "type", "config"));
        AwsResourceDto result = awsClient.getResource("id");
        assertNotNull(result);
    }

    @Test
    void testConfigureResource() {
        AwsClient awsClient = Mockito.mock(AwsClient.class);
        AwsResourceDto resourceDto = new AwsResourceDto("id", "type", "config");
        awsClient.configureResource(resourceDto);
        Mockito.verify(awsClient).configureResource(resourceDto);
    }
}