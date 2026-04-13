package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonRunning20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonRunning20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.5f, 4.5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.895f, 2f, 2f)
            curveToRelative(0f, 0.891f, -0.583f, 1.646f, -1.388f, 1.905f)
            lineTo(15.707f, 8f)
            horizontalLineTo(17.5f)
            curveTo(18.328f, 8f, 19f, 8.672f, 19f, 9.5f)
            reflectiveCurveTo(18.328f, 11f, 17.5f, 11f)
            horizontalLineToRelative(-3.223f)
            curveToRelative(-0.63f, 0f, -1.234f, -0.25f, -1.68f, -0.696f)
            lineTo(12.5f, 10.207f)
            lineToRelative(-1.043f, 1.043f)
            lineToRelative(1.397f, 1.396f)
            curveTo(12.947f, 12.74f, 13f, 12.867f, 13f, 13f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveTo(10f, 17.328f, 10f, 16.5f)
            verticalLineToRelative(-1.793f)
            lineTo(8.453f, 13.16f)
            lineToRelative(-1.002f, 0.752f)
            curveTo(6.941f, 14.293f, 6.323f, 14.5f, 5.686f, 14.5f)
            horizontalLineTo(2.5f)
            curveTo(1.672f, 14.5f, 1f, 13.828f, 1f, 13f)
            reflectiveCurveToRelative(0.672f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(4.25f)
            curveTo(7.993f, 11.5f, 9f, 10.493f, 9f, 9.25f)
            verticalLineTo(8f)
            horizontalLineToRelative(1f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(10.276f, 7f, 10f, 7f)
            horizontalLineTo(8.5f)
            curveTo(8.224f, 7f, 8f, 7.224f, 8f, 7.5f)
            verticalLineToRelative(1.75f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            reflectiveCurveTo(5.5f, 9.94f, 5.5f, 9.25f)
            verticalLineTo(7f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(3.5f)
            close()
        }
    }.build()
}
