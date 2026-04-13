package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Warning28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Warning28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 20f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            close()
            moveToRelative(-1.75f, -3.25f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-6.5f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            reflectiveCurveToRelative(-0.75f, 0.336f, -0.75f, 0.75f)
            verticalLineToRelative(6.5f)
            close()
            moveTo(11.592f, 4.17f)
            curveToRelative(1.046f, -1.894f, 3.77f, -1.895f, 4.816f, 0f)
            lineToRelative(9.25f, 16.75f)
            curveTo(26.67f, 22.753f, 25.344f, 25f, 23.251f, 25f)
            horizontalLineTo(4.757f)
            curveToRelative(-2.093f, 0f, -3.42f, -2.246f, -2.408f, -4.079f)
            lineToRelative(9.243f, -16.75f)
            close()
            moveToRelative(3.502f, 0.725f)
            curveToRelative(-0.475f, -0.861f, -1.713f, -0.861f, -2.188f, 0f)
            lineTo(3.662f, 21.646f)
            curveTo(3.202f, 22.479f, 3.805f, 23.5f, 4.757f, 23.5f)
            horizontalLineTo(23.25f)
            curveToRelative(0.951f, 0f, 1.554f, -1.021f, 1.094f, -1.854f)
            lineToRelative(-9.25f, -16.751f)
            close()
        }
    }.build()
}
