//
//  Tile.swift
//  GameOfLife
//
//  Created by Smith, Michael D. on 10/23/14.
//  Copyright (c) 2014 Smith, Michael D. All rights reserved.
//

import Cocoa
import SpriteKit

class Tile: SKSpriteNode {
    var isAlive:Bool = false {
        didSet {
            self.hidden = !isAlive
        }
    }
    
    var numLivingNeighbors = 0
    
}
