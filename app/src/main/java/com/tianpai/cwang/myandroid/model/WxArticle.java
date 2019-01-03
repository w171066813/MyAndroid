package com.tianpai.cwang.myandroid.model;

import java.util.List;

/**
 * Created by cwang on 2018/12/26.
 */

public class WxArticle {

    /**
     * data : {"curPage":2,"datas":[{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说",
     * "collect":false,"courseId":13,"desc":"","envelopeP
     * ic":"","fresh":false,"id":5031,
     * "link":"http://mp.weixin.qq.com/s?__biz=MzIwMTAzMTMxMg==&mid=2649493197&idx=1&sn=50cec1c926ffd2fefa1df42bc80d6b7e&chksm=8eec8532b99b0c24a083b93dfc3e683c0574
     * 5df8a47e30682af9fc1190db7343827d7047a518&scene=38#wechat_redirect","niceDate":"2018-09-23","origin":"","projectLink":"","publishTime":1537632000000
     * ,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"中秋福利第一弹","type":0,"userId"
     * :-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"",
     * "envelopePic":"","fresh":false,"id":5064,"link":"http://mp.weixin.qq.com/s?__biz=MzIwMTAzMTMxMg==&mid=2649493192&idx=1&sn=3
     * 2ae7ba9f97e0c1a5d7488c3694ab0a6&chksm=8eec8537b99b0c213382777f6ccd65ea83ed90c6f572366d12b965af4fc0117f0a8764c12ec7&scene=38#wechat_redirect","niceDate":"2018-09-22","origin":"","projectLink":"","publishTime":1537545600000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"全网首发 | 2018 Google 开发者大会现场纪要","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":5128,"link":"http://mp.weixin.qq.com/s?__biz=MzIwMTAzMTMxMg==&mid=2649493187&idx=1&sn=d7e12e5549c4e4fc25f11bcc7bda194b&chksm=8eec853cb99b0c2a260dde5aab4de7dc0f965f9012b958ec51aa3103aa7267df1c14e71e5c53&scene=38#wechat_redirect","niceDate":"2018-09-21","origin":"","projectLink":"","publishTime":1537459200000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"一个屌丝程序员的悲惨校招","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":5045,"link":"http://mp.weixin.qq.com/s?__biz=MzIwMTAzMTMxMg==&mid=2649493183&idx=1&sn=1259bf2449fb961df1ca3c9ce0be5bfb&chksm=8eec8540b99b0c56718ed6a17847257cfc31595e72fc5cdd5501a2c8d07880567a2d94914ea4&scene=38#wechat_redirect","niceDate":"2018-09-20","origin":"","projectLink":"","publishTime":1537372800000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"那些 Android 程序员必会的视图优化策略","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":5022,"link":"http://mp.weixin.qq.com/s?__biz=MzIwMTAzMTMxMg==&mid=2649493172&idx=1&sn=70d1ff879246fc49dcb90bc387eef37b&chksm=8eec854bb99b0c5d43fb3b945d4394dd67e3c09916e3e5c6a7ca98525aede0ddd3945ad1882a&scene=38#wechat_redirect","niceDate":"2018-09-18","origin":"","projectLink":"","publishTime":1537200000000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"带你了解 Android 约束布局 ConstraintLayout","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":5044,"link":"http://mp.weixin.qq.com/s?__biz=MzIwMTAzMTMxMg==&mid=2649493165&idx=1&sn=238e2292c434974e94946a61fe1f83aa&chksm=8eec8552b99b0c44cd0582d84a6b60a0824eb4ead1bcba82cd24989b0c431a745dc2f23705a7&scene=38#wechat_redirect","niceDate":"2018-09-17","origin":"","projectLink":"","publishTime":1537113600000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"Android 内存泄露分析实战演练","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":5048,"link":"http://mp.weixin.qq.com/s?__biz=MzIwMTAzMTMxMg==&mid=2649493162&idx=1&sn=22c0803e7b19b185c205e79aa7c6652f&chksm=8eec8555b99b0c43ca2798555f9eac78a5651534c0ec8b101625e588bcd594a372c5a31f1360&scene=38#wechat_redirect","niceDate":"2018-09-14","origin":"","projectLink":"","publishTime":1536854400000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"我的 LOL 情怀","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":5104,"link":"http://mp.weixin.qq.com/s?__biz=MzIwMTAzMTMxMg==&mid=2649493157&idx=1&sn=1310b765cc1de15f4aee66ea024af4a1&chksm=8eec855ab99b0c4cafc84ab5b27967011d3aa55f4f5ec0d68bfa2ee226b9b29dca211d7046b7&scene=38#wechat_redirect","niceDate":"2018-09-13","origin":"","projectLink":"","publishTime":1536768000000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"Java进阶之路：3个方法让你高效提升开发能力！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":5137,"link":"http://mp.weixin.qq.com/s?__biz=MzIwMTAzMTMxMg==&mid=2649493148&idx=2&sn=9ccc673c4590709ed71966ca1b0c2624&chksm=8eec8563b99b0c75bc58b07767d1e66a93e7ce7f630d822bb090756127b4205d2cb32b339b5c&scene=38#wechat_redirect","niceDate":"2018-09-12","origin":"","projectLink":"","publishTime":1536681600000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"沙龙招募｜手把手教你打造绿色应用","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":5100,"link":"http://mp.weixin.qq.com/s?__biz=MzIwMTAzMTMxMg==&mid=2649493148&idx=1&sn=b2eb05b9b28d738fb25396f95377e216&chksm=8eec8563b99b0c75dd838972fb891b476e1dbe859ecbabadd3056976c17687dc0a25d79bfe2f&scene=38#wechat_redirect","niceDate":"2018-09-12","origin":"","projectLink":"","publishTime":1536681600000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"又来给大家送福利了","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":5082,"link":"http://mp.weixin.qq.com/s?__biz=MzIwMTAzMTMxMg==&mid=2649493136&idx=1&sn=e75362b0e979bbb1d2bfba91dd0ac3b1&chksm=8eec856fb99b0c79df894fd997ec207a18ec67248e3e64edd4bd7914950f96de175824ec207d&scene=38#wechat_redirect","niceDate":"2018-09-11","origin":"","projectLink":"","publishTime":1536595200000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"Java 垃圾回收机制，了解一下？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":4999,"link":"http://mp.weixin.qq.com/s?__biz=MzIwMTAzMTMxMg==&mid=2649493130&idx=1&sn=f8c9fe91de36c736c2dd863140baefa9&chksm=8eec8575b99b0c637652f5d59e31b032992c0547cefb700ad9c6b5a3d47853ae9fab89fc0394&scene=38#wechat_redirect","niceDate":"2018-09-10","origin":"","projectLink":"","publishTime":1536508800000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"Android Webview H5 秒开方案实现","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":5057,"link":"http://mp.weixin.qq.com/s?__biz=MzIwMTAzMTMxMg==&mid=2649493123&idx=1&sn=6bafdbbaa24addd070b8b600d32b7a47&chksm=8eec857cb99b0c6a8f0d6de089e384f0b698976ff62a261a247e427653711adbe6bee8d30c89&scene=38#wechat_redirect","niceDate":"2018-08-28","origin":"","projectLink":"","publishTime":1535385600000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"谈谈我开知识星球的感想","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":5153,"link":"http://mp.weixin.qq.com/s?__biz=MzIwMTAzMTMxMg==&mid=2649493113&idx=1&sn=53a8817f484bec94ccddde7b87be4e2e&chksm=8eec8586b99b0c90f071d4da42895baf66df34825c3001adcfccb3989a70f5fcc2b456f291a5&scene=38#wechat_redirect","niceDate":"2018-08-27","origin":"","projectLink":"","publishTime":1535299200000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"Android 依赖注入框架 Dagger 2.1 详解","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":5089,"link":"http://mp.weixin.qq.com/s?__biz=MzIwMTAzMTMxMg==&mid=2649493107&idx=1&sn=41bff6ffb97e36ec21cf1b4e7caa9345&chksm=8eec858cb99b0c9a74cde3b0d901f15ee712adfb516beb14b6347b239ac528ec9f95c6f1db1d&scene=38#wechat_redirect","niceDate":"2018-08-24","origin":"","projectLink":"","publishTime":1535040000000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"世上从来都不缺知识，缺的只是坚持","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":5026,"link":"http://mp.weixin.qq.com/s?__biz=MzIwMTAzMTMxMg==&mid=2649493097&idx=1&sn=c195dd5b98316b81dd05ecd03594cee5&chksm=8eec8596b99b0c80309455285e9f234706f1f09db0aea3b48e5124ef527ee972f1ccb6bfa90a&scene=38#wechat_redirect","niceDate":"2018-08-22","origin":"","projectLink":"","publishTime":1534867200000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"读一下这篇文章怎么了？又不会怀孕！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":5018,"link":"http://mp.weixin.qq.com/s?__biz=MzIwMTAzMTMxMg==&mid=2649493093&idx=1&sn=e06c238333a36783628300084cd71f50&chksm=8eec859ab99b0c8c42261225329fcb65d04e60481c7526a1dd84366807ce6901fe27e1dcba7a&scene=38#wechat_redirect","niceDate":"2018-08-21","origin":"","projectLink":"","publishTime":1534780800000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"给大家推荐几个公众号","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":5087,"link":"http://mp.weixin.qq.com/s?__biz=MzIwMTAzMTMxMg==&mid=2649493089&idx=1&sn=d5dda29d432e21607f9a357d03165ca9&chksm=8eec859eb99b0c88ee9355d54ef1cf1dd4716decaa0812f9f5087e39a685c1b18dc12f9d471c&scene=38#wechat_redirect","niceDate":"2018-08-20","origin":"","projectLink":"","publishTime":1534694400000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"面试必备：数组和字符串","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":5134,"link":"http://mp.weixin.qq.com/s?__biz=MzIwMTAzMTMxMg==&mid=2649493083&idx=1&sn=ac498e41da4fd18fd7b859aea3db9e10&chksm=8eec85a4b99b0cb2b0181670518200ce953eb3eda9cf2d1d26b13312da7652d0cf96b8df0bbe&scene=38#wechat_redirect","niceDate":"2018-08-17","origin":"","projectLink":"","publishTime":1534435200000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"青春少女萌萌的爱情故事","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":5065,"link":"http://mp.weixin.qq.com/s?__biz=MzIwMTAzMTMxMg==&mid=2649493083&idx=2&sn=f8346e83b83c5ed15e5f2994a194169f&chksm=8eec85a4b99b0cb2a6bf0983e5773000475d19820734a4a9aae8d6b6ec59a24e3d5681cf4f24&scene=38#wechat_redirect","niceDate":"2018-08-17","origin":"","projectLink":"","publishTime":1534435200000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"Android插件化原理之Activity插件化","type":0,"userId":-1,"visible":1,"zan":0}],"offset":20,"over":false,"pageCount":9,"size":20,"total":176}
     * errorCode : 0
     * errorMsg :
     */

