--
-- @lc app=leetcode id=183 lang=mysql
--
-- [183] Customers Who Never Order
--

-- @lc code=start
# Write your MySQL query statement below
select c.name as Customers from Customers c left join Orders o on c.id = o.customerId where o.id is null;
-- @lc code=end

