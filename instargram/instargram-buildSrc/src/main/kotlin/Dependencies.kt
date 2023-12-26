object Dependencies {

    // ktlint
    const val KTLINT = "com.pinterest:ktlint:${DependencyVersions.KTLINT_VERSION}"

    // kotlin
    const val KOTLIN_REFLECT = "org.jetbrains.kotlin:kotlin-reflect"
    const val KOTLIN_JDK = "org.jetbrains.kotlin:kotlin-stdlib-jdk8"
    const val JACKSON = "com.fasterxml.jackson.module:jackson-module-kotlin"

    // web
    const val SPRING_WEB = "org.springframework.boot:spring-boot-starter-web"

    // validation
    const val SPRING_VALIDATION = "org.springframework.boot:spring-boot-starter-validation"

    // transaction
    const val SPRING_TRANSACTION = "org.springframework:spring-tx:${DependencyVersions.SPRING_TRANSACTION}"

    // querydsl
    const val QUERYDSL = "com.querydsl:querydsl-jpa:${DependencyVersions.QUERYDSL}"
    const val QUERYDSL_PROCESSOR = "com.querydsl:querydsl-apt:${DependencyVersions.QUERYDSL}:jpa"

    // configuration
    const val CONFIGURATION_PROCESSOR = "org.springframework.boot:spring-boot-configuration-processor"

    // database
    const val SPRING_DATA_JPA = "org.springframework.boot:spring-boot-starter-data-jpa"
    const val MYSQL_CONNECTOR = "mysql:mysql-connector-java"
    const val SPRING_REDIS = "org.springframework.boot:spring-boot-starter-data-redis"
    const val REDIS = "org.springframework.data:spring-data-redis:${DependencyVersions.REDIS_VERSION}"

    // security
    const val SPRING_SECURITY = "org.springframework.boot:spring-boot-starter-security"

    // jwt
    const val JWT = "io.jsonwebtoken:jjwt:${DependencyVersions.JWT_VERSION}"

    // aws
    const val SPRING_AWS = "org.springframework.cloud:spring-cloud-starter-aws:${DependencyVersions.AWS_VERSION}"

    // test
    const val SPRING_TEST = "org.springframework.boot:spring-boot-starter-test:${PluginVersions.SPRING_BOOT_VERSION}"

    // sentry

    // Kafka
    const val KAFKA = "org.springframework.kafka:spring-kafka"

    // Cloud Config
    const val CLOUD_CONFIG = "org.springframework.cloud:spring-cloud-config-client"

    // Cloud
    const val SPRING_CLOUD = "org.springframework.cloud:spring-cloud-dependencies:${DependencyVersions.SPRING_CLOUD_VERSION}"

    // Maven Plugin
    const val MAVEN_PLUGIN = "org.springframework.boot:spring-boot-maven-plugin:3.2.0"

    // Actuator
    const val ACTUATOR = "org.springframework.boot:spring-boot-starter-actuator"
}