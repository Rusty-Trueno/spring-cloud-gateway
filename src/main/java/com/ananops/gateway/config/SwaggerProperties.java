package com.ananops.gateway.config;

import lombok.Data;

/**
 * Created by rongshuai on 2020/3/17 18:54
 */
@Data
public class SwaggerProperties {
    private String title;

    private String description;

    private String version = "1.0";

    private String license = "Apache License 2.0";

    private String licenseUrl = "http://www.apache.org/licenses/LICENSE-2.0";

    private String contactName = "Ananops";

    private String contactUrl = "http://ananops.com";

    private String contactEmail = "ananops.net@gmail.com";
}
