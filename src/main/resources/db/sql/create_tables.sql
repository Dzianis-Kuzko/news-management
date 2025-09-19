CREATE TABLE IF NOT EXISTS news
(
    id    SERIAL PRIMARY KEY,
    time  TIMESTAMP NOT NULL,
    title TEXT      NOT NULL,
    text  TEXT      NOT NULL
);

CREATE TABLE IF NOT EXISTS comment
(
    id        SERIAL PRIMARY KEY,
    time      TIMESTAMP NOT NULL,
    text      TEXT      NOT NULL,
    user_name TEXT      NOT NULL,
    news_id   INTEGER   NOT NULL,
    FOREIGN KEY (news_id) REFERENCES news (id)
);