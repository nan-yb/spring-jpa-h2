

INSERT INTO TB_MEMBER (	USR_EMAL,PSWD,FNAM,ROLE_CD,RGTR_ID, MODR_ID) 
VALUES 
('special@naver.com' , 1234 , '1234' , 'S'  , 3 , 3),
('normal@naver.com' , 1234 , '1234' , 'N' , 3 , 3),
('admin@naver.com' , 1234 , '1234' , 'A'  ,3 , 3),
('test@naver.com' , 1234 , '1234' , 'A'  ,3 , 3);

INSERT INTO TB_BOARD_NOTICE ( notice_title, notice_content, notice_yn, file_id, rgtr_id,  notice_writer, view_count) 
VALUES
	( '123', '<p>aefasefaef</p>', 'Y', NULL, 3 , '123',   0),
	( '123', '<p><br></p>', 'Y', NULL, 3, '123',     0),
	( '12312', '<p><br></p>', 'Y', NULL, 3, '123123',   0);



INSERT INTO TB_BOARD_REPLY (  	USR_ID,  	REPLY_CONTENT,  	BOARD_ID,  	BOARD_DIV_CD,  	RGTR_ID,  MODR_ID) 
VALUES
	(  1, '123',  1   ,   1 , 1 ,  1 ),
	(  2, '45' ,  1   ,   1 , 2 ,  1 ),
	(  3, '67' ,  1   ,   1 , 3 ,  1 );