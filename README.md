# Minimal SpringBoot/Docker application

Minimal setup of a Hello World application running on SpringBoot and build with a Docker multi-staged build.

### Build 

```bash
docker build . -t springboot-docker-helloworld
```

### Run 

```bash
docker run -d -p 8080:8080 springboot-docker-helloworld
```
