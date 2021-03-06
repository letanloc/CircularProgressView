# CircularProgressView

A circular progressview for android

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-CircularProgressView-brightgreen.svg?style=flat)](http://android-arsenal.com/details/1/1815)

## About

This is a simple small class that renders a progress in form of an filling arc shape.
A progress text can be rendered additionally. This text is rendered in the secondary color for the 'done' area of the arc.

I used it for rendering the progress that is done in the background of all views. This view has no dependencies and min SDK version 3 can be used.

It also supports a custom font (that is places in the 'assets' directory) and fading of the progress view (even though I recommend setting the 'fadeTime' value to -1 and use a Fragment with a FragmentTransation to fade this view in and out).

All values are optional. If you want to reuse the view from the code, simply set the class members in the CircularProgressView class accordingly.


![alt text](https://github.com/momentumlab/CircularProgressView/blob/master/demo.gif "Example")

## XML Attributes

Following XML attributes are allowed

```xml
<momentum.circularprogressview.CircularProgressView
	progressColor=		"#FFFFFF"
	progressText=		"TEST PROGRESS"
	progressTextColor=	"#ff5aa74a"
	progressTextFont=	"consolab.ttf"
	progressTextSize=	"36"
	borderOffset=		"150"
	fadeTime=			"500" />
```

progressColor:
> The main color of the progress ARC.
> The text will be rendered in this color where
> the arc is not yet painted

progressText:
> The Text to be rendered

progressColor:
> The secondary color. Used for the text on top
> of the alredy rendered progress

progressTextFont:
> An optional ttf or otf font
> This font hast to be in the "assets" directory

progressTextSize:
> The font size

borderOffset:
> Optional border offset, next iteration will kick this,
> its just a fix to fill the corners (*will be deprecated in next version*)

fadeTime:
> The fade in and fade out time, can be set to -1 to ignore fading

## Example Application
* An example application is included in the github repository. It can also be downloaded from the playstore soon.

## Precompiled AAR
You can download the latest precompiled version here https://github.com/momentumlab/CircularProgressView/blob/master/aar/circularprogressview-v1.0.2.aar

## Additional information
* Set the progress to 0 (at the beginning) and 1 (at the end).
* 'wrapcontent' for dimensions is not yet supported
* Aliasing problem will be fixed soon

## License
Check file LICENSE and Make sure to follow the licensing terms and conditions of the project and the software used to build the project.

## Feedback
If you have any questions or feedback, feel free to get back to me!

