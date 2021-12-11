-- Вывод максимальной цены

CREATE DEFINER=`root`@`localhost` PROCEDURE `show_max_price`()
BEGIN
	SELECT MAX(price) from testdb.phones;
END

-- Вывод телефонов в ценовом диапазоне

CREATE DEFINER=`root`@`localhost` PROCEDURE `find_the_phones_in_range`(IN first_price int, IN second_price int)
BEGIN
IF first_price >= second_price
THEN 
	SELECT * FROM testdb.phones WHERE price BETWEEN second_price AND first_price;
ELSE
	SELECT * FROM testdb.phones WHERE price BETWEEN first_price AND second_price;
END IF;
END

-- Добавление нового телефона

CREATE DEFINER=`root`@`localhost` PROCEDURE `add_phone`(IN id int, IN model VARCHAR(50), IN manufacturer VARCHAR(50), IN quantity INT, IN price int)
BEGIN
	INSERT INTO `testdb`.`phones` (`id`, `model`, `manufacturer`, `quantity`, `price`) VALUES (id, model, manufacturer, quantity, price);
END

-- Получение максимального значения id из таблицы

CREATE FUNCTION `get_max_id` ()
RETURNS INTEGER
DETERMINISTIC
BEGIN
	DECLARE idx int;
	SELECT MAX(id) INTO idx from testdb.phones;
RETURN idx;
END

-- Добавление нового телефона без id

CREATE DEFINER=`root`@`localhost` PROCEDURE `add_phone_without_id`(IN model VARCHAR(50), IN manufacturer VARCHAR(50), IN quantity INT, IN price int)
BEGIN
	DECLARE id int;
    SET id = testdb.get_max_id() + 1;
    INSERT INTO `testdb`.`phones` (`id`, `model`, `manufacturer`, `quantity`, `price`) VALUES (id, model, manufacturer, quantity, price);
END

-- Изменение цен

CREATE DEFINER=`root`@`localhost` PROCEDURE `update_prices`()
BEGIN
	UPDATE testdb.phones
	SET price = price - 2000
	WHERE quantity > 0 AND quantity <= 3;
END
