import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot } from '@angular/router';

@Injectable({
    providedIn: 'root'
})
export class AuthguardService implements CanActivate {

    canActivate(route: ActivatedRouteSnapshot): boolean {
        const expectedRoleArray = route.data.roles;
        const userDetails = JSON.parse(localStorage.getItem('userDetails'));
        let expectedRole: string;
        for (const index in expectedRoleArray) {
            if (userDetails && userDetails.usertype === expectedRoleArray[index]) {
                expectedRole = expectedRoleArray[index];
            }
        }
        if (userDetails && expectedRole === userDetails.usertype) {
            console.log('user authenticated');
            return true;
        } else {
            console.log('not authenticated');
            return false;
        }
    }

}
