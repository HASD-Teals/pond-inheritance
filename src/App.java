public class App {
    public static void main(String[] args) throws Exception {
        // Pond --> Lake --> Bay --> Ocean

        Lake   var1 = new Ocean();
        Pond   var2 = new Pond();
        Pond   var3 = new Lake();
        Object var4 = new Bay();
        Lake   var5 = new Bay();
        Bay    var6 = new Ocean();

        // var1.method2();
        // var2.method2();
        // var3.method2();
        // var4.method2();
        // var5.method2();
        // var6.method2();
        //var1.method3();
        // var2.method3();
        // var3.method3();
        // var4.method3();
        // var5.method3();
        // var6.method3();
        // ((Ocean) var5).method1();
        // ((Lake) var3).method3();
        // ((Lake) var4).method1();
        // ((Ocean) var1).method1();
        // ((Bay) var4).method1();
        // ((Lake) var2).method3();
        // ((Ocean) var5).method1();
        // ((Pond) var4).method2();
    }
}
