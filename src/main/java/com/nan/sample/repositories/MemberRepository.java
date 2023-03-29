package com.nan.sample.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nan.sample.domain.TbMember;

public interface MemberRepository extends JpaRepository<TbMember, Long>{
    
}
