package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;


public class streamsexample {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	//@Test
		public void regualr() {
		ArrayList<String> names=new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Ashish");
		names.add("Mark");
		names.add("Praneeth");
		names.add("Srikanth");
		int count=0;
		for (String name: names) {
			
			if(name.startsWith("A")) 
			{
				count+=1;
			}
		}
		
		System.out.println(count);
		}
		//@Test
		public void method2(){
			ArrayList<String> names=new ArrayList<String>();
			names.add("Abhijeet");
			names.add("Ashish");
			names.add("Mark");
			names.add("Praneeth");
			names.add("Srikanth");
			int c=(int) names.stream().filter(s->s.startsWith("A")).count();
			System.out.println(c);
		
	}
		//@Test
		public void mapper() {
			ArrayList<String> names=new ArrayList<String>();
			names.add("Abhi");
			names.add("Ashish");
			names.add("Mark");
			names.add("Praneeth");
			names.add("Srikanth");
			
			
			Stream.of("Abhijeet","Akhanda","babji","rama","Aradhya").filter(s->s.length()>4).forEach(s->System.out.println(s.toUpperCase()));
			List<String> names1=Arrays.asList("Abhijeet","Akhanda","babji","rama","Aradhya");
			System.out.println("***********");
			names1.stream().filter(s-> s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
			System.out.println("***********");
			Stream<String> newstream=Stream.concat(names.stream(), names1.stream());
			//newstream.sorted().forEach(s->System.out.println(s));
			boolean flag=newstream.anyMatch(s->s.equalsIgnoreCase("Babji"));
			Assert.assertTrue(flag);
		}
		@Test
		public void collect() {
			List<String> ls=Stream.of("Abhijeet","Akhanda","babji","rama","Aradhya").filter(s->s.length()>4).map(s->s.toUpperCase()).collect(Collectors.toList());
			ls.stream().forEach(s->System.out.println(s));
			List<Integer> values=Arrays.asList(1,2,3,2,3,1,4,4,5);
			values.stream().sorted().collect(Collectors.toSet()).forEach(s->System.out.println(s));;
			
			
		}
}
