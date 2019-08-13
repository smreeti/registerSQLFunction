package com.example.demo.configuration;

import org.hibernate.dialect.MySQL57Dialect;
import org.hibernate.dialect.function.StandardSQLFunction;
import org.hibernate.type.StandardBasicTypes;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RegisterFunction extends MySQL57Dialect {
    public RegisterFunction() {
        super();
        registerFunction(
                "group_concat",
                new StandardSQLFunction(
                        "group_concat",
                        StandardBasicTypes.STRING
                )
        );
    }
}


//    @Override
//    public void contribute(MetadataBuilder metadataBuilder) {
//        metadataBuilder.applySqlFunction(
//                "group_concat",
//                new StandardSQLFunction(
//                        "group_concat",
//                        StandardBasicTypes.STRING
//                )
//        );
//    }



