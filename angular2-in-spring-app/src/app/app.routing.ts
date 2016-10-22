import { Routes, RouterModule } from '@angular/router';
import {Page1ComponentComponent } from './page1-component/page1-component.component';
import {Page2ComponentComponent } from './page2-component/page2-component.component';

export const routes: Routes = [
    {
        path: 'angular2-page1',
        component: Page1ComponentComponent
    }, {
        path: 'angular2-page2',
        component: Page2ComponentComponent
    }, {
        path: '**',
        redirectTo: 'angular2-page1'
    }
];

export const routing = RouterModule.forRoot(routes);
