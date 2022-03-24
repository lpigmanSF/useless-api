# The Most Useless API Ever Invented

## Quick Reference
- **Maintained by:** This api will not be maintained in the slightest
- **Where to get help**:
  
## Supported Tags
- [latest](https://hub.docker.com/repository/docker/lukepig/useless-api)
  
## Quick reference (cont.)
- **Where to file issues**: Notepad++
- **Supported architectures**: amd64

## Build Args
|type |variable_name  | value|
--- | --- | ---|
|Image|BASE_IMAGE| openjdk:11-jdk-slim|


## What is **this**?
This is a simple rest api with 3 endpoints
 - **`/`** : this is the default endpoint
 - **`/hello`**: this one will say hello to you
 - **`/bunny`**: this one has a picture of a bunny

## How to use this image

### Run it

- ` $  docker run -p 8080:8080 lukepig/useless-api`
- Navigate in your browser to [localhost:8080](localhost:8080)
- Have a blast hitting all those wonderful endpoints
