-- 코드를 입력하세요
SELECT BOOK_ID, DATE_FORMAT(PUBLISHED_DATE, '%Y-%m-%d') AS PUBLISHED_DATE
FROM BOOK
WHERE 1=1
AND CATEGORY = '인문'
AND PUBLISHED_DATE LIKE '2021%'
ORDER BY PUBLISHED_DATE