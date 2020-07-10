# learn-spring-cloud-alibaba

## 安装 nacos

```
git clone https://github.com/alibaba/nacos.git
cd nacos/
mvn -Prelease-nacos -Dmaven.test.skip=true clean install -U  
ls -al distribution/target/

// change the $version to your actual path
cd distribution/target/nacos-server-$version/nacos/bin
```

### 启动方式
#### Win
- 找到源码目录, 文件管理器地址栏输入 cmd
- cmd startup.cmd

#### Linux/MacOs
```
// change the $version to your actual path
cd distribution/target/nacos-server-$version/nacos/bin
sh startup.sh -m standalone
```

## 安装 Sentinel-dashboard
```
git clone https://github.com/alibaba/Sentinel.git
cd Sentinel
mvn clean install -DskipTests
cd sentinel-dashboard/target
java -jar xxxx.jar
```


## 安装 zipkin-server
```
# get the latest source
git clone https://github.com/openzipkin/zipkin
cd zipkin
# Build the server and also make its dependencies
mvn -DskipTests clean install
# Run the server
java -jar ./zipkin-server/target/zipkin-server-*exec.jar
```

## 建议启动顺序

 - Nacos
 - Sentinel-DashBoard
 - Zipkin-Server
 - Gateway
 - provider
 - consumer
