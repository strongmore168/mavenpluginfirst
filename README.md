# mavenpluginfirst
学习maven插件开发的一个小demo

# 使用
```xml
<plugin>
   <groupId>com.imooc</groupId>
   <artifactId>maven-plugin-first</artifactId>
   <version>1.0-SNAPSHOT</version>
   <executions>
      <execution>
         <phase>compile</phase>
         <goals>
           <goal>first</goal>
          </goals>
       </execution>
    </executions>
    <configuration>
       <name>lisi2</name>
    </configuration>
</plugin>
```
