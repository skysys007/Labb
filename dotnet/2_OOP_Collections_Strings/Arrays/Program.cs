using System;

class Program
{
    static void Main(string[] args)
    {
        // METHOD 1
        int[] ar = new int[5];
        ar[0] = 2;
        ar[1] = 4;
        ar[2] = 6;
        ar[3] = 8;
        ar[4] = 9;

        // METHOD 2
        int[] arr1 = {1, 2, 3, 4};

        // 2D Array
        int[,] arr2 =
        {
            {1, 2, 3},
            {3, 4, 5}
        };

        // accessinbg 2d arrays
        for (int i = 0; i < 2; i++)
        {   
            for (int j = 0; j < 3; j++)
            {
                Console.WriteLine($"[{i}{j}: {arr2[i, j]}]");
            }
        }
        
        // JAGGED ARRAY
        int[][] jar = new int[2][];
        jar[0] = new int[]{1, 2, 3};
        jar[1] = new int[]{4, 5};


        int[][] jagged = new int[][]
        {
            new int[] {1, 2, 4},
            new int[] {4,7}
        };

        for (int i = 0; i < jar.Length; i++)
        {
            for (int j = 0; j < jar[i].Length; j++)
            {
                Console.WriteLine($"E1 {i}{j} = {jar[i][j]} E2 {i}{j} = {jagged [i][j]}");
            }
        }
        




        

    }
}