    private DataBean data;
    private int errorCode;
    private String errorMsg;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
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

    public static class DataBean {
        /**
         * curPage : 2
         * datas : [{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":5031,"link":"http://mp.weixin.qq.com/s?__biz=MzIwMTAzMTMxMg==&mid=2649493197&idx=1&sn=50cec1c926ffd2fefa1df42bc80d6b7e&chksm=8eec8532b99b0c24a083b93dfc3e683c05745df8a47e30682af9fc1190db7343827d7047a518&scene=38#wechat_redirect","niceDate":"2018-09-23","origin":"","projectLink":"","publishTime":1537632000000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"中秋福利第一弹","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":5064,"link":"http://mp.weixin.qq.com/s?__biz=MzIwMTAzMTMxMg==&mid=2649493192&idx=1&sn=32ae7ba9f97e0c1a5d7488c3694ab0a6&chksm=8eec8537b99b0c213382777f6ccd65ea83ed90c6f572366d12b965af4fc0117f0a8764c12ec7&scene=38#wechat_redirect","niceDate":"2018-09-22","origin":"","projectLink":"","publishTime":1537545600000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"全网首发 | 2018 Google 开发者大会现场纪要","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":5128,"link":"http://mp.weixin.qq.com/s?__biz=MzIwMTAzMTMxMg==&mid=2649493187&idx=1&sn=d7e12e5549c4e4fc25f11bcc7bda194b&chksm=8eec853cb99b0c2a260dde5aab4de7dc0f965f9012b958ec51aa3103aa7267df1c14e71e5c53&scene=38#wechat_redirect","niceDate":"2018-09-21","origin":"","projectLink":"","publishTime":1537459200000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"一个屌丝程序员的悲惨校招","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":5045,"link":"http://mp.weixin.qq.com/s?__biz=MzIwMTAzMTMxMg==&mid=2649493183&idx=1&sn=1259bf2449fb961df1ca3c9ce0be5bfb&chksm=8eec8540b99b0c56718ed6a17847257cfc31595e72fc5cdd5501a2c8d07880567a2d94914ea4&scene=38#wechat_redirect","niceDate":"2018-09-20","origin":"","projectLink":"","publishTime":1537372800000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"那些 Android 程序员必会的视图优化策略","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":5022,"link":"http://mp.weixin.qq.com/s?__biz=MzIwMTAzMTMxMg==&mid=2649493172&idx=1&sn=70d1ff879246fc49dcb90bc387eef37b&chksm=8eec854bb99b0c5d43fb3b945d4394dd67e3c09916e3e5c6a7ca98525aede0ddd3945ad1882a&scene=38#wechat_redirect","niceDate":"2018-09-18","origin":"","projectLink":"","publishTime":1537200000000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"带你了解 Android 约束布局 ConstraintLayout","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":5044,"link":"http://mp.weixin.qq.com/s?__biz=MzIwMTAzMTMxMg==&mid=2649493165&idx=1&sn=238e2292c434974e94946a61fe1f83aa&chksm=8eec8552b99b0c44cd0582d84a6b60a0824eb4ead1bcba82cd24989b0c431a745dc2f23705a7&scene=38#wechat_redirect","niceDate":"2018-09-17","origin":"","projectLink":"","publishTime":1537113600000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"Android 内存泄露分析实战演练","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":5048,"link":"http://mp.weixin.qq.com/s?__biz=MzIwMTAzMTMxMg==&mid=2649493162&idx=1&sn=22c0803e7b19b185c205e79aa7c6652f&chksm=8eec8555b99b0c43ca2798555f9eac78a5651534c0ec8b101625e588bcd594a372c5a31f1360&scene=38#wechat_redirect","niceDate":"2018-09-14","origin":"","projectLink":"","publishTime":1536854400000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"我的 LOL 情怀","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":5104,"link":"http://mp.weixin.qq.com/s?__biz=MzIwMTAzMTMxMg==&mid=2649493157&idx=1&sn=1310b765cc1de15f4aee66ea024af4a1&chksm=8eec855ab99b0c4cafc84ab5b27967011d3aa55f4f5ec0d68bfa2ee226b9b29dca211d7046b7&scene=38#wechat_redirect","niceDate":"2018-09-13","origin":"","projectLink":"","publishTime":1536768000000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"Java进阶之路：3个方法让你高效提升开发能力！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":5137,"link":"http://mp.weixin.qq.com/s?__biz=MzIwMTAzMTMxMg==&mid=2649493148&idx=2&sn=9ccc673c4590709ed71966ca1b0c2624&chksm=8eec8563b99b0c75bc58b07767d1e66a93e7ce7f630d822bb090756127b4205d2cb32b339b5c&scene=38#wechat_redirect","niceDate":"2018-09-12","origin":"","projectLink":"","publishTime":1536681600000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"沙龙招募｜手把手教你打造绿色应用","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":5100,"link":"http://mp.weixin.qq.com/s?__biz=MzIwMTAzMTMxMg==&mid=2649493148&idx=1&sn=b2eb05b9b28d738fb25396f95377e216&chksm=8eec8563b99b0c75dd838972fb891b476e1dbe859ecbabadd3056976c17687dc0a25d79bfe2f&scene=38#wechat_redirect","niceDate":"2018-09-12","origin":"","projectLink":"","publishTime":1536681600000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"又来给大家送福利了","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":5082,"link":"http://mp.weixin.qq.com/s?__biz=MzIwMTAzMTMxMg==&mid=2649493136&idx=1&sn=e75362b0e979bbb1d2bfba91dd0ac3b1&chksm=8eec856fb99b0c79df894fd997ec207a18ec67248e3e64edd4bd7914950f96de175824ec207d&scene=38#wechat_redirect","niceDate":"2018-09-11","origin":"","projectLink":"","publishTime":1536595200000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"Java 垃圾回收机制，了解一下？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":4999,"link":"http://mp.weixin.qq.com/s?__biz=MzIwMTAzMTMxMg==&mid=2649493130&idx=1&sn=f8c9fe91de36c736c2dd863140baefa9&chksm=8eec8575b99b0c637652f5d59e31b032992c0547cefb700ad9c6b5a3d47853ae9fab89fc0394&scene=38#wechat_redirect","niceDate":"2018-09-10","origin":"","projectLink":"","publishTime":1536508800000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"Android Webview H5 秒开方案实现","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":5057,"link":"http://mp.weixin.qq.com/s?__biz=MzIwMTAzMTMxMg==&mid=2649493123&idx=1&sn=6bafdbbaa24addd070b8b600d32b7a47&chksm=8eec857cb99b0c6a8f0d6de089e384f0b698976ff62a261a247e427653711adbe6bee8d30c89&scene=38#wechat_redirect","niceDate":"2018-08-28","origin":"","projectLink":"","publishTime":1535385600000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"谈谈我开知识星球的感想","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":5153,"link":"http://mp.weixin.qq.com/s?__biz=MzIwMTAzMTMxMg==&mid=2649493113&idx=1&sn=53a8817f484bec94ccddde7b87be4e2e&chksm=8eec8586b99b0c90f071d4da42895baf66df34825c3001adcfccb3989a70f5fcc2b456f291a5&scene=38#wechat_redirect","niceDate":"2018-08-27","origin":"","projectLink":"","publishTime":1535299200000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"Android 依赖注入框架 Dagger 2.1 详解","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":5089,"link":"http://mp.weixin.qq.com/s?__biz=MzIwMTAzMTMxMg==&mid=2649493107&idx=1&sn=41bff6ffb97e36ec21cf1b4e7caa9345&chksm=8eec858cb99b0c9a74cde3b0d901f15ee712adfb516beb14b6347b239ac528ec9f95c6f1db1d&scene=38#wechat_redirect","niceDate":"2018-08-24","origin":"","projectLink":"","publishTime":1535040000000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"世上从来都不缺知识，缺的只是坚持","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":5026,"link":"http://mp.weixin.qq.com/s?__biz=MzIwMTAzMTMxMg==&mid=2649493097&idx=1&sn=c195dd5b98316b81dd05ecd03594cee5&chksm=8eec8596b99b0c80309455285e9f234706f1f09db0aea3b48e5124ef527ee972f1ccb6bfa90a&scene=38#wechat_redirect","niceDate":"2018-08-22","origin":"","projectLink":"","publishTime":1534867200000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"读一下这篇文章怎么了？又不会怀孕！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":5018,"link":"http://mp.weixin.qq.com/s?__biz=MzIwMTAzMTMxMg==&mid=2649493093&idx=1&sn=e06c238333a36783628300084cd71f50&chksm=8eec859ab99b0c8c42261225329fcb65d04e60481c7526a1dd84366807ce6901fe27e1dcba7a&scene=38#wechat_redirect","niceDate":"2018-08-21","origin":"","projectLink":"","publishTime":1534780800000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"给大家推荐几个公众号","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":5087,"link":"http://mp.weixin.qq.com/s?__biz=MzIwMTAzMTMxMg==&mid=2649493089&idx=1&sn=d5dda29d432e21607f9a357d03165ca9&chksm=8eec859eb99b0c88ee9355d54ef1cf1dd4716decaa0812f9f5087e39a685c1b18dc12f9d471c&scene=38#wechat_redirect","niceDate":"2018-08-20","origin":"","projectLink":"","publishTime":1534694400000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"面试必备：数组和字符串","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":5134,"link":"http://mp.weixin.qq.com/s?__biz=MzIwMTAzMTMxMg==&mid=2649493083&idx=1&sn=ac498e41da4fd18fd7b859aea3db9e10&chksm=8eec85a4b99b0cb2b0181670518200ce953eb3eda9cf2d1d26b13312da7652d0cf96b8df0bbe&scene=38#wechat_redirect","niceDate":"2018-08-17","origin":"","projectLink":"","publishTime":1534435200000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"青春少女萌萌的爱情故事","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","author":"玉刚说","chapterId":410,"chapterName":"玉刚说","collect":false,"courseId":13,"desc":"","envelopePic":"","fresh":false,"id":5065,"link":"http://mp.weixin.qq.com/s?__biz=MzIwMTAzMTMxMg==&mid=2649493083&idx=2&sn=f8346e83b83c5ed15e5f2994a194169f&chksm=8eec85a4b99b0cb2a6bf0983e5773000475d19820734a4a9aae8d6b6ec59a24e3d5681cf4f24&scene=38#wechat_redirect","niceDate":"2018-08-17","origin":"","projectLink":"","publishTime":1534435200000,"superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/410/1"}],"title":"Android插件化原理之Activity插件化","type":0,"userId":-1,"visible":1,"zan":0}]
         * offset : 20
         * over : false
         * pageCount : 9
         * size : 20
         * total : 176
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

        public List<DatasBean> getDatas() {
            return datas;
        }

        public void setDatas(List<DatasBean> datas) {
            this.datas = datas;
        }

        public static class DatasBean {
            /**
             * apkLink :
             * author : 玉刚说
             * chapterId : 410
             * chapterName : 玉刚说
             * collect : false
             * courseId : 13
             * desc :
             * envelopePic :
             * fresh : false
             * id : 5031
             * link : http://mp.weixin.qq.com/s?__biz=MzIwMTAzMTMxMg==&mid=2649493197&idx=1&sn=50cec1c926ffd2fefa1df42bc80d6b7e&chksm=8eec8532b99b0c24a083b93dfc3e683c05745df8a47e30682af9fc1190db7343827d7047a518&scene=38#wechat_redirect
             * niceDate : 2018-09-23
             * origin :
             * projectLink :
             * publishTime : 1537632000000
             * superChapterId : 408
             * superChapterName : 公众号
             * tags : [{"name":"公众号","url":"/wxarticle/list/410/1"}]
             * title : 中秋福利第一弹
             * type : 0
             * userId : -1
             * visible : 1
             * zan : 0
             */

