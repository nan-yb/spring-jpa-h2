package com.nan.sample.domain;

public enum RoleCd {
    
    NOMAL("N" , "NOMAL"),
    ADMIN("A" , "ADMIN"),
    SPECIAL("S" , "SPECIAL");

    public final String str;
    public final String securityName;
    
    private RoleCd(String str, String securityName) {
        this.str = str;
        this.securityName = securityName;
    }
    
    public static RoleCd of (String str) {
        for (RoleCd role : RoleCd.values()){
            if(str.equals(role.str)){
                return role;
            }
        }

        throw new RuntimeException("권한 확인");
    }
    
}
