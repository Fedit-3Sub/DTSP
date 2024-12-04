# DTSP
1)디지털트윈 연합서비스 운영 기술 개발
2)개방형 서비스 API 기술 개발

# GetStart
1) portal install
```version: '3.8'

services:
  union-twin-fe:
    image: fdttwin/union-twin-fe:latest
    restart: always
    environment:
      - NDXPRO_ENV_TOKEN=eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiIxIiwiYXV0aCI6IkFETUlOIiwiZXhwIjoxNzMzOTkwNTQwfQ._VG-hAh6cVwgIkNn9Qg5YGYI5h6twPDssGoAePsI1Iw6QwhnLw1Dpjj2Xh773dLLzI4nPMpAM6jhD6hRVY99-w
      - NDXPRO_ENV_API_URL=http://HOST=172.16.28.220:54002
      - NDXPRO_ENV_API_OUTSIDE_URL=http://HOST=172.16.28.220:54002
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
```docker-compose up -d
```

3) portal down
```docker-compose down
```

# 연합트윈 프레임워크
![image](https://github.com/user-attachments/assets/91f2cbcd-73f2-43fd-868c-f39799a546f6)


# 연합트윈 프레임워크 대시보드
![image](https://github.com/user-attachments/assets/640a2d62-8926-4f18-8034-e8e49be17088)
