package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Gesture24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Gesture24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.75f, 17.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(4.164f, 19f, 3.75f, 19f)
            reflectiveCurveTo(3f, 18.664f, 3f, 18.25f)
            reflectiveCurveToRelative(0.336f, -0.75f, 0.75f, -0.75f)
            close()
            moveTo(6.749f, 4.005f)
            horizontalLineToRelative(10.505f)
            curveToRelative(0.414f, 0f, 0.75f, 0.335f, 0.75f, 0.75f)
            curveToRelative(0f, 0.38f, -0.283f, 0.693f, -0.649f, 0.743f)
            lineToRelative(-0.102f, 0.007f)
            horizontalLineToRelative(-6.502f)
            lineTo(20.524f, 9.3f)
            curveToRelative(0.57f, 0.222f, 0.64f, 0.981f, 0.16f, 1.313f)
            lineTo(20.59f, 10.67f)
            lineTo(6.1f, 17.928f)
            curveToRelative(-0.37f, 0.185f, -0.821f, 0.036f, -1.007f, -0.335f)
            curveToRelative(-0.17f, -0.34f, -0.058f, -0.746f, 0.247f, -0.954f)
            lineToRelative(0.088f, -0.052f)
            lineToRelative(12.976f, -6.5f)
            lineTo(6.477f, 5.454f)
            curveTo(5.737f, 5.166f, 5.902f, 4.103f, 6.644f, 4.01f)
            lineToRelative(0.105f, -0.006f)
            horizontalLineToRelative(10.505f)
            horizontalLineTo(6.748f)
            close()
            moveTo(19.75f, 4f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(20.164f, 5.5f, 19.75f, 5.5f)
            reflectiveCurveTo(19f, 5.164f, 19f, 4.75f)
            reflectiveCurveTo(19.336f, 4f, 19.75f, 4f)
            close()
        }
    }.build()
}
