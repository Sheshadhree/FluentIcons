package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ErrorCircle20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ErrorCircle20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 2f)
            curveToRelative(4.418f, 0f, 8f, 3.582f, 8f, 8f)
            reflectiveCurveToRelative(-3.582f, 8f, -8f, 8f)
            reflectiveCurveToRelative(-8f, -3.582f, -8f, -8f)
            reflectiveCurveToRelative(3.582f, -8f, 8f, -8f)
            close()
            moveToRelative(0f, 1f)
            curveToRelative(-3.866f, 0f, -7f, 3.134f, -7f, 7f)
            reflectiveCurveToRelative(3.134f, 7f, 7f, 7f)
            reflectiveCurveToRelative(7f, -3.134f, 7f, -7f)
            reflectiveCurveToRelative(-3.134f, -7f, -7f, -7f)
            close()
            moveToRelative(0f, 9.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(10.414f, 14f, 10f, 14f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            reflectiveCurveTo(9.586f, 12.5f, 10f, 12.5f)
            close()
            moveTo(10f, 6f)
            curveToRelative(0.245f, 0f, 0.45f, 0.177f, 0.492f, 0.41f)
            lineTo(10.5f, 6.5f)
            verticalLineTo(11f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            curveToRelative(-0.245f, 0f, -0.45f, -0.177f, -0.492f, -0.41f)
            lineTo(9.5f, 11f)
            verticalLineTo(6.5f)
            curveTo(9.5f, 6.224f, 9.724f, 6f, 10f, 6f)
            close()
        }
    }.build()
}
