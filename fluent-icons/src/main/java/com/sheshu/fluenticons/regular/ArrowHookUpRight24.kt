package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowHookUpRight24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowHookUpRight24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.5f, 18.5f)
            horizontalLineToRelative(5.75f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(16.664f, 20f, 16.25f, 20f)
            horizontalLineTo(10.5f)
            curveTo(6.91f, 20f, 4f, 17.09f, 4f, 13.5f)
            reflectiveCurveTo(6.91f, 7f, 10.5f, 7f)
            horizontalLineToRelative(5.95f)
            lineToRelative(-2.616f, -2.617f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.768f, 0f, -1.06f)
            curveToRelative(0.292f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            lineToRelative(3.882f, 3.882f)
            curveToRelative(0.1f, 0.1f, 0.166f, 0.22f, 0.198f, 0.348f)
            curveTo(18.99f, 7.616f, 19f, 7.682f, 19f, 7.75f)
            curveToRelative(0f, 0.213f, -0.089f, 0.405f, -0.231f, 0.542f)
            lineToRelative(-3.88f, 3.88f)
            curveToRelative(-0.293f, 0.293f, -0.768f, 0.293f, -1.06f, 0f)
            curveToRelative(-0.294f, -0.293f, -0.294f, -0.768f, 0f, -1.061f)
            lineToRelative(2.61f, -2.611f)
            horizontalLineTo(10.5f)
            curveToRelative(-2.761f, 0f, -5f, 2.239f, -5f, 5f)
            reflectiveCurveToRelative(2.239f, 5f, 5f, 5f)
            close()
        }
    }.build()
}
