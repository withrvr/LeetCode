-- if female => f ^ m ^ f => m
-- if ..male => m ^ m ^ f => f
--
-- since
--
-- x ^ x => 0
-- x ^ 0 => x
--
-- same gender will get cancle out
-- and other will return
--
UPDATE
	salary
SET
	sex = CHAR(ASCII(sex) ^ ASCII('f') ^ ASCII('m'));