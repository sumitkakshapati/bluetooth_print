package com.example.bluetooth_print;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.util.Log;

import java.io.IOException;
import java.util.UUID;

public class BluetoothUtils {

    @SuppressLint("MissingPermission")
    public static Boolean isPrinter(String macAddress) {
        BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        // Get the BluetoothDevice object for the given MAC address.
        BluetoothDevice device = bluetoothAdapter.getRemoteDevice(macAddress);
        return device.getBluetoothClass().getMajorDeviceClass() == BluetoothClass.Device.Major.IMAGING;
    }
}
