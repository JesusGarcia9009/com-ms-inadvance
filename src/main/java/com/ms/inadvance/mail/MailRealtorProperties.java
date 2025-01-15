package com.ms.inadvance.mail;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Component
@ConfigurationProperties("inadvance.mail.realtor")
public class MailRealtorProperties extends AbstractMailProperties{
	
    private String pass;
    private String recommend;

}
