package com.group_finity.mascot.win.jna;

import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.win32.StdCallLibrary;

public interface Gdi32 extends StdCallLibrary {

	Gdi32 INSTANCE = (Gdi32) Native.loadLibrary("Gdi32", Gdi32.class);

	Pointer CreateCompatibleDC(Pointer HDC);

	Pointer SelectObject(Pointer HDC, Pointer HGDIOBJ);

	int DeleteDC(Pointer hdc);

	int DIB_RGB_COLORS = 0;

	Pointer CreateDIBSection(Pointer hdc,BITMAPINFOHEADER pbmi,int iUsage,Pointer ppvBits,Pointer hSection,int dwOffset);

	int GetObjectW(Pointer hgdiobj, int cbBuffer, BITMAP lpvObject);

	int DeleteObject(Pointer hObject);

	Pointer CreateRectRgn(
			  int nLeftRect,   // ������� x ���W
			  int nTopRect,    // ������� y ���W
			  int nRightRect,  // �E������ x ���W
			  int nBottomRect  // �E������ y ���W
			);
	int GetRgnBox( Pointer hrgn, RECT lprc );
}