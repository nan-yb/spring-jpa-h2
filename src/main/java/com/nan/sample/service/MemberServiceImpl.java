package com.nan.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nan.sample.domain.RoleCd;
import com.nan.sample.domain.TbMember;
import com.nan.sample.repositories.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService{
    
    @Autowired
    private MemberRepository memberRepository;

    @Override
    public List<TbMember> loadAll() {
        return memberRepository.findAll();
    }

	@Override
	public void saveMember(TbMember member) {
        memberRepository.save(new TbMember("Hans", "Meiser" , "123" ,  RoleCd.NOMAL.str));
	}

}
