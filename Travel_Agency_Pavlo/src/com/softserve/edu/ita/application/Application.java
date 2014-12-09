package com.softserve.edu.ita.application;

import com.softserve.edu.ita.dao.HibernateUtil;
import com.softserve.edu.ita.entity.*;
import com.softserve.edu.ita.service.*;

public class Application {

	public static void main(String[] args) {
		Booking booking1 = new Booking();
		City city1 = new City();
		Client client1 = new Client();
		Country country1 = new Country();
		Hotel hotel1 = new Hotel();
		Visa visa1 = new Visa();

		country1.setCountry("Guatemala");
		city1.setCity("Guantanamo");
		city1.setCountryID(country1);
		hotel1.setName("Gavana");
		hotel1.setCityID(city1);
		client1.setName("Test");
		client1.setSurname("Test");
		client1.setAge(100);
		visa1.setClientID(client1);
		visa1.setCountryID(country1);
		visa1.setDate_from(new java.sql.Date((long) (new java.util.Date())
				.getTime() + 60 * 60 * 24 * 1000 * 4));
		visa1.setDate_to(new java.sql.Date((long) (new java.util.Date())
				.getTime() + 60 * 60 * 24 * 1000 * 4));
		booking1.setHotelID(hotel1);
		booking1.setClientID(client1);
		booking1.setDate_from(new java.sql.Date((long) (new java.util.Date())
				.getTime() + 60 * 60 * 24 * 1000 * 4));
		booking1.setDate_to(new java.sql.Date((long) (new java.util.Date())
				.getTime() + 60 * 60 * 24 * 1000 * 4));

		CountryService cos = new CountryService();
		CityService cis = new CityService();
		HotelService hs = new HotelService();
		ClientService cls = new ClientService();
		VisaService vs = new VisaService();
		BookingService bs = new BookingService();

		cos.addCountry(country1);
		cis.addCity(city1);
		hs.addHotel(hotel1);
		cls.addClient(client1);
		vs.addVisa(visa1);
		bs.addBooking(booking1);
		HibernateUtil.closeFactory();
	}
}
