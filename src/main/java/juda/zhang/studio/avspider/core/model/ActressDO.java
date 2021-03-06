package juda.zhang.studio.avspider.core.model;

import java.util.List;

/**
 * 女优的基本信息
 * Created by Juda.Zhang on 2017/6/7.
 */
public class ActressDO extends BaseDO {
    /**
     * 女优的现用艺名,唯一
     */
    private String name;
    /**
     * 出生日期YYYY-MM-DD
     */
    private String birthday;
    /**
     * 罩杯
     */
    private String cup;
    /**
     * 身高，单位cm
     */
    private Integer height;
    /**
     * 0:亚洲 1:欧美 2:大陆 3:港台 4:东南亚 5:中亚 6:南美 7:非洲 99:其他
     */
    private Integer region;
    /**
     * 胸围
     */
    private Integer bust;
    /**
     * 腰围
     */
    private Integer waist;
    /**
     * 臀围
     */
    private Integer hips;

    /**
     * 女优现用艺名姓名,曾用艺名
     */
    private List<String> names;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getCup() {
        return cup;
    }

    public void setCup(String cup) {
        this.cup = cup;
    }

    public Integer getRegion() {
        return region;
    }

    public void setRegion(Integer region) {
        this.region = region;
    }

    public Integer getBust() {
        return bust;
    }

    public void setBust(Integer bust) {
        this.bust = bust;
    }

    public Integer getWaist() {
        return waist;
    }

    public void setWaist(Integer waist) {
        this.waist = waist;
    }

    public Integer getHips() {
        return hips;
    }

    public void setHips(Integer hips) {
        this.hips = hips;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }
}
