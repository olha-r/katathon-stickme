DROP TABLE IF EXISTS stickers;
DROP TABLE IF EXISTS sizes;
DROP TABLE IF EXISTS aspects;

CREATE TABLE sizes(
    id SERIAL PRIMARY KEY,
    name VARCHAR UNIQUE NOT NULL
);

CREATE TABLE aspects(
    id SERIAL PRIMARY KEY,
    name VARCHAR UNIQUE NOT NULL
);

CREATE TABLE stickers(
    id SERIAL PRIMARY KEY,
    name VARCHAR (100) UNIQUE NOT NULL,
    image_url VARCHAR(300) NOT NULL,
    description VARCHAR (1000) NOT NULL,
    size_id INTEGER NOT NULL,
     CONSTRAINT fk_size_id
        FOREIGN KEY (size_id)
        REFERENCES sizes(id),
    aspect_id INTEGER NOT NULL,
    CONSTRAINT fk_aspect_id
        FOREIGN KEY (aspect_id)
        REFERENCES aspects(id),
    price NUMERIC NOT NULL,
    created_at DATE NOT NULL
);
