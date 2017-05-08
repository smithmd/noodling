import {Component, Input} from '@angular/core';

@Component({
  selector: 'app-server',
  templateUrl: './server.component.html'
})
export class ServerComponent {
  serverStatus = 'offline';
  @Input() serverName: string;
  @Input() serverId: number;

  constructor() {
    this.serverStatus = Math.random() > 0.5 ? 'online' : 'offline';
  }

  getAlertClass(): string {
    return this.serverStatus === 'offline' ? 'alert-danger' : 'alert-success';
  }
}
