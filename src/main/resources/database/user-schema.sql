CREATE TABLE IF NOT EXISTS user (
    id BIGINT NOT NULL AUTO_INCREMENT,
    user_id VARCHAR(50) NOT NULL,
    user_name VARCHAR(50) NOT NULL,
    user_password VARCHAR(50) NOT NULL,
    user_phone VARCHAR(50) NOT NULL,
    user_address VARCHAR(100) NOT NULL,
    created_date DATETIME NOT NULL,
    modified_date DATETIME NULL,
    PRIMARY KEY (id, user_id),
    UNIQUE KEY (user_id)
);

CREATE TABLE IF NOT EXISTS user_address (
    user_id VARCHAR(50) NOT NULL,
    user_address VARCHAR(100) NOT NULL,
    user_zipcode VARCHAR(30) NOT NULL,
    PRIMARY KEY(user_id),
    FOREIGN KEY(user_id) REFERENCES user (user_id)
);