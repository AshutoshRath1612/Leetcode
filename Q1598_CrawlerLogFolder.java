package Leetcode;

import java.util.Stack;

public class Q1598_CrawlerLogFolder {
    public static int minOperations(String[] logs) {
        Stack<String> path = new Stack<>();

        for (String str: logs) {
            if (str.equals("../")) {
                if (!path.isEmpty())
                    path.pop();
            }
            else if (str.equals("./")) {
                continue;
            }
            else{
                 path.push(str);
            }
        }

        int count = 0;
        while (!path.isEmpty()) {
            path.pop();
            count++;
        }

        return count;
    }

    public int minOperations2(String[] logs) {
        int count = 0;

        for (String str: logs) {
            if (str.equals("../")) {
                if (count > 0) {
                    count--;
                }
            }
            else if (!str.equals("./")) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String [] logs = {"./","../","./"};
        System.out.println(minOperations(logs));
    }
}
