# 75. Sort Colors

**Difficulty:** Medium  
**Topics:** Arrays, Two Pointers, Sorting, Quicksort, Bubble Sort  
**Link:** [Open on LeetCode](https://leetcode.com/problems/sort-colors/)

## Problem

<p>You are given an array <code>nums</code> with <code>n</code> objects colored red, white, or blue, sort them <strong><a href="https://en.wikipedia.org/wiki/In-place_algorithm" target="_blank">in-place</a> </strong>so that objects of the same color are adjacent, with the colors in the order red, white, and blue.</p>

<p>We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.</p>

<p>You must solve this problem without using the library&#39;s sort function.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">nums = [2,0,2,1,1,0]</span></p>

<p><strong>Output:</strong> <span class="example-io">[0,0,1,1,2,2]</span></p>

<p><strong>Explanation:</strong></p>

<p>The array has two 0s, two 1s, and two 2s. Sorting them in-place places all 0s first, then all 1s, then all 2s.</p>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">nums = [2,0,1]</span></p>

<p><strong>Output:</strong> <span class="example-io">[0,1,2]</span></p>

<p><strong>Explanation:</strong></p>

<p>The array has one each of 0, 1, and 2, arranged in-place in the order 0, 1, 2.</p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>n == nums.length</code></li>
	<li><code>1 &lt;= n &lt;= 300</code></li>
	<li><code>nums[i]</code> is either 0, 1, or 2.</li>
</ul>

<p>&nbsp;</p>
<p><strong>Follow up:</strong>&nbsp;Could you come up with a one-pass algorithm using only&nbsp;constant extra space?</p>

## Submissions

| Language | Runtime | Memory | Solved on | Submission | Solution |
| --- | --- | --- | :---: | :---: | --- |
| Java (1) | 0 ms (100%) | 43.4 MB (68.39%) | 2026-04-16 06:11 UTC | [1979798440](https://leetcode.com/submissions/detail/1979798440/) | [sort-colors.java](./sort-colors.java) |
| Java (2) | 0 ms (100%) | 42.8 MB (96.51%) | 2026-10-25 11:49 UTC | [2181347783](https://leetcode.com/submissions/detail/2181347783/) | [sort-colors-2181347783.java](./sort-colors-2181347783.java) |
