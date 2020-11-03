package com.zyy.wanandroidmvvm.bean;

import java.util.List;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.library.baseAdapters.BR;

public class ShouYeBean extends BaseObservable {

    /**
     * data : {"curPage":1,"datas":[{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":15314,"link":"https://juejin.im/post/6844903830723756040","niceDate":"21小时前","niceShareDate":"21小时前","origin":"","prefix":"","projectLink":"","publishTime":1600742678000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1600742678000,"shareUser":"躬行之","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"RecyclerView实现拖动排序和滑动删除功能","type":0,"userId":23270,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","canEdit":false,"chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15321,"link":"https://mp.weixin.qq.com/s/O_QEoLMvrLvNbRkG0zoxyQ","niceDate":"1天前","niceShareDate":"10小时前","origin":"","prefix":"","projectLink":"","publishTime":1600704000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1600783309000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"拖不得了，Android11 更全适配实践指南奉上","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15322,"link":"https://mp.weixin.qq.com/s/05N5GNE3pg2x_yaWho7HdQ","niceDate":"1天前","niceShareDate":"10小时前","origin":"","prefix":"","projectLink":"","publishTime":1600704000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1600783328000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"更快！这才是我想要的 Android Startup库！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15323,"link":"https://mp.weixin.qq.com/s/boox34NmseptA3jgD6QUkQ","niceDate":"1天前","niceShareDate":"10小时前","origin":"","prefix":"","projectLink":"","publishTime":1600704000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1600783341000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"自己用Flutter撸一个天气APP","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":232,"chapterName":"入门及知识点","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15306,"link":"https://juejin.im/post/6874745140552925198","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1600703576000,"realSuperChapterId":231,"selfVisible":0,"shareDate":1600703265000,"shareUser":"鸿洋","superChapterId":232,"superChapterName":"Kotlin","tags":[],"title":"Kotlin 进阶 | 不变型、协变、逆变","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":200,"chapterName":"https","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15304,"link":"https://juejin.im/post/6874903020677791758","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1600703562000,"realSuperChapterId":34,"selfVisible":0,"shareDate":1600703225000,"shareUser":"鸿洋","superChapterId":98,"superChapterName":"网络访问","tags":[],"title":"Android端Charles抓包","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":98,"chapterName":"WebView","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15305,"link":"https://juejin.im/post/6874875969292173320","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1600703551000,"realSuperChapterId":34,"selfVisible":0,"shareDate":1600703238000,"shareUser":"鸿洋","superChapterId":98,"superChapterName":"网络访问","tags":[],"title":"android高仿今日头条富文本编辑(发布文章)","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":94,"chapterName":"事件分发","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15307,"link":"https://juejin.im/post/6874589638925746190","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1600703535000,"realSuperChapterId":37,"selfVisible":0,"shareDate":1600703275000,"shareUser":"鸿洋","superChapterId":93,"superChapterName":"自定义控件","tags":[],"title":"面试官带你学安卓 - 从安卓的事件分发说起","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":173,"chapterName":"Choreographer","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15308,"link":"https://juejin.im/post/6874483682699132935","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1600703525000,"realSuperChapterId":152,"selfVisible":0,"shareDate":1600703301000,"shareUser":"鸿洋","superChapterId":153,"superChapterName":"framework","tags":[],"title":"Android屏幕刷新机制","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":346,"chapterName":"JVM","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15309,"link":"https://juejin.im/post/6874916707543187463","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1600703511000,"realSuperChapterId":244,"selfVisible":0,"shareDate":1600703312000,"shareUser":"鸿洋","superChapterId":245,"superChapterName":"Java深入","tags":[],"title":"OutOfMemoryError 可以被 try catch 吗？","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":33,"chapterName":"Notification","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15310,"link":"https://www.jianshu.com/p/c56af3c86709","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1600703494000,"realSuperChapterId":29,"selfVisible":0,"shareDate":1600703431000,"shareUser":"鸿洋","superChapterId":30,"superChapterName":"用户交互","tags":[],"title":"下沉式通知的一种实现 | Android悬浮窗Window应用","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15298,"link":"https://juejin.im/post/6874885969653596167","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1600685257000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1600685257000,"shareUser":"renxhui","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android OpenGl Es 学习（二）：定义顶点和着色器","type":0,"userId":27931,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15294,"link":"https://juejin.im/post/6844903830715367432","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1600652464000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1600652464000,"shareUser":"躬行之","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"RecyclerView的刷新分页","type":0,"userId":23270,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15303,"link":"https://mp.weixin.qq.com/s/CnhlvoUFGdoT_m_6DzrGSg","niceDate":"2天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1600617600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1600697549000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"小知识：启动了Activity 的 app 至少有几个线程？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"谷歌开发者","canEdit":false,"chapterId":415,"chapterName":"谷歌开发者","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15301,"link":"https://mp.weixin.qq.com/s/YzlZ_XazxS4C7fN4uNt-RA","niceDate":"2020-09-20 00:00","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1600531200000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1600697507000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/415/1"}],"title":"跨设备设计基础 | 如何确定任意屏幕的分辨率指标","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15302,"link":"https://mp.weixin.qq.com/s/FlGu66MlSLieHkmMRL-kUw","niceDate":"2020-09-20 00:00","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1600531200000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1600697527000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"华为手机刷微博体验更好？技术角度的分析和思考","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15289,"link":"https://juejin.im/post/6874061694491721736/","niceDate":"2020-09-19 13:34","niceShareDate":"2020-09-19 13:34","origin":"","prefix":"","projectLink":"","publishTime":1600493664000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1600493664000,"shareUser":"xiaweizi","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"『Flutter-绘制篇』实现炫酷的雷电特效","type":0,"userId":2148,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"谷歌开发者","canEdit":false,"chapterId":415,"chapterName":"谷歌开发者","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15300,"link":"https://mp.weixin.qq.com/s/yABygaF_KryHUsQNVhC2YA","niceDate":"2020-09-19 00:00","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1600444800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1600697486000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/415/1"}],"title":"Android Studio 中 System Trace 的新增功能","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15276,"link":"https://juejin.im/post/6873476209737629709/","niceDate":"2020-09-18 13:31","niceShareDate":"2020-09-18 13:31","origin":"","prefix":"","projectLink":"","publishTime":1600407099000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1600407099000,"shareUser":"Amter","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android 网络框架之OkHttp源码解析","type":0,"userId":49976,"visible":1,"zan":0}],"offset":0,"over":false,"pageCount":462,"size":20,"total":9231}
     * errorCode : 0
     * errorMsg :
     */

