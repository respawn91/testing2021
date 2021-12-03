-- Выбор всей таблицы
SELECT * FROM Phones
--
SELECT manufacturer, model FROM Phones
-- Отсортировать по цене
SELECT * FROM Phones ORDER BY price DESC
-- Отсортировать по цене по убыванию. Показать 5 штук
SELECT * FROM Phones 
ORDER BY price 
DESC
LIMIT 5
-- Вывести все телефоны с ценой большей 60000
SELECT * FROM Phones 
WHERE price > 60000
-- Вывести все телефоны с ценой большей 60000 по цене по убыванию. Показать 5 штук
SELECT * FROM Phones 
WHERE price > 60000
ORDER BY price 
DESC
LIMIT 5
-- Если надо выбрать конкретно айфон 11 например за 95ооо руб
SELECT * FROM Phones 
WHERE manufacturer = 'Apple' AND model = 'iPhone 11' AND price > 95000
-- Найти телефоны в ценой от 50000 до 80000
SELECT * FROM Phones 
WHERE price >= 50000 AND price <= 80000

SELECT * FROM Phones 
WHERE price BETWEEN 50000 AND 80000

-- Найти телефоны Apple, Xiaomi, Samsung
SELECT * FROM Phones 
WHERE manufacturer = 'Apple' OR manufacturer = 'Samsung' OR manufacturer = 'Xiaomi' 

SELECT * FROM Phones 
WHERE manufacturer IN ('Apple', 'Xiaomi', 'Samsung')

-- Найти телефоны кроме Apple, Xiaomi, Samsung
SELECT * FROM Phones 
WHERE manufacturer NOT IN ('Apple', 'Xiaomi', 'Samsung')

SELECT * FROM Phones 
WHERE manufacturer != 'Apple' AND manufacturer != 'Samsung' AND manufacturer != 'Xiaomi' 
