# Spring Boot Fields with @JsonProperty are ignored on serialization Bug

This minimal demo project reproduce a bug(?) I found in Spring Boot 1.2.3.RELEASE: 
Enable @JsonProperty will make it impossible to alter the property(by using HTTP PUT)     
Shortcut: https://github.com/cdcorg/JsonPropertyBug/blob/master/src/main/java/demothree/domain/Entity.java#L21

Without Spring Boot: the bug has been fixed. see https://jira.spring.io/browse/DATAREST-320

My Stack Overflow question:
http://stackoverflow.com/questions/29692942/fields-with-jsonproperty-are-still-ignored-on-serialization-in-spring-boot-sp
