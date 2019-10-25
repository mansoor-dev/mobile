package com.axiomtelecom.assignment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axiomtelecom.assignment.repository.MobileCustomeRepo;
import com.axiomtelecom.assignment.response.HardwareResponse;
import com.axiomtelecom.assignment.response.MobileResponse;
import com.axiomtelecom.assignment.response.ReleasesResponse;

@Service
public class MobileService implements MobileServiceInterf {

	@Autowired
	MobileCustomeRepo repo;

	@Override
	public List<MobileResponse> getMobileDetails(Map<String, String> requestMap) throws Exception {
		List<MobileResponse> mobileResponseList = new ArrayList<MobileResponse>();

		List<Object[]> resultList = repo.search(requestMap);

		for (int i = 0; i < resultList.size(); i++) {

			Object[] arr = resultList.get(i);
			MobileResponse mobileResponse = new MobileResponse();
			ReleasesResponse releasesResponse = new ReleasesResponse();
			HardwareResponse hardwareResponse = new HardwareResponse();
			mobileResponse.setId((Long) arr[0]);
			mobileResponse.setBrand((String) arr[1]);
			mobileResponse.setPhone((String) arr[2]);
			mobileResponse.setPicture((String) arr[3]);
			releasesResponse.setAnnounceDate((String) arr[4]);
			releasesResponse.setPriceEuro((Long) arr[5]);
			mobileResponse.setSim((String) arr[6]);
			mobileResponse.setResolution((String) arr[7]);
			hardwareResponse.setAudioJacks((String) arr[8]);
			hardwareResponse.setGps((String) arr[9]);
			hardwareResponse.setBattery((String) arr[10]);
			mobileResponse.setReleasesResp(releasesResponse);
			mobileResponse.setHardwareResp(hardwareResponse);
			mobileResponseList.add(mobileResponse);
		}

		return mobileResponseList;
	}

}
