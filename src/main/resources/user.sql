
CREATE TABLE USER (
       userIdx          LONG NOT NULL,
       userId           VARCHAR2(10) NOT NULL,
       userNickName     VARCHAR2(20) NOT NULL,
       password         VARCHAR2(20),
       confirmPassword  VARCHAR2(20),
       level            int,
       tendency         int,
       introduction     VARCHAR2(100),ƒ
       authSnsIdx       int,
       commonDate       datetime,
      CONSTRAINT PLAYER_PK PRIMARY KEY (userIdx)

);