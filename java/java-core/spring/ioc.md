# IOC

## BeanFactory

作用：提供最基础的容器查看的功能，保存了bean的定义，并且可以根据不同的条件获取bean，查看bean是否单利，获取bean的别名
有一个&符号用来表示获取工厂本身，而不是获取到工厂的实例。

我们学到了什么
明白了bean的生命周期：一对接口——》 init-method->  postxxx接口也就是一切就绪之后的接口。-》destroy-method()
明白了跨域给bean指定别名
明白了bean工厂有层级关系。找bean的过程是：从子到父。

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