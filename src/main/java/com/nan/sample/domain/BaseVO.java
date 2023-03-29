package com.nan.sample.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public class BaseVO {

    @Column(name = "rgtr_id")
    private Long rgtrId;
    
    @Column(name = "regt_dtm" , columnDefinition = "timestamp default CURRENT_TIMESTAMP")     
    @CreatedDate    
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private LocalDateTime regtDtm;

    @Column(name = "modr_id")
	private Long modrId;

    @Column(name = "mdfy_dtm" , columnDefinition = "timestamp default CURRENT_TIMESTAMP")
    @LastModifiedDate
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	private LocalDateTime mdfyDtm;

}
