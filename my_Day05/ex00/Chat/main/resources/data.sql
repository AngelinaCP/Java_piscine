INSERT INTO chat.users (login, password) VALUES ('Maxim', '123');
INSERT INTO chat.users (login, password) VALUES ('Irina', '123');
INSERT INTO chat.users (login, password) VALUES ('Daria', '1234');
INSERT INTO chat.users (login, password) VALUES ('Marina', '12345');
INSERT INTO chat.users (login, password) VALUES ('Sergey', '123456');

INSERT INTO chat.rooms (name, owner) VALUES ('music', 1);
INSERT INTO chat.rooms (name, owner) VALUES ('hobby', 2);
INSERT INTO chat.rooms (name, owner) VALUES ('sport', 3);
INSERT INTO chat.rooms (name, owner) VALUES ('programs', 4);
INSERT INTO chat.rooms (name, owner) VALUES ('animals', 5);


INSERT INTO chat.message (author, chatroom, text, time) VALUES (1, 1, 'Ivan Dorn', current_timestamp);
INSERT INTO chat.message (author, chatroom, text, time) VALUES (2, 2, 'reading books', current_timestamp);
INSERT INTO chat.message (author, chatroom, text, time) VALUES (3, 3, 'bikes', current_timestamp);
INSERT INTO chat.message (author, chatroom, text, time) VALUES (4, 4, 'python', current_timestamp);
INSERT INTO chat.message (author, chatroom, text, time) VALUES (5, 5, 'cat and dog', current_timestamp);
INSERT INTO chat.message (author, chatroom, text, time) VALUES (5, 5, 'horse and dog', current_timestamp);