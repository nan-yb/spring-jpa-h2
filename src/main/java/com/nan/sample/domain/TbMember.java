package com.nan.sample.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "TB_MEMBER")
@Getter
@Setter
@NoArgsConstructor
public class TbMember extends BaseVO{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USR_ID")
    private Long usrId;

    @Column(name = "USR_EMAL")
    private String usrEmal;

    @Column(name = "pswd")
    private String pswd;
    
    @Column(name = "fnam")
    private String fnam;

    @Column(name = "roleCd")
    private String roleCd;
    
    public TbMember(String usrEmal, String pswd, String fnam, String roleCd) {
        this.usrEmal = usrEmal;
        this.pswd = pswd;
        this.fnam = fnam;
        this.roleCd = roleCd;
    }

}
