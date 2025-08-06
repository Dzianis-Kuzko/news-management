-- Создание схемы, если не существует
CREATE SCHEMA IF NOT EXISTS app;

-- Таблица news
CREATE TABLE IF NOT EXISTS app.news
(
    id    SERIAL PRIMARY KEY,
    time  TIMESTAMP NOT NULL,
    title TEXT      NOT NULL,
    text  TEXT      NOT NULL
);

-- Таблица comment
CREATE TABLE IF NOT EXISTS app.comment
(
    id       SERIAL PRIMARY KEY,
    time     TIMESTAMP NOT NULL,
    text     TEXT      NOT NULL,
    username TEXT      NOT NULL,
    news_id  INTEGER   NOT NULL,
    FOREIGN KEY (news_id) REFERENCES app.news (id)
);