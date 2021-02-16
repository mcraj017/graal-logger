# Graal Logger Shutdown #

This repo shows an issue with Graal not invoking the shutdown hook with native image.

Normal run of `foo.Main`:

```
<init> class foo.MyHandler
Feb 16, 2021 8:33:59 PM foo.Main main
INFO: Hello!
Closing class foo.MyHandler
```
This shows `foo.MyHandler#close()` being called.

With Graal:

```
<init> class foo.MyHandler
Feb 16, 2021 8:35:21 PM foo.Main main
INFO: Hello!
```
There is no close message so something not right here.
