
/* TB_ETIP_MEMBER */
CREATE TABLE TB_MEMBER (
	USR_ID              SERIAL PRIMARY KEY,   /* 아이디 */
	USR_EMAL            VARCHAR(320)  ,       /* 이메일(아이디) */
	PSWD                VARCHAR(200)  ,       /* 비밀번호 */
	FNAM                VARCHAR(50)   ,       /* 이름 */
	ROLE_CD             VARCHAR(4)    ,       /* 회원구분 */
	RGTR_ID             INTEGER,             -- 등록자ID
	REGT_DTM            DATE  ,      -- 등록일시
	MODR_ID             INTEGER,              /* 최종수정자ID */
	MDFY_DTM            DATE         /* 최종수정일시 */
);

-- 공지사항
CREATE TABLE TB_BOARD_NOTICE (
	NOTICE_ID           SERIAL PRIMARY KEY , -- 공지사항ID
	NOTICE_TITLE        VARCHAR(20)   ,      -- 제목
	NOTICE_WRITER       VARCHAR(200) ,       -- 작성자
	NOTICE_CONTENT      VARCHAR(4000) ,      -- 내용
  NOTICE_YN           VARCHAR(2)    ,      -- 게시여부
  VIEW_COUNT          INTEGER       ,      -- 조회수
	FILE_ID             INTEGER       ,      -- 파일ID
	RGTR_ID             INTEGER,             -- 등록자ID
	REGT_DTM            DATE   ,      -- 등록일시
	MODR_ID             INTEGER,              /* 최종수정자ID */
	MDFY_DTM            DATE          /* 최종수정일시 */
);


CREATE TABLE TB_BOARD_REPLY (
	REPLY_ID            SERIAL PRIMARY KEY , -- 답변ID
	USR_ID              INTEGER   ,          -- 작성자ID
	REPLY_CONTENT       VARCHAR(1000) ,      -- 답변내용
  BOARD_ID            INTEGER   ,          -- 게시판ID           
  BOARD_DIV_CD        INTEGER   ,          -- 게시판 구분( 1 : 공지사항 )
	RGTR_ID             INTEGER,             -- 등록자ID
	REGT_DTM            DATE   ,      -- 등록일시
	MODR_ID             INTEGER,              /* 최종수정자ID */
	MDFY_DTM            DATE           /* 최종수정일시 */
);


