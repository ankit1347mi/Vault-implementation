package com.tyss.vaultconfig;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ConfigurationProperties("configffff")
public class Crendential {

    private String username;
    private String password;
}
