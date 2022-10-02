# Android physical buttons interceptor

Just a *Proof of Concept* on the mechanism to intercept buttons clicks.

Based on the boolean response from `onKeyEvent`, the buttons will do the default of nothing at all.

You can trigger apps or do whatever you want after capturing the event you are interested in (like Volume Up, Power On, etc).

If you are only interested in the functionality and not the code, there's a few mappers already in the Play Store that will let you trigger custom actions. See:

https://play.google.com/store/apps/details?id=com.jamworks.sidekeybuttonremap
https://play.google.com/store/apps/details?id=flar2.homebutton
https://play.google.com/store/apps/details?id=io.github.sds100.keymapper
