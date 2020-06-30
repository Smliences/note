# IOC

## BeanFactory

作用：提供最基础的容器查看的功能，保存了bean的定义，并且可以根据不同的条件获取bean，查看bean是否单利，获取bean的别名
有一个&符号用来表示获取工厂本身，而不是获取到工厂的实例。

我们学到了什么
明白了bean的生命周期：一对接口——》 init-method->  postxxx接口也就是一切就绪之后的接口。-》destroy-method()
明白了跨域给bean指定别名
明白了bean工厂有层级关系。找bean的过程是：从子到父。

# ApplicationContext

## ListableBeanFactory

作用：返回一系列bean，根据不同的条件获取
学到了啥
提供了list特性的bean工厂，可以枚举每一个bean定义，或者获取bean信息或者bean的实例。在使用的时候不需要考虑已经注册了的bean
和层级关系

## EnviromentCapable

提供了环境

## HierarchicalBeanFactory

提供了层级关系，提供了获取父容器的方法

## MessageSource

元消息，策略模式

## ApplicationEventPublisher

观察者模式，通知别的

## ResourcePatternResolver

提供获取解析资源的方法

# ConfigurableApplicationContext
被applicationContext继承
SPI service provoder interface 服务提供接口，提供可插拔配置的类 配置上下文
几乎所有的上下文都实现了这个接口

这里面配置了上下文默认的bean的方法

refresh()方法 这个方法必须调不管是不是第一次

## ApplicationContext

## Closeable

自动关闭资源，放到try()里

## LifeCycle
start()
stop()
isRunning()

# AbstractApplicationContext
实现了ConfigurableApplicationContext
抽象的实现，模板方法
自动注册了BeanFactoryPostProcessor 和 BeanPostProcessor 还有messageSource caster

## defaultResourceLoader
能加载类路径下面的资源


# AbstractRefreshableApplicationContext 
继承了AbstractApplicationContext

# AbstractRefreshableConfigApplicationContext

继承AbstractRefreshableApplicationContext

可配置的
补充了公共的处理
提供了配置信息

# AbstractXmlApplicationConext

继承了AbstractRefreshableConfigApplicationContext

仅仅实现了getConfigresources或者getConfigLocations

复写了loadBeanDefinition加载bean定义

# ClassPathXmlAPplicationContext

解析加载bean定义

多个配置文件  第二个配置文件会覆盖第一个配置文件的bean，可以用这个特性覆盖默认的配置文件

更傻瓜的启动方式 一键启动

# GenericApplicationContext
直接继承AAC 然后组合XmlBeanDefinitionReader实现ClassPathXmlAPplicationContext的功能 更加灵活
