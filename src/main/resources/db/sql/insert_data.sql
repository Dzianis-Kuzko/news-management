INSERT INTO app.news (time, title, text)
VALUES ('2025-09-01 10:00:00', 'News 1', 'Text of news 1'),
       ('2025-09-02 11:30:00', 'News 2', 'Text of news 2'),
       ('2025-09-03 09:15:00', 'News 3', 'Text of news 3'),
       ('2025-09-04 14:45:00', 'News 4', 'Text of news 4'),
       ('2025-09-05 08:20:00', 'News 5', 'Text of news 5'),
       ('2025-09-06 16:10:00', 'News 6', 'Text of news 6'),
       ('2025-09-07 12:05:00', 'News 7', 'Text of news 7'),
       ('2025-09-08 18:40:00', 'News 8', 'Text of news 8'),
       ('2025-09-09 07:55:00', 'News 9', 'Text of news 9'),
       ('2025-09-10 15:25:00', 'News 10', 'Text of news 10');

INSERT INTO app.comment (time, text, user_name, news_id)
VALUES ('2025-09-01 10:30:00', 'Comment 1 for news 1', 'Alice', 1),
       ('2025-09-01 11:00:00', 'Comment 2 for news 1', 'Bob', 1),

       ('2025-09-02 12:15:00', 'Comment 1 for news 2', 'Charlie', 2),

       ('2025-09-03 10:00:00', 'Comment 1 for news 3', 'Diana', 3),
       ('2025-09-03 10:45:00', 'Comment 2 for news 3', 'Eve', 3),

-- news 4 без комментариев

       ('2025-09-05 09:00:00', 'Comment 1 for news 5', 'Frank', 5),
       ('2025-09-05 09:30:00', 'Comment 2 for news 5', 'Grace', 5),

       ('2025-09-06 17:00:00', 'Comment 1 for news 6', 'Heidi', 6),

       ('2025-09-07 13:00:00', 'Comment 1 for news 7', 'Ivan', 7),
       ('2025-09-07 14:00:00', 'Comment 2 for news 7', 'Judy', 7),

-- news 8 без комментариев

       ('2025-09-09 08:30:00', 'Comment 1 for news 9', 'Kevin', 9),
       ('2025-09-09 09:15:00', 'Comment 2 for news 9', 'Laura', 9),
       ('2025-09-09 10:45:00', 'Comment 3 for news 9', 'Mike', 9),

       ('2025-09-10 16:00:00', 'Comment 1 for news 10', 'Nina', 10);