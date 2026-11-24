package com.quanxiaoha.framework.biz.operationlog.config;


import com.quanxiaoha.framework.biz.operationlog.aspect.ApiOperationLogAspect;
import org.aspectj.lang.reflect.CodeSignature;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class ApiOperationLogAutoConfiguration {
    @Bean
    public ApiOperationLogAspect apiOperationLogAspect(){
        return new ApiOperationLogAspect();
    }


}
