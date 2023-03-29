package com.nan.sample.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity

@Getter
@Setter
@NoArgsConstructor
public class TbBoardReply extends BaseVO{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long replyId;

    @Column(name = "USR_ID")
    private String usrId;

    @Column(name = "REPLY_CONTENT")
    private String replyContent;

    @Column(name = "BOARD_ID")
    private String boardId;

    @Column(name = "BOARD_DIV_CD")
    private String boardDivCd;

}
