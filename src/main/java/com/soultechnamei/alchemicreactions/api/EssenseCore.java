package com.soultechnamei.alchemicreactions.api;

import net.minecraft.tileentity.TileEntity;

public class EssenseCore extends TileEntity {

	boolean AE = false;
	int StoredE = 0;
	int MaxE = 10;
	int Tier = 1;
	int CTV = 0;

	public EssenseCore(TileEntity parent, int MAX, int TIER) {
		this.MaxE = MAX;
		this.Tier = TIER;
	}

	public int TakeEssense(int A) {
		if (A >= StoredE) {
			StoredE = A - StoredE;
			CTV = StoredE;
		} else {
		  StoredE = StoredE - A;
		  CTV = 0;
		}

			return CTV;
	}
	public boolean getAcceptEssense() {
		return AE;
	}
	
	public void acceptEssense() {
		AE = true;
	}

	// Gets
	public int GetEssenseStored() {
		return StoredE;
	}
    
	//Exceptions
    public void NoEssenseExceptions() {
       
    }
    public void TooMuchEssenseExceptions() {
    	
    }
}

