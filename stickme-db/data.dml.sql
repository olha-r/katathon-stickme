DELETE FROM stickers;
DELETE FROM sizes;
DELETE FROM aspects;

INSERT INTO sizes
    (name)
    VALUES
    ('Small'), ('Medium'), ('Big');

INSERT INTO aspects
    (name)
    VALUES
    ('Matte'), ('Glossy');

INSERT INTO stickers
    (name, image_url, description, size_id, aspect_id, price, created_at)
    VALUES
    ('It Works On My Machine - Excuse du Programmeur',
    'https://ih1.redbubble.net/image.121551245.2521/bg,f8f8f8-flat,750x,075,f-pad,750x1000,f8f8f8.u1.jpg',
    'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean ornare interdum lectus, ac condimentum turpis euismod non. Nullam et nisi egestas, hendrerit turpis ut, placerat ligula. Mauris vulputate elit est, id dictum nibh condimentum congue. Fusce vitae lacus quis purus ultricies tempor a et erat. Nunc sit amet interdum turpis. Maecenas dapibus ex facilisis, euismod est ac, tincidunt felis. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Integer sapien enim, sollicitudin nec lorem dignissim, pharetra commodo quam. Pellentesque eu iaculis ex. Nam eget arcu purus. Maecenas ultricies ornare sapien, quis facilisis sem posuere sit amet.',
    (SELECT id FROM sizes WHERE name = 'Small'),
    (SELECT id FROM aspects WHERE name = 'Matte'),
    '2.05',
    now()
    ),
    ('Code propre',
    'https://ih1.redbubble.net/image.912856463.4905/bg,f8f8f8-flat,750x,075,f-pad,750x1000,f8f8f8.u2.jpg',
    'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean ornare interdum lectus, ac condimentum turpis euismod non. Nullam et nisi egestas, hendrerit turpis ut, placerat ligula. Mauris vulputate elit est, id dictum nibh condimentum congue. Fusce vitae lacus quis purus ultricies tempor a et erat. Nunc sit amet interdum turpis. Maecenas dapibus ex facilisis, euismod est ac, tincidunt felis. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Integer sapien enim, sollicitudin nec lorem dignissim, pharetra commodo quam. Pellentesque eu iaculis ex. Nam eget arcu purus. Maecenas ultricies ornare sapien, quis facilisis sem posuere sit amet.',
    (SELECT id FROM sizes WHERE name = 'Medium'),
    (SELECT id FROM aspects WHERE name = 'Matte'),
    '2.55',
    now()
    ),
    ('GitHub - Sticker',
    'https://ih1.redbubble.net/image.991044537.9947/bg,f8f8f8-flat,750x,075,f-pad,750x1000,f8f8f8.jpg',
    'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean ornare interdum lectus, ac condimentum turpis euismod non. Nullam et nisi egestas, hendrerit turpis ut, placerat ligula. Mauris vulputate elit est, id dictum nibh condimentum congue. Fusce vitae lacus quis purus ultricies tempor a et erat. Nunc sit amet interdum turpis. Maecenas dapibus ex facilisis, euismod est ac, tincidunt felis. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Integer sapien enim, sollicitudin nec lorem dignissim, pharetra commodo quam. Pellentesque eu iaculis ex. Nam eget arcu purus. Maecenas ultricies ornare sapien, quis facilisis sem posuere sit amet.',
    (SELECT id FROM sizes WHERE name = 'Big'),
    (SELECT id FROM aspects WHERE name = 'Matte'),
    '1.45',
    now()
    ),
    ('StuckOverflow',
    'https://ih1.redbubble.net/image.767534618.6817/bg,f8f8f8-flat,750x,075,f-pad,750x1000,f8f8f8.u2.jpg',
    'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean ornare interdum lectus, ac condimentum turpis euismod non. Nullam et nisi egestas, hendrerit turpis ut, placerat ligula. Mauris vulputate elit est, id dictum nibh condimentum congue. Fusce vitae lacus quis purus ultricies tempor a et erat. Nunc sit amet interdum turpis. Maecenas dapibus ex facilisis, euismod est ac, tincidunt felis. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Integer sapien enim, sollicitudin nec lorem dignissim, pharetra commodo quam. Pellentesque eu iaculis ex. Nam eget arcu purus. Maecenas ultricies ornare sapien, quis facilisis sem posuere sit amet.',
    (SELECT id FROM sizes WHERE name = 'Small'),
    (SELECT id FROM aspects WHERE name = 'Glossy'),
    '3.12',
    now()
    ),
    ('DÃ©veloppeur Full Snack',
    'https://ih1.redbubble.net/image.906893060.1802/bg,f8f8f8-flat,750x,075,f-pad,750x1000,f8f8f8.jpg',
    'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean ornare interdum lectus, ac condimentum turpis euismod non. Nullam et nisi egestas, hendrerit turpis ut, placerat ligula. Mauris vulputate elit est, id dictum nibh condimentum congue. Fusce vitae lacus quis purus ultricies tempor a et erat. Nunc sit amet interdum turpis. Maecenas dapibus ex facilisis, euismod est ac, tincidunt felis. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Integer sapien enim, sollicitudin nec lorem dignissim, pharetra commodo quam. Pellentesque eu iaculis ex. Nam eget arcu purus. Maecenas ultricies ornare sapien, quis facilisis sem posuere sit amet.',
    (SELECT id FROM sizes WHERE name = 'Medium'),
    (SELECT id FROM aspects WHERE name = 'Glossy'),
    '4.55',
    now()
    ),
    ('Mon CSS is perfect',
    'https://ih1.redbubble.net/image.530120368.0037/bg,f8f8f8-flat,750x,075,f-pad,750x1000,f8f8f8.u4.jpg',
    'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean ornare interdum lectus, ac condimentum turpis euismod non. Nullam et nisi egestas, hendrerit turpis ut, placerat ligula. Mauris vulputate elit est, id dictum nibh condimentum congue. Fusce vitae lacus quis purus ultricies tempor a et erat. Nunc sit amet interdum turpis. Maecenas dapibus ex facilisis, euismod est ac, tincidunt felis. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Integer sapien enim, sollicitudin nec lorem dignissim, pharetra commodo quam. Pellentesque eu iaculis ex. Nam eget arcu purus. Maecenas ultricies ornare sapien, quis facilisis sem posuere sit amet.',
    (SELECT id FROM sizes WHERE name = 'Big'),
    (SELECT id FROM aspects WHERE name = 'Matte'),
    '3.80',
    now()
    ),
    ('Code Cat Sticker',
    'https://ih1.redbubble.net/image.969938492.4298/bg,f8f8f8-flat,750x,075,f-pad,750x1000,f8f8f8.jpg',
    'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean ornare interdum lectus, ac condimentum turpis euismod non. Nullam et nisi egestas, hendrerit turpis ut, placerat ligula. Mauris vulputate elit est, id dictum nibh condimentum congue. Fusce vitae lacus quis purus ultricies tempor a et erat. Nunc sit amet interdum turpis. Maecenas dapibus ex facilisis, euismod est ac, tincidunt felis. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Integer sapien enim, sollicitudin nec lorem dignissim, pharetra commodo quam. Pellentesque eu iaculis ex. Nam eget arcu purus. Maecenas ultricies ornare sapien, quis facilisis sem posuere sit amet.',
    (SELECT id FROM sizes WHERE name = 'Small'),
    (SELECT id FROM aspects WHERE name = 'Glossy'),
    '2.55',
    now()
    ),
    ('Stickers ducks',
    'https://ih1.redbubble.net/image.1462111511.2401/bg,f8f8f8-flat,750x,075,f-pad,750x1000,f8f8f8.u2.jpg',
    'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean ornare interdum lectus, ac condimentum turpis euismod non. Nullam et nisi egestas, hendrerit turpis ut, placerat ligula. Mauris vulputate elit est, id dictum nibh condimentum congue. Fusce vitae lacus quis purus ultricies tempor a et erat. Nunc sit amet interdum turpis. Maecenas dapibus ex facilisis, euismod est ac, tincidunt felis. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Integer sapien enim, sollicitudin nec lorem dignissim, pharetra commodo quam. Pellentesque eu iaculis ex. Nam eget arcu purus. Maecenas ultricies ornare sapien, quis facilisis sem posuere sit amet.',
    (SELECT id FROM sizes WHERE name = 'Medium'),
    (SELECT id FROM aspects WHERE name = 'Matte'),
    '2.30',
    now()
    ),
    ('Git - Go fork yourself',
    'https://ih1.redbubble.net/image.766884448.1529/bg,f8f8f8-flat,750x,075,f-pad,750x1000,f8f8f8.jpg',
    'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean ornare interdum lectus, ac condimentum turpis euismod non. Nullam et nisi egestas, hendrerit turpis ut, placerat ligula. Mauris vulputate elit est, id dictum nibh condimentum congue. Fusce vitae lacus quis purus ultricies tempor a et erat. Nunc sit amet interdum turpis. Maecenas dapibus ex facilisis, euismod est ac, tincidunt felis. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Integer sapien enim, sollicitudin nec lorem dignissim, pharetra commodo quam. Pellentesque eu iaculis ex. Nam eget arcu purus. Maecenas ultricies ornare sapien, quis facilisis sem posuere sit amet.',
    (SELECT id FROM sizes WHERE name = 'Small'),
    (SELECT id FROM aspects WHERE name = 'Glossy'),
    '1.60',
    now()
    ),
    ('My code works I have no idea why',
    'https://ih1.redbubble.net/image.583282349.3102/bg,f8f8f8-flat,750x,075,f-pad,750x1000,f8f8f8.u1.jpg',
    'Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean ornare interdum lectus, ac condimentum turpis euismod non. Nullam et nisi egestas, hendrerit turpis ut, placerat ligula. Mauris vulputate elit est, id dictum nibh condimentum congue. Fusce vitae lacus quis purus ultricies tempor a et erat. Nunc sit amet interdum turpis. Maecenas dapibus ex facilisis, euismod est ac, tincidunt felis. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Integer sapien enim, sollicitudin nec lorem dignissim, pharetra commodo quam. Pellentesque eu iaculis ex. Nam eget arcu purus. Maecenas ultricies ornare sapien, quis facilisis sem posuere sit amet.',
    (SELECT id FROM sizes WHERE name = 'Medium'),
    (SELECT id FROM aspects WHERE name = 'Matte'),
    '4.44',
    now()
    );