package com.nan.sample.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@NoArgsConstructor
public class TbBoardNotice extends BaseVO{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long notice_id;

    @Column(name = "NOTICE_TITLE" , columnDefinition="varchar(20)")
    @Setter
    private String noticeTitle;

    @Column(name = "NOTICE_WRITER")
    @Setter
    private String noticeWriter;

    @Column(name = "NOTICE_CONTENT")
    @Setter
    private String noticeContent;

    @Column(name = "NOTICE_YN")
    @Setter
    private String noticeYn;

    @Column(name = "VIEW_COUNT" , columnDefinition="integer default 0")
    @Setter
    private Integer viewCount;

    @Column(name = "FILE_ID")
    @Setter
    private String fileId;

    // @ToString.Exclude
    // @OneToMany
    // private List<TbBoardReply> reply;

}
