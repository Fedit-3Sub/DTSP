# DTSP
연합트윈 서비스 플랫폼(Fedit)  프레임워크 메인 모듈 :

플랫폼에 등록된 디지털 트윈들의 객체정보를 재사용하고, 새로운 연합트윈 응용서비스 개발과 운영을 위한 디지털 트윈 저작도구 및 예측 분석 기술을 통합하여 제공합니다. 

# GetStart
1) portal install
```yaml
version: '3.8'

services:
  union-twin-fe:
    image: fdttwin/union-twin-fe:latest
    restart: always
    environment:
      - NDXPRO_ENV_TOKEN={Token}
      - NDXPRO_ENV_API_URL=http://220.124.222.90:54002
      - NDXPRO_ENV_API_OUTSIDE_URL=http://220.124.222.90:54002
      - NDXPRO_ENV_DIGITAL_TWIN_SEARCH_URL=http://220.124.222.86:8084/meta/exsearch/list
      - NDXPRO_ENV_VIEWER_URL=http://220.124.222.90:50038
      - NDXPRO_ENV_PREDICTOR_TOOL_URL=http://220.124.222.82:18080
      - NDXPRO_ENV_DISCRETE_SIMULATOR_URL=http://220.124.222.89
      - NDXPRO_ENV_SERVICE_LOGIC_TOOL_URL=http://bigsoft.iptime.org:9900/keti
      - NDXPRO_ENV_DIGITAL_TWIN_METADATA_REGISTRATION=http://220.124.222.86:8084/loginpass?to=/meta/exmanage/dt
      - NDXPRO_ENV_METADATA_VISUALIZATION_GRAPH=http://220.124.222.86:8084/loginpass?to=/meta/exmedatagraph
      - NDXPRO_ENV_UNION_OBJECT_SYNC_ENGINE_MANAGEMENT=http://220.124.222.84:5173
      - NDXPRO_ENV_VERIFICATION_DATA_ADDITION_MANAGEMENT=http://220.124.222.85:9102
    ports:
      - '50031:80'
networks:
  default:
    name: ndxpro
    external: true
```


2) portal run

```cmd
docker-compose up -d
```

3) portal down
   
```cmd
docker-compose down
```

# 연합트윈 프레임워크
![image](https://github.com/user-attachments/assets/91f2cbcd-73f2-43fd-868c-f39799a546f6)

# 연합트윈 프레임워크 대시보드
![image](https://github.com/user-attachments/assets/640a2d62-8926-4f18-8034-e8e49be17088)

# Funding
This work was supported by Institute of Information & communications Technology Planning & Evaluation (IITP) grant funded
by the Korea government (MSIT) (No.2022-0-00431, Development of open service platform and creation technology of federated intelligent digital twin, 100%).