    private DataBean data;
    private int errorCode;
    private String errorMsg;
@Bindable
    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
        notifyPropertyChanged(BR.data);

    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public static class DataBean extends BaseObservable{
        /**
         * curPage : 1
         * datas : [{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"id":15314,"link":"https://juejin.im/post/6844903830723756040","niceDate":"21小时前","niceShareDate":"21小时前","origin":"","prefix":"","projectLink":"","publishTime":1600742678000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1600742678000,"shareUser":"躬行之","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"RecyclerView实现拖动排序和滑动删除功能","type":0,"userId":23270,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","canEdit":false,"chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15321,"link":"https://mp.weixin.qq.com/s/O_QEoLMvrLvNbRkG0zoxyQ","niceDate":"1天前","niceShareDate":"10小时前","origin":"","prefix":"","projectLink":"","publishTime":1600704000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1600783309000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"拖不得了，Android11 更全适配实践指南奉上","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15322,"link":"https://mp.weixin.qq.com/s/05N5GNE3pg2x_yaWho7HdQ","niceDate":"1天前","niceShareDate":"10小时前","origin":"","prefix":"","projectLink":"","publishTime":1600704000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1600783328000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"更快！这才是我想要的 Android Startup库！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15323,"link":"https://mp.weixin.qq.com/s/boox34NmseptA3jgD6QUkQ","niceDate":"1天前","niceShareDate":"10小时前","origin":"","prefix":"","projectLink":"","publishTime":1600704000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1600783341000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"自己用Flutter撸一个天气APP","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":232,"chapterName":"入门及知识点","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15306,"link":"https://juejin.im/post/6874745140552925198","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1600703576000,"realSuperChapterId":231,"selfVisible":0,"shareDate":1600703265000,"shareUser":"鸿洋","superChapterId":232,"superChapterName":"Kotlin","tags":[],"title":"Kotlin 进阶 | 不变型、协变、逆变","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":200,"chapterName":"https","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15304,"link":"https://juejin.im/post/6874903020677791758","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1600703562000,"realSuperChapterId":34,"selfVisible":0,"shareDate":1600703225000,"shareUser":"鸿洋","superChapterId":98,"superChapterName":"网络访问","tags":[],"title":"Android端Charles抓包","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":98,"chapterName":"WebView","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15305,"link":"https://juejin.im/post/6874875969292173320","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1600703551000,"realSuperChapterId":34,"selfVisible":0,"shareDate":1600703238000,"shareUser":"鸿洋","superChapterId":98,"superChapterName":"网络访问","tags":[],"title":"android高仿今日头条富文本编辑(发布文章)","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":94,"chapterName":"事件分发","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15307,"link":"https://juejin.im/post/6874589638925746190","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1600703535000,"realSuperChapterId":37,"selfVisible":0,"shareDate":1600703275000,"shareUser":"鸿洋","superChapterId":93,"superChapterName":"自定义控件","tags":[],"title":"面试官带你学安卓 - 从安卓的事件分发说起","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":173,"chapterName":"Choreographer","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15308,"link":"https://juejin.im/post/6874483682699132935","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1600703525000,"realSuperChapterId":152,"selfVisible":0,"shareDate":1600703301000,"shareUser":"鸿洋","superChapterId":153,"superChapterName":"framework","tags":[],"title":"Android屏幕刷新机制","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":346,"chapterName":"JVM","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15309,"link":"https://juejin.im/post/6874916707543187463","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1600703511000,"realSuperChapterId":244,"selfVisible":0,"shareDate":1600703312000,"shareUser":"鸿洋","superChapterId":245,"superChapterName":"Java深入","tags":[],"title":"OutOfMemoryError 可以被 try catch 吗？","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":33,"chapterName":"Notification","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15310,"link":"https://www.jianshu.com/p/c56af3c86709","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1600703494000,"realSuperChapterId":29,"selfVisible":0,"shareDate":1600703431000,"shareUser":"鸿洋","superChapterId":30,"superChapterName":"用户交互","tags":[],"title":"下沉式通知的一种实现 | Android悬浮窗Window应用","type":0,"userId":2,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15298,"link":"https://juejin.im/post/6874885969653596167","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1600685257000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1600685257000,"shareUser":"renxhui","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android OpenGl Es 学习（二）：定义顶点和着色器","type":0,"userId":27931,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15294,"link":"https://juejin.im/post/6844903830715367432","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1600652464000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1600652464000,"shareUser":"躬行之","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"RecyclerView的刷新分页","type":0,"userId":23270,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15303,"link":"https://mp.weixin.qq.com/s/CnhlvoUFGdoT_m_6DzrGSg","niceDate":"2天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1600617600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1600697549000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"小知识：启动了Activity 的 app 至少有几个线程？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"谷歌开发者","canEdit":false,"chapterId":415,"chapterName":"谷歌开发者","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15301,"link":"https://mp.weixin.qq.com/s/YzlZ_XazxS4C7fN4uNt-RA","niceDate":"2020-09-20 00:00","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1600531200000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1600697507000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/415/1"}],"title":"跨设备设计基础 | 如何确定任意屏幕的分辨率指标","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15302,"link":"https://mp.weixin.qq.com/s/FlGu66MlSLieHkmMRL-kUw","niceDate":"2020-09-20 00:00","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1600531200000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1600697527000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"华为手机刷微博体验更好？技术角度的分析和思考","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15289,"link":"https://juejin.im/post/6874061694491721736/","niceDate":"2020-09-19 13:34","niceShareDate":"2020-09-19 13:34","origin":"","prefix":"","projectLink":"","publishTime":1600493664000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1600493664000,"shareUser":"xiaweizi","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"『Flutter-绘制篇』实现炫酷的雷电特效","type":0,"userId":2148,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"谷歌开发者","canEdit":false,"chapterId":415,"chapterName":"谷歌开发者","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15300,"link":"https://mp.weixin.qq.com/s/yABygaF_KryHUsQNVhC2YA","niceDate":"2020-09-19 00:00","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1600444800000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1600697486000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/415/1"}],"title":"Android Studio 中 System Trace 的新增功能","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"id":15276,"link":"https://juejin.im/post/6873476209737629709/","niceDate":"2020-09-18 13:31","niceShareDate":"2020-09-18 13:31","origin":"","prefix":"","projectLink":"","publishTime":1600407099000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1600407099000,"shareUser":"Amter","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Android 网络框架之OkHttp源码解析","type":0,"userId":49976,"visible":1,"zan":0}]
         * offset : 0
         * over : false
         * pageCount : 462
         * size : 20
         * total : 9231
         */

        private int curPage;
        private int offset;
        private boolean over;
        private int pageCount;
        private int size;
        private int total;
        private List<DatasBean> datas;

        public int getCurPage() {
            return curPage;
        }

        public void setCurPage(int curPage) {
            this.curPage = curPage;
        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public boolean isOver() {
            return over;
        }

        public void setOver(boolean over) {
            this.over = over;
        }

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }
@Bindable
        public List<DatasBean> getDatas() {
            return datas;
        }

        public void setDatas(List<DatasBean> datas) {
            this.datas = datas;
            notifyPropertyChanged(BR.data);



        }

        public static class DatasBean extends BaseObservable{
            /**
             * apkLink :
             * audit : 1
             * author :
             * canEdit : false
             * chapterId : 502
             * chapterName : 自助
             * collect : false
             * courseId : 13
             * desc :
             * descMd :
             * envelopePic :
             * fresh : true
             * id : 15314
             * link : https://juejin.im/post/6844903830723756040
             * niceDate : 21小时前
             * niceShareDate : 21小时前
             * origin :
             * prefix :
             * projectLink :
             * publishTime : 1600742678000
             * realSuperChapterId : 493
             * selfVisible : 0
             * shareDate : 1600742678000
             * shareUser : 躬行之
             * superChapterId : 494
             * superChapterName : 广场Tab
             * tags : []
             * title : RecyclerView实现拖动排序和滑动删除功能
             * type : 0
             * userId : 23270
             * visible : 1
             * zan : 0
             */

            private String apkLink;
            private int audit;
            private String author;
            private boolean canEdit;
            private int chapterId;
            private String chapterName;
            private boolean collect;
            private int courseId;
            private String desc;
            private String descMd;
            private String envelopePic;
            private boolean fresh;
            private int id;
            private String link;
            private String niceDate;
            private String niceShareDate;
            private String origin;
            private String prefix;
            private String projectLink;
            private long publishTime;
            private int realSuperChapterId;
            private int selfVisible;
            private long shareDate;
            private String shareUser;
            private int superChapterId;
            private String superChapterName;
            private String title;
            private int type;
            private int userId;
            private int visible;
            private int zan;
            private List<?> tags;

            public String getApkLink() {
                return apkLink;
            }

            public void setApkLink(String apkLink) {
                this.apkLink = apkLink;
            }

            public int getAudit() {
                return audit;
            }

            public void setAudit(int audit) {
                this.audit = audit;
            }
@Bindable
            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
                notifyPropertyChanged(BR.author);
            }

            public boolean isCanEdit() {
                return canEdit;
            }

            public void setCanEdit(boolean canEdit) {
                this.canEdit = canEdit;
            }

            public int getChapterId() {
                return chapterId;
            }

            public void setChapterId(int chapterId) {
                this.chapterId = chapterId;
            }
@Bindable
            public String getChapterName() {
                return chapterName;
            }

            public void setChapterName(String chapterName) {
                this.chapterName = chapterName;
notifyPropertyChanged(BR.chapterName);
            }

            public boolean isCollect() {
                return collect;
            }

            public void setCollect(boolean collect) {
                this.collect = collect;
            }

            public int getCourseId() {
                return courseId;
            }

            public void setCourseId(int courseId) {
                this.courseId = courseId;
            }
            @Bindable
            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
                notifyPropertyChanged(BR.desc);
            }

