package com.cg.placement.service;

import com.cg.placement.entities.Placement;

public interface IPlacementService {
	public Placement addPlacement(Placement placement);
	public Placement updatePlacement(Placement placement);
	public Placement searchPlacement(int placement_id);
	public Placement cancelPlacement(int placement_id);
}
