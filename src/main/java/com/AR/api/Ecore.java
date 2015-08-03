package com.AR.api;

import net.minecraft.tileentity.TileEntity;

public class Ecore extends TileEntity {

	// DEFUALTS
	static int EPT = 5;
	static int MaxE = 10;
	static int MinE = 0;
	static int StoredE = 0;

	// Does TileEntity Use Essence
	public boolean CanUseE() {
		return true;
	}

	// TileEntity Update
	@Override
	public void updateEntity() {

	}

	// SetMax Essence
	public void setMaxE(int a) {
		this.MaxE = a;
	}

	// GetMax Essence
	public int getMaxE() {
		return MaxE;
	}

	// SetMin Essence
	public void setMinE(int a) {
		this.MinE = a;
	}

	// GetMin Essence
	public int getMinE() {
		return MinE;
	}

	// get Essence Per Tick
	public int getEPT() {
		return EPT;
	}

	// Set Essence Per Tick
	public void setEPT(int a) {
		this.EPT = a;
	}

	// Add Essence to Essence Storge
	public void addToStoredE(int a) {
		int b;

		if (a >= MaxE - StoredE) {

		} else {
			for (int i = 0; i < StoredE / EPT + 1; i++) {
				b = StoredE - EPT;

				if (b <= EPT) {
					if (b >= 0) {
						this.StoredE = this.StoredE + b;
					}
				} else {
					this.StoredE = this.StoredE + 5;

				}

			}

		}

	}
}
