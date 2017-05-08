import { Component, OnInit } from '@angular/core';
import {ServerComponent} from '../server/server.component';

@Component({
  selector: 'app-servers',
  templateUrl: './servers.component.html',
  styleUrls: ['./servers.component.css']
})
export class ServersComponent implements OnInit {
  allowNewServer = true;
  serverCreationStatus = 'No server was created';
  serverName: string;
  serverCreated: boolean = false;
  serverNames: string[] = [];

  constructor() { }

  ngOnInit() {
  }

  onCreateServer() {
    this.serverCreationStatus = this.serverName + ' was created';
    this.serverCreated = true;
    this.serverNames.push(this.serverName);
  }
}
