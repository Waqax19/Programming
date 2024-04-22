package CaseStudies;

public class StringSUb
{
    public int lengthOfLongestSubString(String s)
    {
        int number = s.length();

        int result = 0;

        //check-Repetition

        for (int i = 0; i < number; i++)
        {
            for (int j = i; j < number; j++)
            {
                if (checkRepetition(s, i, j))
                {
                    result = Math.max(result, j - i + 1);
                }
            }
        }

        return  result;
    }

    private boolean checkRepetition(String s, int start, int end)
    {
        int[] chars = new int[128];

        for (int i = start; i <= end; i++)
        {
            char c = s.charAt(i);

            chars[c]++;

            if(chars[c] > 1)
            {
                return false;
            }
        }

        return true;
    }
}
