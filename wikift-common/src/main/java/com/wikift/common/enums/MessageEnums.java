/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.wikift.common.enums;

public enum MessageEnums {

    // 系统提示信息
    SUCCESS(0000, "成功"),

    PARAMS_NOT_NULL(4000, "参数不能为空"),
    PARAMS_VALIDATE_ERROR(4001, "参数输入错误"),
    PARAMS_CONTRAST_VALIDATE_ERROR(4002, "两次输入的数据不一致"),

    CREDENTIALS_BAD(4100, "无效的认证凭据, 请检查输入的认证信息"),

    UNSUPPORT_MEDIA_TYPE(4415, "不支持的数据类型");


    private Integer code;
    private String value;

    MessageEnums(Integer code, String value) {
        this.code = code;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public Integer getCode() {
        return code;
    }

}
