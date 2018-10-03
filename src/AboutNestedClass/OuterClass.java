package AboutNestedClass;

public class OuterClass {
    InnerClassA innerA = new InnerClassA();

    public void outerMethodA() {

        innerA.innerClassAMethodA();

        System.out.println("outer class methodA");
    }

    public void outerMethodB() {



        System.out.println("outer class methodB");
    }

    public class InnerClassA {
        public void innerClassAMethodA() {

            System.out.println("inner classA methodA");
        }

        public void innerClassAMethodB() {


            System.out.println("inner classA methodB");
        }
// I think most of the case the second innerclass method will be private , so maybe that is the reason when I created
        //second innerclass using public method , I can't able to access , maybe the jdk 10 is defalut second inner class
        //method is private//
        public  class InnerClassB {

            public  void innerClassBMethodA() {

                System.out.println("inner classB methodA");
            }

            private void innerClassBMethodB() {

                System.out.println("inner classB methodB");
            }
        }
    }
}



