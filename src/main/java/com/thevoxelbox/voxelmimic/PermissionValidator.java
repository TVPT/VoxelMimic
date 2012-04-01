package com.thevoxelbox.voxelmimic;

import org.bukkit.entity.Player;

public class PermissionValidator {
	
	int permissionType = 0;//0 = SuperPerms
	
	public PermissionValidator()
	{
	}
	
	public boolean checkPlayerPermissions(Player p, String s)
	{
		boolean hasPermission = false;
		switch(permissionType)
		{
			case 0://superperms
				hasPermission = p.hasPermission(s);
				break;
			case 1://unused
				break;
			default:
				hasPermission = false;
				break;
		}
		return hasPermission;
	}
}
