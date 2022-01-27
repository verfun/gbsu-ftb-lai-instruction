import { Component, OnInit } from '@angular/core';
import { ItemWithPath } from '../model/nav-item';

@Component({
  selector: 'app-nav-bar',
  templateUrl: './nav-bar.component.html'
})
export class NavBarComponent implements OnInit {

  navItems: ItemWithPath[] = [{text: 'Accueil', path: 'home'},{text: 'Gbsu Ftb Lai', path: 'gbsu-ftb-lai'}];

  constructor() { }

  ngOnInit(): void {
  }

}
