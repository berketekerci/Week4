
public class CustomerManager implements CustomerService {

	private CustomerCheckService _customerCheckService;

	public CustomerManager(CustomerCheckService _customerCheckService) {
		this._customerCheckService = _customerCheckService;
	}

	@Override
	public void saveCustomer(Customer customer) {
		if (_customerCheckService.CheckIfRealPerson(customer)) {

			System.out.println("Kullanýcý Eklendi : " + customer.getFirstName() + " " + customer.getLastName());

		} else {
			System.out.println("Kullanýcý Geçerli Deðil Kayýt Edilemedi!!" + customer.getFirstName() + " "
					+ customer.getLastName());

		}

	}

	@Override
	public void editCustomer(Customer customer) {
		System.out.println("Kullanýcý Düzenlendi : " + customer.getFirstName() + " " + customer.getLastName());

	}

	@Override
	public void deleteCustomer(Customer customer) {
		if (_customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Kullanýcý Silindi : " + customer.getFirstName() + " " + customer.getLastName());
		} else {
			System.out.println("Kullanýcý Yok");
		}

	}

}
