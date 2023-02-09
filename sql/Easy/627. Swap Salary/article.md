
> ❤️: LIKE / UPVOTE
....... IF it was helpful

> 💬: COMMENT
....... Your thoughts / anything / solution which you came up with first

- My LeetCode Solution Github Repo
- https://github.com/withrvr/leetcode/

# All Possible Solution

- 4 Different Approach
- 7 Solution

---

### 1A. CASE THEN ( 2 WHEN )


```

UPDATE
    Salary
SET
    sex = CASE
        WHEN sex = 'f' THEN 'm'
        WHEN sex = 'm' THEN 'f'
    END


```


### 1B. CASE THEN ( 1 WHEN )


```

UPDATE
	Salary
SET
	sex = CASE
		WHEN sex = 'f' THEN 'm'
		ELSE 'f'
	END


```


### 2. IF


```

UPDATE
	Salary
SET
	sex = IF(sex = 'f', 'm', 'f');


```


### 3. REPLACE


```

UPDATE
	salary
SET
	sex = REPLACE ('fm', sex, '');


```


### 4A. ASCII XOR


```

-- if female => f ^ m ^ f => m
-- if ..male => m ^ m ^ f => f

-- since
-- x ^ x => 0
-- x ^ 0 => x

-- same gender will get cancel out
-- and other will return

UPDATE
	salary
SET
	sex = CHAR(ASCII(sex) ^ ASCII('f') ^ ASCII('m'));


```

### 4B . ASCII plus minus

```

UPDATE
	salary
SET
	sex = CHAR(ASCII('f') + ASCII('m') - ASCII(sex));


```



### 4C. Direct ASCII

```

-- credit
-- https://leetcode.com/problems/swap-salary/solutions/104713/accept-solution-with-xor/comments/107431
--
UPDATE
	salary
SET
	sex = char(ascii(sex) ^ 11);


```

> ❤️: LIKE / UPVOTE
....... IF it was helpfull

> 💬: COMMENT
....... Your thoughts / anything / solution which you came up with first

.