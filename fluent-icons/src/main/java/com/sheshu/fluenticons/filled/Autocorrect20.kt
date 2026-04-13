package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Autocorrect20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Autocorrect20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.167f, 14.752f)
            lineTo(8.034f, 4.16f)
            curveToRelative(0.856f, -1.547f, 3.08f, -1.547f, 3.936f, 0f)
            lineTo(14.097f, 8f)
            horizontalLineToRelative(3.153f)
            curveTo(17.664f, 8f, 18f, 8.336f, 18f, 8.75f)
            reflectiveCurveTo(17.664f, 9.5f, 17.25f, 9.5f)
            horizontalLineToRelative(-2.26f)
            curveToRelative(0.63f, 0.741f, 1.01f, 1.701f, 1.01f, 2.75f)
            curveToRelative(0f, 2.347f, -1.903f, 4.25f, -4.25f, 4.25f)
            reflectiveCurveTo(7.5f, 14.597f, 7.5f, 12.25f)
            reflectiveCurveTo(9.403f, 8f, 11.75f, 8f)
            curveToRelative(0.119f, 0f, 0.236f, 0.005f, 0.353f, 0.015f)
            curveTo(12.15f, 8.005f, 12.2f, 8f, 12.25f, 8f)
            horizontalLineToRelative(0.03f)
            lineToRelative(-1.843f, -3.247f)
            curveToRelative(-0.192f, -0.337f, -0.678f, -0.337f, -0.87f, 0f)
            lineTo(3.476f, 15.486f)
            lineToRelative(-0.07f, 0.126f)
            curveToRelative(-0.2f, 0.362f, -0.657f, 0.493f, -1.02f, 0.293f)
            curveToRelative(-0.252f, -0.14f, -0.393f, -0.406f, -0.386f, -0.676f)
            curveToRelative(0.003f, -0.12f, 0.034f, -0.242f, 0.098f, -0.354f)
            lineToRelative(0.07f, -0.123f)
            close()
            moveTo(9f, 12.25f)
            curveTo(9f, 13.77f, 10.231f, 15f, 11.75f, 15f)
            reflectiveCurveToRelative(2.75f, -1.231f, 2.75f, -2.75f)
            reflectiveCurveToRelative(-1.231f, -2.75f, -2.75f, -2.75f)
            reflectiveCurveTo(9f, 10.731f, 9f, 12.25f)
            close()
        }
    }.build()
}
