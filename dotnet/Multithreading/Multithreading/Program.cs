using System;
using System.Threading;

class Program{
	static void workerMethod(){
		for(int i = 0; i<5 ; i++){
			Console.WriteLine($"Worker Thread is running at step: {i+1}");
			Thread.Sleep(500);
		}
		Console.WriteLine("Worker Thread has finished executing");
	}
	
	static void Main(){
		Thread t1 = new Thread(workerMethod);
		t1.Start(); 
		for(int i = 0; i<5; i++){
			Console.WriteLine($"Main thread executing at step:{i+1}");
			Thread.Sleep(500);
		}
		Console.WriteLine("Main Thread has finished executing");
		t1.Join();
	}
}