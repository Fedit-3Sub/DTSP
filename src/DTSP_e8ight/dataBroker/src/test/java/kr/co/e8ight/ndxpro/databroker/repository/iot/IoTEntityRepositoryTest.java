package kr.co.e8ight.ndxpro.databroker.repository.iot;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import kr.co.e8ight.ndxpro.databroker.config.TestConfiguration;
import kr.co.e8ight.ndxpro.databroker.domain.Entity;
import kr.co.e8ight.ndxpro.databroker.domain.iot.IoTEntity;
import kr.co.e8ight.ndxpro.databroker.repository.iot.IoTEntityRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.TestPropertySource;

import javax.annotation.PostConstruct;

import static org.assertj.core.api.Assertions.assertThat;

@DataMongoTest
@TestPropertySource(properties = "spring.mongodb.embedded.version=4.4.4")
public class IoTEntityRepositoryTest {

    @Autowired
    private IoTEntityRepository ioTEntityRepository;

    private String testEntity = TestConfiguration.testEntityString;

    @PostConstruct
    public void setMongoDB() {
        ObjectMapper objectMapper = new ObjectMapper();
        IoTEntity entity;
        try {
            entity = objectMapper.readValue(testEntity, IoTEntity.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        ioTEntityRepository.save(entity);

        assertThat(ioTEntityRepository.findAll()).isNotNull();
        assertThat(ioTEntityRepository.findAll()).isNotEmpty();
    }

    @Test
    @DisplayName("IoT Entity 단건 조회 테스트")
    public void findByIdIdAndContext() {
        // given
        String entityId = "urn:e8ight:SimulationVehicle:1010";
        String context = "http://172.16.28.218:3005/e8ight-context-v1.0.1.jsonld";

        // when
        Entity entity = ioTEntityRepository.findByIdIdAndContext(entityId, context);

        // then
        assertThat(entity.getId().getId()).isEqualTo(entityId);
        assertThat(entity.getContext()).isEqualTo(context);
    }
}