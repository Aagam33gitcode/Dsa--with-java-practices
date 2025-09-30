package CodeVita;

import java.util.*;

public class QuestionA {
    static Map<String, List<String[]>> recipes = new HashMap<>();
    static Map<String, Integer> memo = new HashMap<>();

    public static int getCost(String potion) {
        return getCost(potion, new HashSet<>());
    }

    private static int getCost(String potion, Set<String> visiting) {
        if (memo.containsKey(potion)) {
            return memo.get(potion);
        }

        if (!recipes.containsKey(potion)) {
            memo.put(potion, 0);
            return 0;
        }

        // cycle detected
        if (visiting.contains(potion)) {
            return Integer.MAX_VALUE / 2;
        }

        visiting.add(potion);

        int minCost = Integer.MAX_VALUE;
        for (String[] ingred : recipes.get(potion)) {
            int cost = ingred.length - 1;
            for (String ing : ingred) {
                cost += getCost(ing, visiting);
            }
            minCost = Math.min(minCost, cost);
        }

        visiting.remove(potion);
        memo.put(potion, minCost);
        return minCost;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();
            String[] part = line.split("=");
            String potion = part[0].trim();
            String[] ingred = part[1].trim().split("\\+");
            recipes.computeIfAbsent(potion, k -> new ArrayList<>()).add(ingred);
        }
        String targetP = sc.nextLine().trim();
        int ans = getCost(targetP);
        if (ans >= Integer.MAX_VALUE / 2) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
        }
    }
}
