CREATE SEQUENCE cqm_id_sequence
MINVALUE 1
MAXVALUE 9223372036854775806
START WITH 9223372036854775805
INCREMENT BY -1
CACHE 100;

CREATE TABLE users (
  user_id  INT,
  login    VARCHAR(100),
  email    VARCHAR(100),
  password VARCHAR(255),
  rating   INT,
  isAdmin  BOOLEAN,
  CONSTRAINT pk_user_id PRIMARY KEY (user_id),
  CONSTRAINT unique_user_email UNIQUE (email),
  CONSTRAINT unique_user_login UNIQUE (login)
);

CREATE TABLE cafeterias (
  cafe_id INT,
  name    VARCHAR(100),
  address VARCHAR(300),
  CONSTRAINT pk_cafe_id PRIMARY KEY (cafe_id)
);

CREATE TABLE reports (
  report_id INT,
  user_id   INT,
  cafe_id   INT,
  load      INT,
  date      DATE,
  CONSTRAINT pk_report_id PRIMARY KEY (report_id),
  CONSTRAINT fk_reports_user FOREIGN KEY (user_id) REFERENCES users (user_id),
  CONSTRAINT fk_reports_cafe FOREIGN KEY (cafe_id) REFERENCES cafeterias (cafe_id)
);