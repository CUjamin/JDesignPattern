### 适配器模式

    将一个类的接口转换成客户希望的另外一个接口。
    Adapter模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
   
系统的数据和行为都是正确的，但接口不符时，我们应该考虑用适配器，目的是使控制范围之外的原有对象与某个接口匹配。

适配器模式主要应用于希望复用一些现存的类，但是接口又与复用环境要求不一致的情况。

适配器模式包含两种：**类适配器模式**和**对象适配模式**


### 何时使用适配器模式

使用一个已经存在的类，但如果它的接口，也就是它的方法和你的要求不同时，就应该考虑适配器模式（两个类所做的事情相同或相似，但是具有不同的接口时）。

客户端可以统一调用同一个接口，这样可以更简单、更直接、更紧凑。

但实际上，适配器模式是针对于在双方都太容易修改的时才使用的，如果一开始设计之初能把接口设计好，则不用使用适配器模式。