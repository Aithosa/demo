package com.example.demo.utils;

import com.netflix.config.DynamicProperty;
import com.netflix.config.DynamicPropertyFactory;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * The type Config utils.
 *
 * @author Percy
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ConfigUtils {
    /**
     * Get config with default value string.
     *
     * @param configName   the config name
     * @param defaultValue the default value
     * @return the string
     */
    public static String getConfigWithDefaultValue(String configName, String defaultValue) {
        return DynamicPropertyFactory.getInstance().getStringProperty(configName, defaultValue).get();
    }

    /**
     * Gets string config.
     *
     * @param configName the config name
     * @return the string config
     */
    public static String getStringConfig(String configName) {
        return DynamicProperty.getInstance(configName).getString();
    }

    /**
     * Gets config with default value.
     *
     * @param configName   the config name
     * @param defaultValue the default value
     * @return the config with default value
     */
    public static Integer getConfigWithDefaultValue(String configName, Integer defaultValue) {
        return DynamicPropertyFactory.getInstance().getIntProperty(configName, defaultValue).get();
    }

    /**
     * Gets config with default value.
     *
     * @param configName   the config name
     * @param defaultValue the default value
     * @return the config with default value
     */
    public static Boolean getConfigWithDefaultValue(String configName, Boolean defaultValue) {
        return DynamicPropertyFactory.getInstance().getBooleanProperty(configName, defaultValue).get();
    }
}
