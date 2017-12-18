package com.sarjita.String;

public class DuplicateString
{
	public static void main(String[] args) {
		String s="Java is easy easy if we we practice.";
		String str="";
		String[]st=s.split(" ");
		for(int i=0;i<st.length;i++)
		{
			for(int j=i+1;j<st.length;j++)
			{
				if(st[i].equals(st[j]))
				{
					st[j]=" ";
				}
			}
		}
		for(int i=0;i<st.length;i++)
		{
			if(st[i]!=" ")
			{
				System.out.print(st[i]+" ");
			}
		}
	}
}
