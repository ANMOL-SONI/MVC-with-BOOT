package org.ibm.model;

import java.util.List;

import lombok.Data;


@Data
public class FlashDrive {


	private Integer fDriveId;
	private String fDriveCode;
	private Double fDriveCost;
	private String fDriveModel;
	private String fDriveDesc;
	private String fDriveFormat;
	//checkbox
	private List<String> fDriveGrd;
	//multi-select dropdown
	private List<String> fDriveBrnd;
	}

