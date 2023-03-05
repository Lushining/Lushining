public class Exercise {
    //质数：除了1和本身没有其他因数--(2,n)整除次数为0
    public static void main(String[] args) {
        int count = 0;    //局部变量无默认值必须初始化；
        for(int n = 2;n <= 100;n++){    //外循环：打印2-100的整数
            for (int i = 2;i < n;i++){  //内循环：判断是否为质数
                if (n % i == 0) {
                    count++;
                }
            }
            if(count == 0){
                System.out.print(n+" ");
            }
            count = 0;  //每判断一个数即归零
        }

    }
}

