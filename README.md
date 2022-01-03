# lemonAPI
API end for the LemonUI and Lemonwire discord bot.

# Overview

API that lets you create, retrieve, update, and delete playlists and add songs to playlists. 

# Features

- Create playlists
- Edit playlists with other allowed users
- Make playlists public and share it with the world

# Technologies Used

- Postgresql  - 42.3.1
- Spring Boot - 2.5.5
  - Web
  - Logging
  - AOP
  - Test
  - Data JPA
  - Validation
  - Actuator
- JJWT        - 0.9.1
- Jacoco      - 0.8.7

# Setup

- Create a application.yml file under src/main/resources with these configs
```
server:
  port: 5000
  servlet:
    context-path: /lemon

spring:
  application:
    name: lemon-api
  datasource:
    driver-class-name: Database Driver
    url: Database URL
    username: Database username
    password: Database password
  jpa:
    database-platform: Database dialect
    show-sql: true
    hibernate:
      ddl-auto: create-drop

jwt:
  secret: Anything here to secretly hash your Auth token
```

# Contributors

  - Danh Tran
  - Dario Robinson
  - Jonah Landry
  - Minh Tuan Nguyen
  - Qi Zhang
