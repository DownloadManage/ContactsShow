package android.zhiqiang.com.contactsdemo.bean;

/**
 * Created by Administrator on 2017/6/30 0030.
 */

public abstract class ContactBean {
    private String sortLetters; // 显示数据拼音的首字母

    public String getSortLetters() {
        return sortLetters;
    }

    public void setSortLetters(String sortLetters) {
        this.sortLetters = sortLetters;
    }
}
