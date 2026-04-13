package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonLightning16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonLightning16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.117f, 11.923f)
            curveToRelative(-0.347f, 0.833f, 0.114f, 1.737f, 0.908f, 2f)
            curveTo(7.7f, 13.974f, 7.359f, 14f, 7f, 14f)
            curveToRelative(-3.14f, 0f, -5f, -2.029f, -5f, -4f)
            verticalLineTo(9.5f)
            curveTo(2f, 8.672f, 2.672f, 8f, 3.5f, 8f)
            horizontalLineToRelative(5.252f)
            lineToRelative(-1.635f, 3.923f)
            close()
            moveTo(7f, 1.5f)
            curveToRelative(1.519f, 0f, 2.75f, 1.231f, 2.75f, 2.75f)
            reflectiveCurveTo(8.519f, 7f, 7f, 7f)
            reflectiveCurveTo(4.25f, 5.769f, 4.25f, 4.25f)
            reflectiveCurveTo(5.481f, 1.5f, 7f, 1.5f)
            close()
            moveTo(8.502f, 13f)
            horizontalLineToRelative(1.75f)
            lineToRelative(-0.59f, 2.36f)
            curveToRelative(-0.12f, 0.482f, 0.463f, 0.826f, 0.827f, 0.486f)
            lineToRelative(4.872f, -4.548f)
            curveTo(15.86f, 10.834f, 15.531f, 10f, 14.85f, 10f)
            horizontalLineToRelative(-1.098f)
            lineToRelative(0.781f, -2.342f)
            curveTo(14.641f, 7.334f, 14.4f, 7f, 14.06f, 7f)
            horizontalLineToRelative(-3.473f)
            curveToRelative(-0.202f, 0f, -0.384f, 0.121f, -0.462f, 0.308f)
            lineToRelative(-2.083f, 5f)
            curveTo(7.904f, 12.637f, 8.146f, 13f, 8.502f, 13f)
            close()
        }
    }.build()
}
