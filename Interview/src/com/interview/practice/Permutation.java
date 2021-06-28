package com.interview.practice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
	
	public List<List<Integer>> permute1(int[] nums) {

		int[] in = nums;
		List<Integer> out = new ArrayList<Integer>();
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		return permuteHelper(in, out, result);
	}
    
	public List<List<Integer>> permuteHelper(int[] in, List<Integer> out, List<List<Integer>> result) {

		if (out.size() == in.length) {
			result.add(new ArrayList<>(out));

		} else {

			for (int i = 0; i < in.length; i++) {
				if (out.contains(in[i]))
					continue;
				out.add(in[i]);

				permuteHelper(in, out, result);

				out.remove(out.size() - 1);

			}
		}

		return result;

	}
void permute(String str) {
	
	
	
	char[] in = str.toCharArray();
	StringBuffer out = new StringBuffer();
	int length = str.length();
	boolean[] used = new boolean[length];
	

	
	doPermute(in,out,used,length,0,0);
}

void doPermute(char[] in,StringBuffer out,boolean[] used,int length,int level,int k) {
	
	//System.out.println("= in is ="+new String(in)+" =out is= "+out.toString()+"= length is ="+length+"= level is ="+level+"=i="+k);
	//System.out.println("= used[0] ="+used[0]+"= used[1] ="+used[1]+"= used[2] ="+used[2]+"= used[3] ="+used[3]);
	
	if(level == length) {
		//System.out.println("************");
		System.out.println(out.toString());
		return;
	}
	
	for(int i=0;i<length;i++) {
		if(used[i])   continue;
		
		out.append(in[i]);
		used[i] = true;
		
		doPermute(in,out,used,length,level+1,i);
	    used[i] = false;
		out.setLength(out.length()-1);
		
	}
	
}

public static void main(String args[]) {
	
	Permutation p = new Permutation();
//	p.permute("abcd");
	
	int[] arr = {1,2,3,4,1,2};
	
	List<List<Integer>> result = p.permute1(arr);
	
	for(int i=0;i<result.size();i++) {
		System.out.println("the valus is"+result.get(i));
	}
}


}
