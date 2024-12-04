# DTSP
1)디지털트윈 연합서비스 운영 기술 개발
2)개방형 서비스 API 기술 개발

# GetStart
1) portal install
```version: '3.8'

services:
  union-twin-fe:
    image: public.ecr.aws/y6m5z3z0/fede/union-twin-fe:latest
    restart: always
    environment:
      - NDXPRO_ENV_DIGITAL_TWIN_SEARCH_URL=http://220.124.222.86:8084/meta/exsearch/list
      - NDXPRO_ENV_TOKEN=eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiIyMSIsImF1dGgiOiJBRE1JTiIsImV4cCI6MjAwMDE2MzQ2NH0.9Ed_V3BRvA9ASU8tcFxS7Wrx16ACYV5Chn3MHb_6TUlIhTW8uPNG2d6ocNCyIBp4DNU84VqxCatLnzJc0_7cCA
      - NDXPRO_ENV_API_URL=http://172.16.28.222:54002
      - NDXPRO_ENV_PREDICTOR_TOOL_INSIDE_URL=http://localhost:8000
      - NDXPRO_ENV_API_OUTSIDE_URL=http://210.217.93.129:54003
      - NDXPRO_ENV_PREDICTOR_TOOL_OUTSIDE_URL=http://localhost:8000
    ports:
      - '50031:80'
```

# 연합트윈 프레임워크
![image](https://github.com/user-attachments/assets/91f2cbcd-73f2-43fd-868c-f39799a546f6)


# 연합트윈 프레임워크 대시보드
![image](https://github.com/user-attachments/assets/640a2d62-8926-4f18-8034-e8e49be17088)
