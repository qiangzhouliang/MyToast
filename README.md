# MyToast
一行代码实现toast弹窗  
使用地址：https://jitpack.io/#qiangzhouliang/MyToast/1.0.2
# 1 如何引入自己的项目
## 1.1 将JitPack存储库添加到您的构建文件中
将其添加到存储库末尾的root（项目） build.gradle中：
~~~
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
~~~
## 1.2 添加依赖项
~~~
dependencies {
	  implementation 'com.github.qiangzhouliang:MyToast:1.0.2'
}
~~~
# 2 如何使用
## 2.1 在application中注册
~~~
MyToast.init(this)
~~~
## 2.2 在要使用的地方写上如下代码
~~~
MyToast.showShort("xxx")
~~~
# 3 版本更新说明
## 3.1 1.0.1 版本
只是将系统默认的Toast做了封装，实现一行弹出Toast的功能
## 3.2 1.0.2 版本
添加静态方法，使得可以在静态代码中调运


