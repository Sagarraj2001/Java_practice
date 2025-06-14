class pattern {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        System.out.println("------Solid Rectangle pattern-------");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println("------Hollow Rectangle-------");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("------Half Pyramid-------");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        System.out.println("------Inverted Half Pyramid-------");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("------Inverted Half Pyramid 180 -------");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------Number Half Pyramid---------");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("--------Inverted Number Half Pyramid---------");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("--------Floyd Traianle---------");
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        System.out.println("--------1 and 0 Traianle---------");
        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=i;j++){
                int sum=i+j;
                if(sum%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

    }
}