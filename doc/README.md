Code Cross Cloud

背景

随着云时代的兴起，传统IT开发模式将逐渐被抛弃，但新的技术并没有彻底解放开发者繁重的开发压力。
所以我们迫切需要建立一个直接从需求到产品的桥梁。

1 c3 是什么

c3将实现UI,模型（数据）还是逻辑（业务）都云端化.

可视化编辑工具会将详细到格式化的需求直接提现为产品，而开发人员主要承担的工作应该只是针对各种终端(Endpoint)的UI细化


2 需求

需求通常会是一段描述，但项目领导者有义务将这段描述转述成数个功能。


3 功能

功能是基于终端的，每个功能都有所属的终端

输入=目标终端(比如Server),名字,操作(方法),参数

输出=UI,模型(模型是区分临时的和持久化的)

功能=输入-逻辑[功能...]-输出

输入-逻辑-[功能](在此之前应该是获得了一个中间状态的输入)
     |
     |---输出

4 模型 这里涉及到复杂的版本迁移功能 或者应该丢弃关系型数据库采用更加灵活的数据库技术

模型区分临时和持久
而且模型无需用户手工去创建 在设计功能的时候可以直接动态生成
在判定没有任何功能使用这个模型的时候 是可以移除的

5 UI
UI是终端无关的数据结构，但是可以做终端特定化动作
可以采用各种框架通用属性做最小交集



参考框架
ExtJS
ExtTouch
IOS
Andirod
HTML
Swing
Flex

UI应该与模型匹配，如果需要引用子UI必须提供如何从当前模型获取所需模型

6 终端 

应该根据终端数量生成产品数量 终端产品同时也是作为一个资源可以使用比如下载
通常项目应该都有一个名为server的终端，但并非必须。

终端都应该拥有类型 比如j2ee html ios等等



7 逻辑

脚本语言(javascript)应该控制一切

8 单元测试

设计每一个功能时都应该设计好单元测试


9 安全

每个用户都应该是一个os User,调用的时候应该是在一个安全管理器内运行

