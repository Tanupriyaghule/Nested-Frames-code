package test_case.codes;

import java.net.MalformedURLException;

public class App {

    public void getGreeting() throws InterruptedException, MalformedURLException {
        NestedFrames frame=new NestedFrames();
        frame.testcase04();
          frame.endTest();
    }
    public static void main(String[] args) throws InterruptedException, MalformedURLException
     {
      new App().getGreeting();
  }}