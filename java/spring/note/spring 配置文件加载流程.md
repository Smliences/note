# spring 配置文件加载流程

> [视频地址](https://www.bilibili.com/video/BV1iZ4y137CZ?p=7)

1. 加载
2. 解析
3. 创建实例
4. 使用
5. 销毁

## IOC Container

> IOC 容器里面存的是 对象

### 怎么创建对象

创建对象三种方式：new  反射  工厂模式     
spring bean中默认的 scope 默认是单例的

### BeanDefinition bean定义

注解
xml      存储的是 bean 定义信息
json 

BeanDefinition bean 定义

### BeanDefinitionReader 

抽象出 BeanDefinitionReader  读取配置文件 bean 定义 放到 IOC 容器里

### 创建对象

实例化: 在堆内存里开辟一块空间，属性是默认值 
初始化: 给属性赋值   1. 填充属性 2. 执行初始化方法 init-method

### PostProcessor

后置处理器 为了扩展实现，在创建对象的时候，bean 工厂获取 beanDefinition 的时候 做的处理

BeanFactoryPostProcessor 的实现类

PlaceholderConfigureSupport  替换配置文件里的占位符  

### bean 的生命周期

1. 实例化

2. 填充属性 populateBean 

3. 执行 aware 接口需要实现的方法 aware 接口存在的意义是：方便通过 spring 中的 bean 对象来获取对应容器中的相关属性值
- BeanNameAware setBeanName
- EnvironmentAware setEnvironment

4. BeanPostProcessorBefore 

5. init-method 方法

6. BeanPostProcessorAfter

7. 完整对象

8. 销毁流程

### Environment 环境对象

应用程序运行期间，可以读取系统环境变量
System.getEnv();
System.getProperties();


### spring Bean 的创建过程


### 循环依赖

bean 默认单例 三级缓存

实例化和初始化分开处理，提前暴露对象

构造方法 
set 方式 可以解决

A b
B a

先实例化 A 只是完成对空间的开辟，并没有设置属性值  半成品
初始化 A 此时要给 b 属性赋值，b 是一个完全独立的对象，所以此时要去 spring 容器中查找 b 对象
1. 有 b 对象 直接赋值成功
2. 没有 b 对象，完成 b 对象的实例化
    - 实例化 B，只是完成对空间的开辟，并没有设置属性值  半成品
    - 实例化 B，给 B 对象中的 a 属性赋值，也去 spring 容器中查找

### other

1. AopProxy 动态代理抽象接口
两种方式





