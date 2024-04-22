package Misclenious;

import java.util.ArrayList;

    public class bulb {


        public static ArrayList<Boolean> solve(ArrayList<ArrayList<Integer>>
                                                       bulbs){
            ArrayList<Boolean> res =  new ArrayList<Boolean>();
            ArrayList<Boolean> check =  new ArrayList<Boolean>();

            int max = bulbs.get(0).get(0);
            for (int j = 0; j < bulbs.size(); j++) {
                for (int i = 0; i < bulbs.get(j).size(); i++) {
                    if (bulbs.get(j).get(i) > max) {
                        max = bulbs.get(j).get(i);
                    }
                }
            }
            int min = bulbs.get(0).get(0);
            for (int j = 0; j < bulbs.size(); j++) {
                for (int i = 0; i < bulbs.get(j).size(); i++) {
                    if (bulbs.get(j).get(i) < min) {
                        min = bulbs.get(j).get(i);
                    }
                }
            }
            int M=0;
            if(Math.abs(max)>Math.abs(min))
            {
                M=Math.abs(max);
            }
            else
            {
                M=Math.abs(min);
            }

            int N=bulbs.size();
            for(int i=0;i<M;i++)
                res.add(false);
            for(int i=0;i<M;i++)
                check.add(false);


            for(int i=0;i<M;i++)
            {
                ///Boolean check=false;
                for(int j=0;j<N;j++)
                {
                    if(check.get(j))
                        continue;
                    if(bulbs.get(j).contains(i+1))
                    {res.set(i, true);
                        break;}
                    if(bulbs.get(j).contains(-i-1))
                    {	res.set(i, false);
                        //check=true;
                        check.set(j,true);
                        break;
                    }


                }
            }







            return res;

        }
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            int [][]inp = {{-4, -4, -1},
                    {13, -9, -14},
                    {4, -7, -2},
                    {-2, 6, 3},
                    {-6, -8, 11},
                    {-4, -3, -6},
                    {7, 11, -10},
                    {4, -7, 6},
                    {5, 6, 4},
                    {10, 14, -9}};
            ArrayList<Boolean> res =  new ArrayList<Boolean>();
            ArrayList<ArrayList<Integer>> input =  new ArrayList<ArrayList<Integer>>();
            for(int i=0;i<10;i++)
            {
                ArrayList<Integer> temp =  new ArrayList<Integer>();
                for(int j=0;j<3;j++)
                {
                    temp.add(inp[i][j]);

                }
                input.add(temp);
            }
            res=solve(input);

            for(int i=0;i<res.size();i++)
            {
                System.out.print(res.get(i)+"  ");
            }



        }

    }

