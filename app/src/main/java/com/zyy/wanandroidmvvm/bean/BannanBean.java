package com.zyy.wanandroidmvvm.bean;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.zyy.wanandroidmvvm.BR;

import java.util.List;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.BindingAdapter;

public class BannanBean extends BaseObservable {


    /**
     * data : [{"desc":"享学~","id":29,"imagePath":"https://wanandroid.com/blogimgs/bfcf57e5-aa5d-4ca3-9ca9-245dcbfd31e9.png","isVisible":1,"order":0,"title":"【Android开发教程】高级UI：自定义ViewGroup与UI性能优化","type":0,"url":"https://www.bilibili.com/video/BV1Ka4y1j7HA"},{"desc":"","id":6,"imagePath":"https://www.wanandroid.com/blogimgs/62c1bd68-b5f3-4a3c-a649-7ca8c7dfabe6.png","isVisible":1,"order":1,"title":"我们新增了一个常用导航Tab~","type":1,"url":"https://www.wanandroid.com/navi"},{"desc":"一起来做个App吧","id":10,"imagePath":"https://www.wanandroid.com/blogimgs/50c115c2-cf6c-4802-aa7b-a4334de444cd.png","isVisible":1,"order":1,"title":"一起来做个App吧","type":1,"url":"https://www.wanandroid.com/blog/show/2"},{"desc":"","id":20,"imagePath":"https://www.wanandroid.com/blogimgs/90c6cc12-742e-4c9f-b318-b912f163b8d0.png","isVisible":1,"order":2,"title":"flutter 中文社区 ","type":1,"url":"https://flutter.cn/"}]
     * errorCode : 0
     * errorMsg :
     */
    private int errorCode;
    private String errorMsg;

    private List<DataBean> data;
@Bindable
    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
        notifyPropertyChanged(BR.errorCode);

    }
@Bindable
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        notifyPropertyChanged(BR.errorMsg);
    }

@Bindable
    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
        notifyPropertyChanged(BR._all);
    }

    public static class DataBean extends BaseObservable{
        /**
         * desc : 享学~
         * id : 29
         * imagePath : https://wanandroid.com/blogimgs/bfcf57e5-aa5d-4ca3-9ca9-245dcbfd31e9.png
         * isVisible : 1
         * order : 0
         * title : 【Android开发教程】高级UI：自定义ViewGroup与UI性能优化
         * type : 0
         * url : https://www.bilibili.com/video/BV1Ka4y1j7HA
         */

        private String desc;
        private int id;
        private String imagePath;
        private int isVisible;
        private int order;
        private String title;
        private int type;
        private String url;

        @Override
        public String toString() {
            return "DataBean{" +
                    "desc='" + desc + '\'' +
                    ", id=" + id +
                    ", imagePath='" + imagePath + '\'' +
                    ", isVisible=" + isVisible +
                    ", order=" + order +
                    ", title='" + title + '\'' +
                    ", type=" + type +
                    ", url='" + url + '\'' +
                    '}';
        }

        @Bindable
        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
            notifyPropertyChanged(BR.desc);
        }
@Bindable
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
            notifyPropertyChanged(BR.id);
        }
@Bindable
        public String getImagePath() {
            return imagePath;
        }

        public void setImagePath(String imagePath) {
            this.imagePath = imagePath;
            notifyPropertyChanged(BR.imagePath);
        }
@Bindable
        public int getIsVisible() {
            return isVisible;
        }

        public void setIsVisible(int isVisible) {
            this.isVisible = isVisible;
            notifyPropertyChanged(BR.isVisible);
        }
@Bindable
        public int getOrder() {
            return order;
        }

        public void setOrder(int order) {
            this.order = order;
            notifyPropertyChanged(BR.order);
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
@Bindable
        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
            notifyPropertyChanged(BR.url);
        }
    }
    @BindingAdapter(value = "imageview")
    public static void Image(ImageView image, String image_url){
        Glide.with(image.getContext()).load(image_url).into(image);
    }

    @Override
    public String toString() {
        return "BannanBean{" +
                "errorCode=" + errorCode +
                ", errorMsg='" + errorMsg + '\'' +
                ", data=" + data +
                '}';
    }
}
