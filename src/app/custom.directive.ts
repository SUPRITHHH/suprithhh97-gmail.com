import { Directive, ElementRef, HostBinding, HostListener } from '@angular/core';




@Directive ({
    selector : '[custdir]'
})

export class CustomDirective {
    constructor(private e1: ElementRef) {
        this.e1.nativeElement.style.backgroundColor = 'red';
    }

    @HostBinding('style.backgroundColor') tree = 'blue';

    @HostListener('mouseenter') mouseEnterEvent() {
        this.e1.nativeElement.style.backgroundColor = 'green';
    }

    @HostListener('mouseleave') mouseLeaveEvent() {
        this.e1.nativeElement.style.backgroundColor = 'purple';
    }
}

