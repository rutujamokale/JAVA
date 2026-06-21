package com.transflower;


//Listener
interface AccountListener {
    void onUnderBalance(double balance);
    void onOverBalance(double balance);
}