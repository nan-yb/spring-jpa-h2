package com.nan.sample.service;

import java.util.List;

import com.nan.sample.domain.TbMember;

public interface MemberService {
    
    List<TbMember> loadAll();

    void saveMember(TbMember member);

}
