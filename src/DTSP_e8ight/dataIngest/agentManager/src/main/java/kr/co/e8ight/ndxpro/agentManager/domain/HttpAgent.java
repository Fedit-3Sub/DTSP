package kr.co.e8ight.ndxpro.agentManager.domain;

import kr.co.e8ight.ndxpro.agentManager.domain.dto.AgentRequestDto;
import kr.co.e8ight.ndxpro.agentManager.service.AgentStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "http_agent_info", schema = "agent_manager")
public class HttpAgent extends Agent {

    private String urlAddress;

    private String connTerm;

    private String method;

    private String body;

    public HttpAgent(AgentRequestDto requestDto, String configPath) {
        super(null, requestDto.getName(),
                requestDto.getType(),
                new ArrayList<>(),
                AgentStatus.CREATED,
                configPath,
                null,
                null,
                requestDto.getIsCustomTopic(),
                requestDto.getTopic(),
                null,
                null,
                null,
                null);
        this.urlAddress = requestDto.getUrlAddress();
        this.connTerm = requestDto.getConnTerm();
        this.method = requestDto.getMethod();
        this.body = requestDto.getBody();
    }

    public static HttpAgent create(AgentRequestDto requestDto, String configPath) {
        return new HttpAgent(requestDto, configPath);
    }

    public void update(AgentRequestDto requestDto) {
        super.update(requestDto);
        this.urlAddress = requestDto.getUrlAddress();
        this.connTerm = requestDto.getConnTerm();
        this.method = requestDto.getMethod();
        this.body = requestDto.getBody();
    }
}
