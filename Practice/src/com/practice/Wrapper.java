package com.practice;

import java.util.ArrayList;
import java.util.List;

import javax.imageio.IIOException;

public class Wrapper {
	
	List<Double> sum(String arg) throws IIOException {
		List<Double> l = new ArrayList<Double>();
		try {
			String[] str = arg.split(",");
			double sum = 0;

			for (String s : str) {

				sum += Double.parseDouble(s);
				l.add(Double.parseDouble(s));

			}
			l.add(sum);
			//return l;
			throw new IIOException(arg);
			

//		} catch (NumberFormatException e) {
//			System.out.println("exception occured "+e);
		}finally {
			System.out.println("hello");
		}
		//return l;
	}

	public static void main(String[] args) throws IIOException {
		// TODO Auto-generated method stub
		
		Integer i = 10;
		int i1 =i;
		
		Integer i2 = i;
		
		String s1="235";
	//	int i=Integer.parseInt(s1);
	
		//Integer i1= Integer.valueOf(i);
	
		String str = args[1];
		Wrapper w = new Wrapper();
		System.out.println(w.sum(args[0]));

	}

}
