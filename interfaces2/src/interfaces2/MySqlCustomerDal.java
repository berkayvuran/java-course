package interfaces2;

public class MySqlCustomerDal extends OracleCustomerDal implements ICustomerDal, IRepository {

	@Override
	public void add() {
		System.out.println("MySql eklendi");

	}

}
