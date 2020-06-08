public class StringTest2 {
    public static void main(String[] args) {
        String a = "java";
        String b = "java";
        String c = new String("java");
        System.out.println(a == b);


        System.out.println(a.equals(b));


        System.out.println(a == c);


        System.out.println(a.equals(c));


        String d = c.intern();
        System.out.println(a == d);


        System.out.println(a.equals(d));

        /**
         * /home/xxx/soft/jdk1.8.0_212/bin/java -javaagent:/home/xxx/.local/share/JetBrains/Toolbox/apps/IDEA-C/ch-0/192.6603.28/lib/idea_rt.jar=39821:/home/xxx/.local/share/JetBrains/Toolbox/apps/IDEA-C/ch-0/192.6603.28/bin -Dfile.encoding=UTF-8 -classpath /home/xxx/soft/jdk1.8.0_212/jre/lib/charsets.jar:/home/xxx/soft/jdk1.8.0_212/jre/lib/deploy.jar:/home/xxx/soft/jdk1.8.0_212/jre/lib/ext/cldrdata.jar:/home/xxx/soft/jdk1.8.0_212/jre/lib/ext/dnsns.jar:/home/xxx/soft/jdk1.8.0_212/jre/lib/ext/jaccess.jar:/home/xxx/soft/jdk1.8.0_212/jre/lib/ext/jfxrt.jar:/home/xxx/soft/jdk1.8.0_212/jre/lib/ext/localedata.jar:/home/xxx/soft/jdk1.8.0_212/jre/lib/ext/nashorn.jar:/home/xxx/soft/jdk1.8.0_212/jre/lib/ext/sunec.jar:/home/xxx/soft/jdk1.8.0_212/jre/lib/ext/sunjce_provider.jar:/home/xxx/soft/jdk1.8.0_212/jre/lib/ext/sunpkcs11.jar:/home/xxx/soft/jdk1.8.0_212/jre/lib/ext/zipfs.jar:/home/xxx/soft/jdk1.8.0_212/jre/lib/javaws.jar:/home/xxx/soft/jdk1.8.0_212/jre/lib/jce.jar:/home/xxx/soft/jdk1.8.0_212/jre/lib/jfr.jar:/home/xxx/soft/jdk1.8.0_212/jre/lib/jfxswt.jar:/home/xxx/soft/jdk1.8.0_212/jre/lib/jsse.jar:/home/xxx/soft/jdk1.8.0_212/jre/lib/management-agent.jar:/home/xxx/soft/jdk1.8.0_212/jre/lib/plugin.jar:/home/xxx/soft/jdk1.8.0_212/jre/lib/resources.jar:/home/xxx/soft/jdk1.8.0_212/jre/lib/rt.jar:/home/xxx/003/little-test/little-case/target/classes:/home/xxx/.m2/repository/org/springframework/boot/spring-boot-starter-web/2.2.6.RELEASE/spring-boot-starter-web-2.2.6.RELEASE.jar:/home/xxx/.m2/repository/org/springframework/boot/spring-boot-starter/2.2.6.RELEASE/spring-boot-starter-2.2.6.RELEASE.jar:/home/xxx/.m2/repository/org/springframework/boot/spring-boot/2.2.6.RELEASE/spring-boot-2.2.6.RELEASE.jar:/home/xxx/.m2/repository/org/springframework/boot/spring-boot-autoconfigure/2.2.6.RELEASE/spring-boot-autoconfigure-2.2.6.RELEASE.jar:/home/xxx/.m2/repository/org/springframework/boot/spring-boot-starter-logging/2.2.6.RELEASE/spring-boot-starter-logging-2.2.6.RELEASE.jar:/home/xxx/.m2/repository/ch/qos/logback/logback-classic/1.2.3/logback-classic-1.2.3.jar:/home/xxx/.m2/repository/ch/qos/logback/logback-core/1.2.3/logback-core-1.2.3.jar:/home/xxx/.m2/repository/org/apache/logging/log4j/log4j-to-slf4j/2.12.1/log4j-to-slf4j-2.12.1.jar:/home/xxx/.m2/repository/org/apache/logging/log4j/log4j-api/2.12.1/log4j-api-2.12.1.jar:/home/xxx/.m2/repository/org/slf4j/jul-to-slf4j/1.7.30/jul-to-slf4j-1.7.30.jar:/home/xxx/.m2/repository/jakarta/annotation/jakarta.annotation-api/1.3.5/jakarta.annotation-api-1.3.5.jar:/home/xxx/.m2/repository/org/yaml/snakeyaml/1.25/snakeyaml-1.25.jar:/home/xxx/.m2/repository/org/springframework/boot/spring-boot-starter-json/2.2.6.RELEASE/spring-boot-starter-json-2.2.6.RELEASE.jar:/home/xxx/.m2/repository/com/fasterxml/jackson/core/jackson-databind/2.10.3/jackson-databind-2.10.3.jar:/home/xxx/.m2/repository/com/fasterxml/jackson/core/jackson-annotations/2.10.3/jackson-annotations-2.10.3.jar:/home/xxx/.m2/repository/com/fasterxml/jackson/core/jackson-core/2.10.3/jackson-core-2.10.3.jar:/home/xxx/.m2/repository/com/fasterxml/jackson/datatype/jackson-datatype-jdk8/2.10.3/jackson-datatype-jdk8-2.10.3.jar:/home/xxx/.m2/repository/com/fasterxml/jackson/datatype/jackson-datatype-jsr310/2.10.3/jackson-datatype-jsr310-2.10.3.jar:/home/xxx/.m2/repository/com/fasterxml/jackson/module/jackson-module-parameter-names/2.10.3/jackson-module-parameter-names-2.10.3.jar:/home/xxx/.m2/repository/org/springframework/boot/spring-boot-starter-tomcat/2.2.6.RELEASE/spring-boot-starter-tomcat-2.2.6.RELEASE.jar:/home/xxx/.m2/repository/org/apache/tomcat/embed/tomcat-embed-core/9.0.33/tomcat-embed-core-9.0.33.jar:/home/xxx/.m2/repository/org/apache/tomcat/embed/tomcat-embed-el/9.0.33/tomcat-embed-el-9.0.33.jar:/home/xxx/.m2/repository/org/apache/tomcat/embed/tomcat-embed-websocket/9.0.33/tomcat-embed-websocket-9.0.33.jar:/home/xxx/.m2/repository/org/springframework/boot/spring-boot-starter-validation/2.2.6.RELEASE/spring-boot-starter-validation-2.2.6.RELEASE.jar:/home/xxx/.m2/repository/jakarta/validation/jakarta.validation-api/2.0.2/jakarta.validation-api-2.0.2.jar:/home/xxx/.m2/repository/org/hibernate/validator/hibernate-validator/6.0.18.Final/hibernate-validator-6.0.18.Final.jar:/home/xxx/.m2/repository/org/jboss/logging/jboss-logging/3.4.1.Final/jboss-logging-3.4.1.Final.jar:/home/xxx/.m2/repository/com/fasterxml/classmate/1.5.1/classmate-1.5.1.jar:/home/xxx/.m2/repository/org/springframework/spring-web/5.2.5.RELEASE/spring-web-5.2.5.RELEASE.jar:/home/xxx/.m2/repository/org/springframework/spring-beans/5.2.5.RELEASE/spring-beans-5.2.5.RELEASE.jar:/home/xxx/.m2/repository/org/springframework/spring-webmvc/5.2.5.RELEASE/spring-webmvc-5.2.5.RELEASE.jar:/home/xxx/.m2/repository/org/springframework/spring-aop/5.2.5.RELEASE/spring-aop-5.2.5.RELEASE.jar:/home/xxx/.m2/repository/org/springframework/spring-context/5.2.5.RELEASE/spring-context-5.2.5.RELEASE.jar:/home/xxx/.m2/repository/org/springframework/spring-expression/5.2.5.RELEASE/spring-expression-5.2.5.RELEASE.jar:/home/xxx/.m2/repository/org/springframework/boot/spring-boot-starter-actuator/2.2.6.RELEASE/spring-boot-starter-actuator-2.2.6.RELEASE.jar:/home/xxx/.m2/repository/org/springframework/boot/spring-boot-actuator-autoconfigure/2.2.6.RELEASE/spring-boot-actuator-autoconfigure-2.2.6.RELEASE.jar:/home/xxx/.m2/repository/org/springframework/boot/spring-boot-actuator/2.2.6.RELEASE/spring-boot-actuator-2.2.6.RELEASE.jar:/home/xxx/.m2/repository/io/micrometer/micrometer-core/1.3.6/micrometer-core-1.3.6.jar:/home/xxx/.m2/repository/org/hdrhistogram/HdrHistogram/2.1.11/HdrHistogram-2.1.11.jar:/home/xxx/.m2/repository/org/latencyutils/LatencyUtils/2.0.3/LatencyUtils-2.0.3.jar:/home/xxx/.m2/repository/org/slf4j/slf4j-api/1.7.30/slf4j-api-1.7.30.jar:/home/xxx/.m2/repository/org/springframework/spring-core/5.2.5.RELEASE/spring-core-5.2.5.RELEASE.jar:/home/xxx/.m2/repository/org/springframework/spring-jcl/5.2.5.RELEASE/spring-jcl-5.2.5.RELEASE.jar:/home/xxx/.m2/repository/org/projectlombok/lombok/1.18.12/lombok-1.18.12.jar StringTest2
         * true-常量池
         *
         * true-比较值
         * false-new的新对象，比较内存地址，不相等
         * true-比较值
         * true-intern ，native方法，本身是操作常量池，根据常量池表，上面已经有了，就拿以前的对象，赋值引用
         * true-比较值
         *
         * Process finished with exit code 0
         */
    }
}