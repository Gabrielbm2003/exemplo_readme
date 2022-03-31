import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { NavComponent } from './nav/nav.component';
import { HomeComponent } from './home/home.component';
import { AdminComponent } from './admin/admin.component';
import { SobreComponent } from './sobre/sobre.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { MatSliderModule } from '@angular/material/slider';
import { MatButtonModule } from '@angular/material/button';
import { MatDividerModule } from '@angular/material/divider';
import { MatIconModule } from '@angular/material/icon';
import { MatTableModule } from '@angular/material/table';


import { HttpClientModule } from '@angular/common/http';

@NgModule({
  imports: [
    MatSliderModule,
    HttpClientModule,
    MatButtonModule,
    MatDividerModule,
    MatTableModule,
    MatIconModule,
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule
  ],
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    NavComponent,
    HomeComponent,
    AdminComponent,
    SobreComponent
  ],
  
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
