//求 1+ 2 + 3 + ... + n的和
//要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。

//思想： 利用 && ||逻辑来间接使用条件语句 

public int Sum(int n) {
  int ans = n;
  boolean f = (n > 0) && ((ans += Sum(n-1)) > 0); //Attention: 由于java中， &&左右必须是boolean值，故使用了大于0
  return ans;
}
