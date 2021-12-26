# lemonAPI
API end for the Lemon discord bot.

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

# Getting Started

```server:
  port: 5000
  servlet:
    context-path: /lemon

spring:
  application:
    name: lemon-api
  datasource:
    driver-class-name: org.postgresql.Driver
    url: Your database URL
    username: Your database username
    password: Your database password
  jpa:
    database-platform: org.hibernate.dialect.PostgreSQL10Dialect
    show-sql: true
    hibernate:
      ddl-auto: create-drop

jwt:
  secret: a secret to secure your JWT
```

