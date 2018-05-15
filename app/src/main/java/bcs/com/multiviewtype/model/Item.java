package bcs.com.multiviewtype.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Item {
    @SerializedName("path")
    @Expose
    private String path;
    @SerializedName("per_page")
    @Expose
    private Integer per_page;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("data")
    @Expose
    private List<Data> data;
    @SerializedName("last_page")
    @Expose
    private Integer last_page;
    @SerializedName("next_page_url")
    @Expose
    private Object next_page_url;
    @SerializedName("from")
    @Expose
    private Integer from;
    @SerializedName("to")
    @Expose
    private Integer to;
    @SerializedName("prev_page_url")
    @Expose
    private Object prev_page_url;
    @SerializedName("current_page")
    @Expose
    private Integer current_page;

    public void setPath(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPer_page(Integer per_page) {
        this.per_page = per_page;
    }

    public Integer getPer_page() {
        return per_page;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getTotal() {
        return total;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public List<Data> getData() {
        return data;
    }

    public void setLast_page(Integer last_page) {
        this.last_page = last_page;
    }

    public Integer getLast_page() {
        return last_page;
    }

    public void setNext_page_url(Object next_page_url) {
        this.next_page_url = next_page_url;
    }

    public Object getNext_page_url() {
        return next_page_url;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public Integer getFrom() {
        return from;
    }

    public void setTo(Integer to) {
        this.to = to;
    }

    public Integer getTo() {
        return to;
    }

    public void setPrev_page_url(Object prev_page_url) {
        this.prev_page_url = prev_page_url;
    }

    public Object getPrev_page_url() {
        return prev_page_url;
    }

    public void setCurrent_page(Integer current_page) {
        this.current_page = current_page;
    }

    public Integer getCurrent_page() {
        return current_page;
    }
}