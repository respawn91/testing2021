-- Использование агрегатных функций
SELECT MAX(price) FROM phones
SELECT MIN(price) FROM phones
SELECT AVG(price) FROM phones
SELECT SUM(price) FROM phones
SELECT COUNT(price) FROM phones

-- Найти информацию о телефоне с максимальной ценой
SELECT * FROM phones 
ORDER BY price
DESC
LIMIT 1


SELECT * FROM phones WHERE price = (SELECT MAX(price) FROM phones)

-- Найти телефоны с ценой выше средней
SELECT * FROM phones WHERE price > (SELECT AVG(price) FROM phones)

-- Вывести настоящую среднюю цену для всех телефонов
SELECT *, price*quantity AS Total FROM phones
SELECT SUM(price*quantity)/SUM(quantity) FROM phones

-- Найти количество производителей телефонов
SELECT DISTINCT(manufacturer) FROM phones
SELECT COUNT(DISTINCT(manufacturer)) FROM phones

-- Найти среднюю цену телефонов по производителям
SELECT manufacturer, ROUND(AVG(price), 2) FROM phones
GROUP BY manufacturer

-- Вывести модели и их количество
SELECT model, manufacturer, SUM(quantity) FROM phones
GROUP BY model, manufacturer

-- Найти среднюю цену телефонов по производителям со средней ценой большей 60000
SELECT manufacturer, ROUND(AVG(price), 2) FROM phones
GROUP BY manufacturer
HAVING AVG(price) > 60000

-- Вывести всю информацию обо всех товарах
SELECT * FROM products
	JOIN prices ON prices.product_id = products.id
	JOIN manufacturers ON manufacturers.id = products.manufacturer_id
 
SELECT products.id, products.name, prices.value, manufacturers.name, manufacturers.location FROM products
	JOIN prices ON prices.product_id = products.id
	JOIN manufacturers ON manufacturers.id = products.manufacturer_id

SELECT p.id, p.name, pr.value, m.name, m.location FROM products p
	JOIN prices pr ON pr.product_id = p.id
	JOIN manufacturers m ON m.id = p.manufacturer_id
	
-- Вывести всю информацию обо всех товарах производителей из Москвы
SELECT p.id, p.name, pr.value, m.name, m.location FROM products p
	JOIN prices pr ON pr.product_id = p.id
	JOIN manufacturers m ON m.id = p.manufacturer_id
WHERE m.location = 'Moscow'

SELECT p.id, p.name, pr.value, m.name, m.location FROM products p
	JOIN prices pr ON pr.product_id = p.id
	JOIN manufacturers m ON m.id = p.manufacturer_id AND m.location = 'Moscow'
	
-- LEFT/RIGHT/INNER JOIN
SELECT p.id, p.name, pr.value FROM products p
	INNER JOIN prices pr ON pr.product_id = p.id
	
SELECT p.id, p.name, pr.value FROM products p 
	LEFT JOIN prices pr ON pr.product_id = p.id
	
SELECT products.id, products.name, prices.value FROM prices 
	RIGHT JOIN products ON prices.product_id = products.id

-- Вывести производетелей товаров, количество их товаров на рынке и среднюю цену
SELECT manufacturers.name, COUNT(products.id), ROUND(AVG(prices.value),2) FROM products
	JOIN prices ON prices.product_id = products.id
	JOIN manufacturers ON manufacturers.id = products.manufacturer_id
GROUP BY manufacturers.name
ORDER BY AVG(prices.value)
DESC