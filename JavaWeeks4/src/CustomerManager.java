
public class CustomerManager implements CustomerService {

	private CustomerCheckService _customerCheckService;

	public CustomerManager(CustomerCheckService _customerCheckService) {
		this._customerCheckService = _customerCheckService;
	}

	@Override
	public void saveCustomer(Customer customer) {
		if (_customerCheckService.CheckIfRealPerson(customer)) {

			System.out.println("Kullan�c� Eklendi : " + customer.getFirstName() + " " + customer.getLastName());

		} else {
			System.out.println("Kullan�c� Ge�erli De�il Kay�t Edilemedi!!" + customer.getFirstName() + " "
					+ customer.getLastName());

		}

	}

	@Override
	public void editCustomer(Customer customer) {
		System.out.println("Kullan�c� D�zenlendi : " + customer.getFirstName() + " " + customer.getLastName());

	}

	@Override
	public void deleteCustomer(Customer customer) {
		if (_customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Kullan�c� Silindi : " + customer.getFirstName() + " " + customer.getLastName());
		} else {
			System.out.println("Kullan�c� Yok");
		}

	}

}
