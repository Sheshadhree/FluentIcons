package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PreviousFrame20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PreviousFrame20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.5f, 3f)
            curveTo(15.224f, 3f, 15f, 3.224f, 15f, 3.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-13f)
            curveTo(16f, 3.224f, 15.776f, 3f, 15.5f, 3f)
            close()
            moveToRelative(-5.447f, 0.214f)
            curveTo(10.883f, 2.657f, 12f, 3.252f, 12f, 4.252f)
            verticalLineToRelative(11.5f)
            curveToRelative(0f, 1.004f, -1.124f, 1.598f, -1.954f, 1.033f)
            lineToRelative(-8.499f, -5.793f)
            curveToRelative(-0.731f, -0.498f, -0.727f, -1.577f, 0.007f, -2.07f)
            lineToRelative(8.5f, -5.708f)
            close()
            moveTo(11f, 4.252f)
            curveToRelative(0f, -0.2f, -0.223f, -0.319f, -0.39f, -0.207f)
            lineTo(2.113f, 9.752f)
            curveTo(1.965f, 9.85f, 1.964f, 10.066f, 2.11f, 10.166f)
            lineToRelative(8.5f, 5.793f)
            curveToRelative(0.165f, 0.113f, 0.39f, -0.006f, 0.39f, -0.207f)
            verticalLineToRelative(-11.5f)
            close()
        }
    }.build()
}
