//
//  AppDelegate.swift
//  KeyLock
//
//  Created by Smith, Michael D. on 10/23/14.
//  Copyright (c) 2014 Smith, Michael D. All rights reserved.
//

import Cocoa
import AppKit
import Darwin
import ScreenSaver


@NSApplicationMain
class AppDelegate: NSObject, NSApplicationDelegate {
    
    @IBOutlet weak var window: NSWindow!
    
    func applicationDidFinishLaunching(aNotification: NSNotification) {
        // Insert code here to initialize your applications
        if !osVersionIsSupported() {
            alertAndQuit("Must be run on Yosemite or later.")
        }
        
    }

    func applicationWillTerminate(aNotification: NSNotification) {
        // Insert code here to tear down your application
    }

    func osVersionIsSupported() -> Bool {
        let osVersion:NSOperatingSystemVersion = NSProcessInfo.processInfo().operatingSystemVersion
        if osVersion.majorVersion <= 10 && osVersion.minorVersion < 10 {
            return false
        }
        return true
    }
    
    func alertAndQuit(msg: NSString) {
        let alert:NSAlert = NSAlert()
        alert.messageText = "Exiting."
        alert.informativeText = msg
        alert.runModal()
        exit(-1)
    }
}

