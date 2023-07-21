import { Component ,OnInit} from '@angular/core';
import { Subscription } from '../subscription';

@Component({
  selector: 'app-subscription-list',
  templateUrl: './subscription-list.component.html',
  styleUrls: ['./subscription-list.component.css']
})
export class SubscriptionListComponent implements OnInit {

  subscription?: Subscription[];

  constructor() { }

  ngOnInit(): void {
    this.subscription = [{
      "id":1,
      "subMonth": 2,
      "subYear": 2023,
      "subType": "onemonth",
      "amount":2000
    },
    {
      "id":2,
      "subMonth": 3,
      "subYear": 2023,
      "subType": "onemonth",
      "amount":2000
    
    }];

  }

}
