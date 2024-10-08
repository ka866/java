
public class ArrayExamples
{
	public static void main(String[] args)
	{
	  int[] intArray={7,4,55,66,9,12,43,65,76,10};
	  byte[] byteArray={6,4,8,1,2,5,9,3,8,1};
	  short[] shortArray={0,9,8,7,6,5,4,3,2,1};
	  long[] longArray={100,200,300,60,37,65,43,54,32,10};
	  char[] charArray={'A','B','C','D','E','F','G','H','I','J'};
	  String[] stringArray={"Nandu","Riju","Praji","Swathi","Manish","Athul","Anish","Sumanth","Sahana","Uthpreksha"};
	  float[] floatArray={12.1f,4.7f,43.5f,23.5f,10.5f,20.5f,3.6f,7.6f,80.4f,33.6f};
	  double[] doubleArray={100.2d,20.5d,4.6d,29.8d,45.9d,56.7d,67.8d,98.6d,12.65d,65.34d};
	  System.out.println("Array elements of Integer array\n");
	  System.out.println("Array elements from left to right:");
	  for(int i=0;i<intArray.length;i++)
	  {
	  	System.out.println(intArray[i]);
	  }
	  System.out.println("Array elements from right to left:");
	  for(int i=intArray.length-1;i>=0;i--)
	  {
	  	System.out.println(intArray[i]);
	  }
	  System.out.println("Middle to right:");
	  for(int i=5;i<intArray.length;i++)
	  {
	  	System.out.println(intArray[i]);
	  }
	  System.out.println("Middle to left:");
	  for(int i=5;i>=0;i--)
	  {
	  	System.out.println(intArray[i]);
	  }
	  System.out.println("Skipping one index:");
	  for(int i=0;i<intArray.length;i=i+2)
	  {
	  	System.out.println(intArray[i]);
	  }
	  System.out.println("Array elements of byte array\n");
	  System.out.println("Array elements from left to right:");
	  for(int i=0;i<byteArray.length;i++)
	  {
	  	System.out.println(byteArray[i]);
	  }
	  System.out.println("Array elements from right to left:");
	  for(int i=byteArray.length-1;i>=0;i--)
	  {
	  	System.out.println(byteArray[i]);
	  }
	  System.out.println("Middle to right:");
	  for(int i=5;i<byteArray.length;i++)
	  {
	  	System.out.println(byteArray[i]);
	  }
	  System.out.println("Middle to left:");
	  for(int i=6;i>=0;i--)
	  {
	  	System.out.println(byteArray[i]);
	  }
	  System.out.println("Skipping one index:");
	  for(int i=0;i<byteArray.length;i=i+2)
	  {
	  	System.out.println(byteArray[i]);
	  }
	  System.out.println("Array elements of short array\n");
	  System.out.println("Array elements from left to right:");
	  for(int i=0;i<shortArray.length;i++)
	  {
	  	System.out.println(shortArray[i]);
	  }
	  System.out.println("Array elements from right to left:");
	  for(int i=shortArray.length-1;i>=0;i--)
	  {
	  	System.out.println(shortArray[i]);
	  }
	  System.out.println("Middle to right:");
	  for(int i=5;i<shortArray.length;i++)
	  {
	  	System.out.println(shortArray[i]);
	  }
	  System.out.println("Middle to left:");
	  for(int i=5;i>=0;i--)
	  {
	  	System.out.println(shortArray[i]);
	  }
	  System.out.println("Skipping one index:");
	  for(int i=0;i<shortArray.length;i=i+2)
	  {
	  	System.out.println(shortArray[i]);
	  }
	  System.out.println("Array elements of long array\n");
	  System.out.println("Array elements from left to right:");
	  for(int i=0;i<longArray.length;i++)
	  {
	  	System.out.println(longArray[i]);
	  }
	  System.out.println("Array elements from right to left:");
	  for(int i=longArray.length-1;i>=0;i--)
	  {
	  	System.out.println(longArray[i]);
	  }
	  System.out.println("Middle to right:");
	  for(int i=5;i<longArray.length;i++)
	  {
	  	System.out.println(longArray[i]);
	  }
	  System.out.println("Middle to left:");
	  for(int i=5;i>=0;i--)
	  {
	  	System.out.println(longArray[i]);
	  }
	  System.out.println("Skipping one index:");
	  for(int i=0;i<longArray.length;i=i+2)
	  {
	  	System.out.println(longArray[i]);
	  }
	  System.out.println("Array elements of character array\n");
	  System.out.println("Array elements from left to right:");
	  for(int i=0;i<charArray.length;i++)
	  {
	  	System.out.println(charArray[i]);
	  }
	  System.out.println("Array elements from right to left:");
	  for(int i=intArray.length-1;i>=0;i--)
	  {
	  	System.out.println(charArray[i]);
	  }
	  System.out.println("Middle to right:");
	  for(int i=5;i<charArray.length;i++)
	  {
	  	System.out.println(charArray[i]);
	  }
	  System.out.println("Middle to left:");
	  for(int i=5;i>=0;i--)
	  {
	  	System.out.println(charArray[i]);
	  }
	  System.out.println("Skipping one index:");
	  for(int i=0;i<charArray.length;i=i+2)
	  {
	  	System.out.println(charArray[i]);
	  }
	  System.out.println("Array elements of String array\n");
	  System.out.println("Array elements from left to right:");
	  for(int i=0;i<stringArray.length;i++)
	  {
	  	System.out.println(stringArray[i]);
	  }
	  System.out.println("Array elements from right to left:");
	  for(int i=stringArray.length-1;i>=0;i--)
	  {
	  	System.out.println(stringArray[i]);
	  }
	  System.out.println("Middle to right:");
	  for(int i=5;i<stringArray.length;i++)
	  {
	  	System.out.println(stringArray[i]);
	  }
	  System.out.println("Middle to left:");
	  for(int i=5;i>=0;i--)
	  {
	  	System.out.println(stringArray[i]);
	  }
	  System.out.println("Skipping one index:");
	  for(int i=0;i<stringArray.length;i=i+2)
	  {
	  	System.out.println(stringArray[i]);
	  }
	  System.out.println("Array elements of float array\n");
	  System.out.println("Array elements from left to right:");
	  for(int i=0;i<floatArray.length;i++)
	  {
	  	System.out.println(floatArray[i]);
	  }
	  System.out.println("Array elements from right to left:");
	  for(int i=floatArray.length-1;i>=0;i--)
	  {
	  	System.out.println(floatArray[i]);
	  }
	  System.out.print("Middle to right:");
	  for(int i=5;i<floatArray.length;i++)
	  {
	  	System.out.println(floatArray[i]);
	  }
	  System.out.println("Middle to left:");
	  for(int i=5;i>=0;i--)
	  {
	  	System.out.println(floatArray[i]);
	  }
	  System.out.println("Skipping one index:");
	  for(int i=0;i<floatArray.length;i=i+2)
	  {
	  	System.out.println(floatArray[i]);
	  }
	  System.out.println("Array elements of double array\n");
	  System.out.println("Array elements from left to right:");
	  for(int i=0;i<doubleArray.length;i++)
	  {
	  	System.out.println(doubleArray[i]);
	  }
	  System.out.println("Array elements from right to left:");
	  for(int i=doubleArray.length-1;i>=0;i--)
	  {
	  	System.out.println(floatArray[i]);
	  }
	  System.out.print("Middle to right:");
	  for(int i=5;i<floatArray.length;i++)
	  {
	  	System.out.println(floatArray[i]);
	  }
	  System.out.println("Middle to left:");
	  for(int i=5;i>=0;i--)
	  {
	  	System.out.println(floatArray[i]);
	  }
	  System.out.println("Skipping one index:");
	  for(int i=0;i<floatArray.length;i=i+2)
	  {
	  	System.out.println(floatArray[i]);
	  }

	}
}
