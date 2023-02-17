package com.example.demo.config;

import com.example.demo.utils.ConfigUtils;
import com.netflix.config.DynamicProperty;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * The type Config.
 *
 * @author Percy
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Config {
    public static String getAppId() {
        return ConfigUtils.getConfigWithDefaultValue("app.id", "id");
    }

    public static String getAppId1() {
        return ConfigUtils.getStringConfig("app.id");
    }

    public static Boolean getConfEnable() {
        return ConfigUtils.getConfigWithDefaultValue("conf.enable", false);
    }

    public static Integer getConnectNum() {
        return ConfigUtils.getConfigWithDefaultValue("connect.num", 5);
    }
}
