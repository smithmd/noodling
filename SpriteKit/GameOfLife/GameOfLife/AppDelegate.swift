//
//  AppDelegate.swift
//  GameOfLife
//
//  Created by Smith, Michael D. on 10/22/14.
//  Copyright (c) 2014 Smith, Michael D. All rights reserved.
//


import Cocoa
import SpriteKit

extension SKNode {
    class func unarchiveFromFile(file : NSString) -> SKNode? {
        if let path = NSBundle.mainBundle().pathForResource(file, ofType: "sks") {
            var sceneData = NSData(contentsOfFile: path, options: .DataReadingMappedIfSafe, error: nil)!
            var archiver = NSKeyedUnarchiver(forReadingWithData: sceneData)
            
            archiver.setClass(self.classForKeyedUnarchiver(), forClassName: "SKScene")
            let scene = archiver.decodeObjectForKey(NSKeyedArchiveRootObjectKey) as GameScene
            archiver.finishDecoding()
            return scene
        } else {
            return nil
        }
    }
}

@NSApplicationMain
class AppDelegate: NSObject, NSApplicationDelegate {
    
    @IBOutlet weak var window: NSWindow!
    @IBOutlet weak var skView: SKView!
    let _winHeight:CGFloat = 320
    let _winWidth:CGFloat = 568
    
    func applicationDidFinishLaunching(aNotification: NSNotification) {
        
        
        if let scene = GameScene.unarchiveFromFile("GameScene") as? GameScene {
            self.skView!.presentScene(scene)
            
            /* Sprite Kit applies additional optimizations to improve rendering performance */
            self.skView!.ignoresSiblingOrder = true
            
            self.skView!.showsFPS = true
            self.skView!.showsNodeCount = true
        }
        
        var frame:NSRect = window.frame
        frame.size.height = _winHeight + getTitleBarHeight()
        frame.size.width = _winWidth
        
        self.window.setFrame(frame, display: true)
    }
    
    func getTitleBarHeight()->CGFloat {
        var frame:NSRect = NSMakeRect(0,0,100,100)
        
        var contentRect:NSRect = NSWindow.contentRectForFrameRect(frame, styleMask: NSTitledWindowMask)
        
        return (frame.size.height - contentRect.size.height)
        
    }
    
    func applicationShouldTerminateAfterLastWindowClosed(sender: NSApplication) -> Bool {
        return true
    }
}
