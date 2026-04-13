package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ArrowStepInLeft28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowStepInLeft28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.293f, 19.768f)
            curveToRelative(0.285f, -0.3f, 0.274f, -0.774f, -0.025f, -1.06f)
            lineToRelative(-4.146f, -3.958f)
            horizontalLineTo(25.25f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveToRelative(-0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(14.122f)
            lineToRelative(4.146f, -3.957f)
            curveToRelative(0.3f, -0.286f, 0.31f, -0.761f, 0.024f, -1.06f)
            curveToRelative(-0.286f, -0.3f, -0.76f, -0.312f, -1.06f, -0.026f)
            lineToRelative(-5.5f, 5.25f)
            curveTo(11.584f, 13.6f, 11.5f, 13.795f, 11.5f, 14f)
            curveToRelative(0f, 0.205f, 0.084f, 0.401f, 0.232f, 0.543f)
            lineToRelative(5.5f, 5.25f)
            curveToRelative(0.3f, 0.285f, 0.774f, 0.274f, 1.06f, -0.025f)
            close()
            moveTo(6f, 10f)
            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            close()
            moveToRelative(0f, 1.5f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveTo(7.38f, 16.5f, 6f, 16.5f)
            reflectiveCurveTo(3.5f, 15.38f, 3.5f, 14f)
            reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
            close()
        }
    }.build()
}
