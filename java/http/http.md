# 网络通信

## OSI 7层参考模型 


## TCP/IP 
多少个线程 就有多少个并行

任何程序都有 IO  fd 文件描述符 ---》变量

## 应用层

## 传输控制层

UDP    面向链接 可靠的传输协议     三次握手 握手包是传输控制层    c - sync -> s    s - sync + ack -> c  c - ack -> s 传输层 
三次握手之后，双方内存开辟资源提供服务叫连接 三次握手之后才能传输数据，四次分手    三次握手确认连接是可靠的

TCP(Transmission Control Protocol)传输控制协议

TCP是主机对主机层的传输控制协议，提供可靠的连接服务，采用三次握手确认建立一个连接：

位码即tcp标志位，有6种标示：SYN(synchronous建立联机) ACK(acknowledgement 确认) PSH(push传送) FIN(finish结束) RST(reset重置) URG(urgent紧急)Sequence number(顺序号码) Acknowledge number(确认号码)

第一次握手：主机A发送位码为syn＝1，随机产生seq number=1234567的数据包到服务器，主机B由SYN=1知道，A要求建立联机；

第二次握手：主机B收到请求后要确认联机信息，向A发送ack number=(主机A的seq+1)，syn=1，ack=1，随机产生seq=7654321的包；

第三次握手：主机A收到后检查ack number是否正确，即第一次发送的seq number+1，以及位码ack是否为1，若正确，主机A会再发送ack number=(主机B的seq+1)，ack=1，主机B收到后确认seq值与ack=1则连接建立成功。

FTP协议及时基于此协议。

四次分手：c - fin -> s    s - fin + ack -> c    s - fin -> c  c - fin + ack -> sd

### socket

套接字 ip:port + ip:port = 文件描述符 比如 9 然后 从 9 进行读写
port: 65535   

## 网咯层

ip 
route 下一跳 路由器


## 链路层

寻址链路

## 物理层 

