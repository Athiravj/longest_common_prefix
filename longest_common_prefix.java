class Solution 
{
    public String longestCommonPrefix(String[] strs) 
    {
        if(strs.length==0) return "";
    while(strs[0].length()>0)
    {
        boolean flag=true;
      for(int j=1;j<strs.length;j++)
      {
      if(strs[j].length()>=strs[0].length())
      {
          if(!strs[j].substring(0,strs[0].length()).contains(strs[0]))
          {
              flag = false;
              break;
          }
      }
        else
        {
              strs[0]=strs[0].substring(0,strs[0].length()-1); 
            j--;
        }
      
    }
    if (flag==false)
      {
        strs[0]=strs[0].substring(0,strs[0].length()-1);  
      }  
        else
        {
            return strs[0];
        }

    } 
      return "";
    }       
    
};