            private String apkLink;
            private String author;
            private int chapterId;
            private String chapterName;
            private boolean collect;
            private int courseId;
            private String desc;
            private String envelopePic;
            private boolean fresh;
            private int id;
            private String link;
            private String niceDate;
            private String origin;
            private String projectLink;
            private long publishTime;
            private int superChapterId;
            private String superChapterName;
            private String title;
            private int type;
            private int userId;
            private int visible;
            private int zan;
            private List<TagsBean> tags;

            public String getApkLink() {
                return apkLink;
            }

            public void setApkLink(String apkLink) {
                this.apkLink = apkLink;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public int getChapterId() {
                return chapterId;
            }

            public void setChapterId(int chapterId) {
                this.chapterId = chapterId;
            }

            public String getChapterName() {
                return chapterName;
            }

            public void setChapterName(String chapterName) {
                this.chapterName = chapterName;
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

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
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

            public String getOrigin() {
                return origin;
            }

            public void setOrigin(String origin) {
                this.origin = origin;
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

            public int getSuperChapterId() {
                return superChapterId;
            }

            public void setSuperChapterId(int superChapterId) {
                this.superChapterId = superChapterId;
            }

            public String getSuperChapterName() {
                return superChapterName;
            }

            public void setSuperChapterName(String superChapterName) {
                this.superChapterName = superChapterName;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
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

            public List<TagsBean> getTags() {
                return tags;
            }

            public void setTags(List<TagsBean> tags) {
                this.tags = tags;
            }

            public static class TagsBean {
                /**
                 * name : 公众号
                 * url : /wxarticle/list/410/1
                 */

                private String name;
                private String url;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }
    }
}
