package bcs.com.multiviewtype.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {
    @SerializedName("category_id")
    @Expose
    private Integer category_id;
    @SerializedName("color")
    @Expose
    private String color;
    @SerializedName("image_url")
    @Expose
    private String image_url;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("is_featured")
    @Expose
    private Integer is_featured;

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setIs_featured(Integer is_featured) {
        this.is_featured = is_featured;
    }

    public Integer getIs_featured() {
        return is_featured;
    }
}