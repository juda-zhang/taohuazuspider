package juda.zhang.studio.avspider.utils;

/**
 * Created by Juda.Zhang on 2017/6/6.
 */
public class StringUtils extends org.apache.commons.lang3.StringUtils{

    /**
     * 过滤空格并且大写
     *
     * @param s
     * @return
     */
    public static String trimAndUpper(String s) {
        return org.apache.commons.lang3.StringUtils.upperCase(org.apache.commons.lang3.StringUtils.trim(s));
    }
}
