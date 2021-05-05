
import java.util.Date;

public class CustomerCheckServiceAdapter implements CustomerCheckService {
	/* this date compared to the user birthdate */
	Date date = new Date(01 / 02 / 2000);

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// SOAP user simulation
		int b = customer.getBirthDate().compareTo(date);

		if (customer.getFirstName().toUpperCase() == "AHMET BERKE" && customer.getLastName().toUpperCase() == "TEKERCI"
				&& customer.getNationalIdentity() == "00000000000" && b == 0) {
			return true;
		} else {
			return false;
		}

	}

}
