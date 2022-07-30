package Threads;
@SuppressWarnings("serial")
class MyExceptionss extends Exception{
	   String str1;
	   MyExceptionss(String str2) {
		str1=str2;
	   }
	   public String toString(){ 
		return ("MyException Occurred: "+str1) ;
	   }
	}
	class ExceptionHandler {
	   public static void main(String args[]){
		try{
			System.out.println("Starting of try block");
			// I'm throwing the custom exception using throw
			throw new MyExceptionss("This is My error Message");
		}
		catch(MyExceptionss exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}
}
}