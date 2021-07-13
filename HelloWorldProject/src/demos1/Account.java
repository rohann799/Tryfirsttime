package demos1;

public class Account {
 private int AccId;
 public String AccName;
 public float Balance;
 //Using containment
 Address adr;
 
 
 public Account(int v1,String v2,float v3,Address v4) {
	 AccId=v1;
	 AccName=v2;
	 Balance=v3;
	 adr=v4;
 }
 
 public int getAccId() {
	return AccId;
}
public void setAccId(int accId) {
	AccId = accId;
}
public String getAccName() {
	return AccName;
}
public void setAccName(String accName) {
	AccName = accName;
}
public float getBalance() {
	return Balance;
}
public void setBalance(float balance) {
	Balance = balance;
}

}
