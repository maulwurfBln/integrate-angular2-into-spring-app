import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { routing } from './app.routing';

import { AppComponent } from './app.component';
import { Page1ComponentComponent } from './page1-component/page1-component.component';
import { Page2ComponentComponent } from './page2-component/page2-component.component';

@NgModule({
  declarations: [
    AppComponent,
    Page1ComponentComponent,
    Page2ComponentComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    routing
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
