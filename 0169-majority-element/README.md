# 169. Majority Element

**Difficulty:** Easy  
**Topics:** Arrays, Hashing, Divide and Conquer, Sorting, Counting, Boyer–Moore Majority Vote Algorithm  
**Link:** [Open on LeetCode](https://leetcode.com/problems/majority-element/)

## Problem

<p>Given an array <code>nums</code> of size <code>n</code>, return <em>the majority element</em>.</p>

<p>The majority element is the element that appears more than <code>&lfloor;n / 2&rfloor;</code> times. You may assume that the majority element always exists in the array.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>
<pre><strong>Input:</strong> nums = [3,2,3]
<strong>Output:</strong> 3
</pre><p><strong class="example">Example 2:</strong></p>
<pre><strong>Input:</strong> nums = [2,2,1,1,1,2,2]
<strong>Output:</strong> 2
</pre>
<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>n == nums.length</code></li>
	<li><code>1 &lt;= n &lt;= 5 * 10<sup>4</sup></code></li>
	<li><code>-10<sup>9</sup> &lt;= nums[i] &lt;= 10<sup>9</sup></code></li>
	<li>The input is generated such that a majority element will exist in the array.</li>
</ul>

<p>&nbsp;</p>
<strong>Follow-up:</strong> Could you solve the problem in linear time and in <code>O(1)</code> space?

## Submissions

| Language | Runtime | Memory | Solved on | Submission | Solution |
| --- | --- | --- | :---: | :---: | --- |
| Java | 22 ms (7.73%) | 54.6 MB (89.54%) | 2026-10-24 15:01 UTC | [2180567983](https://leetcode.com/submissions/detail/2180567983/) | [majority-element.java](./majority-element.java) |
