SELECT
	DISTINCT player_id,
	MIN(event_date) over (PARTITION BY player_id) first_login
FROM
	Activity