package com.axiomtelecom.assignment.service;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.axiomtelecom.assignment.repository.MobileCustomeRepo;
import com.axiomtelecom.assignment.response.HardwareResponse;
import com.axiomtelecom.assignment.response.MobileResponse;
import com.axiomtelecom.assignment.response.ReleasesResponse;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
@RunWith(MockitoJUnitRunner.class)
class MobileServiceTest {

	@Mock
	MobileCustomeRepo repo;
	@InjectMocks
	MobileService mobileService;

	MobileResponse mobileResponse = new MobileResponse();
	ReleasesResponse releasesResponse = new ReleasesResponse();
	HardwareResponse hardwareResponse = new HardwareResponse();
	List<MobileResponse> mobileResponseList = new ArrayList<MobileResponse>();

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);

		mobileResponse.setId(1L);
		mobileResponse.setBrand("Apple");
		mobileResponse.setPhone("Iphone7");
		mobileResponse.setPicture("Image.jpg");
		releasesResponse.setAnnounceDate("2018 November");
		releasesResponse.setPriceEuro(1000);
		mobileResponse.setSim("Nano");
		mobileResponse.setResolution("12 pixel");
		hardwareResponse.setAudioJacks("Yes");
		hardwareResponse.setGps("Yes");
		hardwareResponse.setBattery("Lithum");
	}

	@SuppressWarnings("deprecation")
	@Test
	public void getMobileDetailsTest() throws Exception {
		Map<String, String> map = new HashMap<String, String>();

		map.put("sim", "Single");
		map.put("brand", "apple");

		List<Object[]> results = new ArrayList<Object[]>();
		Object[] info = new Object[10];
		info[0] = 1L;
		info[1] = "Apple";
		info[2] = "iphone7";
		info[3] = "image.jpg";
		info[4] = "2018 October";
		info[5] = 1000;
		info[6] = "Nano";
		info[7] = "1.6 pixel";
		info[8] = "Yes";
		info[9] = "No";
		info[10] = "litmus";
		results.add(info);

		when(repo.search(map)).thenReturn(results);
		mobileResponseList = mobileService.getMobileDetails(map);
		Assert.assertEquals(mobileResponseList.size(), 1);

	}

}
