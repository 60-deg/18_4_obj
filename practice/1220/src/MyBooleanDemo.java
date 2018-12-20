class MyBooleanDemo {
      public static void main(String[] args) {
          MyBoolean x = new MyBoolean(true);
          System.out.println(x.getValue());
          x.setValue(false);
          System.out.println(x.getValue());
          x.setValue(1);
          System.out.println(x.getValue());          
          MyBoolean y = new MyBoolean(0);
          System.out.println(y.getValue());
      }
}