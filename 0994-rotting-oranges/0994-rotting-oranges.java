class Solution {
    public class Orange {
        int i;
        int j;

        Orange(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }

    int time = 0;
    int fresh;

    public int orangesRotting(int[][] grid) {
        Queue<Orange> pq = new LinkedList<>();
        fresh = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    pq.add(new Orange(i, j));
                }
                if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }

        if (fresh == 0) {
            return 0;
        }

        int a = check(pq, grid);
        if (a > 0) {
            return -1;
        }

        return time - 1;
    }

    public int check(Queue<Orange> pq, int[][] arr) {
        while (!pq.isEmpty()) {
            int b = pq.size();
            for (int i = 0; i < b; i++) {
                Orange a = pq.remove();
                if (a.i > 0 && arr[a.i - 1][a.j] == 1) {
                    pq.add(new Orange(a.i - 1, a.j));
                    arr[a.i - 1][a.j] = 2;
                    fresh--;
                }
                if (a.i < arr.length - 1 && arr[a.i + 1][a.j] == 1) {
                    pq.add(new Orange(a.i + 1, a.j));
                    arr[a.i + 1][a.j] = 2;
                    fresh--;
                }
                if (a.j > 0 && arr[a.i][a.j - 1] == 1) {
                    pq.add(new Orange(a.i, a.j - 1));
                    arr[a.i][a.j - 1] = 2;
                    fresh--;
                }
                if (a.j < arr[0].length - 1 && arr[a.i][a.j + 1] == 1) {
                    pq.add(new Orange(a.i, a.j + 1));
                    arr[a.i][a.j + 1] = 2;
                    fresh--;
                }
            }
            time++;
        }
        return fresh;
    }
}
