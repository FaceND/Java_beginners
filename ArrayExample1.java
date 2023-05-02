class ArrayExample1 { // 8
    public static void main (String[] args) {
          int[] salary = {30000, 25000, 15000};
          for(int i=0; i<salary.length; i++) {
               System.out.println("เงินเดือนพนักงานคนที่ "+ (i+1) +" = "+ salary[i]);
          }
     }
}