            public String getDescMd() {
                return descMd;
            }

            public void setDescMd(String descMd) {
                this.descMd = descMd;
            }

            public String getEnvelopePic() {
                return envelopePic;
            }

            public void setEnvelopePic(String envelopePic) {
                this.envelopePic = envelopePic;
            }

            public boolean isFresh() {
                return fresh;
            }

            public void setFresh(boolean fresh) {
                this.fresh = fresh;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getNiceDate() {
                return niceDate;
            }

            public void setNiceDate(String niceDate) {
                this.niceDate = niceDate;
            }
@Bindable
            public String getNiceShareDate() {
                return niceShareDate;
            }

            public void setNiceShareDate(String niceShareDate) {
                this.niceShareDate = niceShareDate;
                notifyPropertyChanged(BR.data);
            }

            public String getOrigin() {
                return origin;
            }

            public void setOrigin(String origin) {
                this.origin = origin;
            }

            public String getPrefix() {
                return prefix;
            }

            public void setPrefix(String prefix) {
                this.prefix = prefix;
            }

            public String getProjectLink() {
                return projectLink;
            }

            public void setProjectLink(String projectLink) {
                this.projectLink = projectLink;
            }

            public long getPublishTime() {
                return publishTime;
            }

            public void setPublishTime(long publishTime) {
                this.publishTime = publishTime;
            }

            public int getRealSuperChapterId() {
                return realSuperChapterId;
            }

            public void setRealSuperChapterId(int realSuperChapterId) {
                this.realSuperChapterId = realSuperChapterId;
            }

            public int getSelfVisible() {
                return selfVisible;
            }

            public void setSelfVisible(int selfVisible) {
                this.selfVisible = selfVisible;
            }

            public long getShareDate() {
                return shareDate;
            }

            public void setShareDate(long shareDate) {
                this.shareDate = shareDate;
            }

            public String getShareUser() {
                return shareUser;
            }

            public void setShareUser(String shareUser) {
                this.shareUser = shareUser;
            }

            public int getSuperChapterId() {
                return superChapterId;
            }

            public void setSuperChapterId(int superChapterId) {
                this.superChapterId = superChapterId;
            }
@Bindable
            public String getSuperChapterName() {
                return superChapterName;
            }

            public void setSuperChapterName(String superChapterName) {
                this.superChapterName = superChapterName;
                notifyPropertyChanged(BR.chapterName);
            }
@Bindable
            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
                notifyPropertyChanged(BR.title);
            }
@Bindable
            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
                notifyPropertyChanged(BR.type);
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public int getVisible() {
                return visible;
            }

            public void setVisible(int visible) {
                this.visible = visible;
            }

            public int getZan() {
                return zan;
            }

            public void setZan(int zan) {
                this.zan = zan;
            }

            public List<?> getTags() {
                return tags;
            }

            public void setTags(List<?> tags) {
                this.tags = tags;
            }
        }
    }
}
