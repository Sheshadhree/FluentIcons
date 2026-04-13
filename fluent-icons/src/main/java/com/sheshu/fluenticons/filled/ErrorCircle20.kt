package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ErrorCircle20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ErrorCircle20",
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
            moveToRelative(0f, 10.5f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveTo(9.586f, 14f, 10f, 14f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(10.414f, 12.5f, 10f, 12.5f)
            close()
            moveTo(10f, 6f)
            curveTo(9.755f, 6f, 9.55f, 6.177f, 9.508f, 6.41f)
            lineTo(9.5f, 6.5f)
            verticalLineTo(11f)
            lineToRelative(0.008f, 0.09f)
            curveTo(9.55f, 11.323f, 9.755f, 11.5f, 10f, 11.5f)
            reflectiveCurveToRelative(0.45f, -0.177f, 0.492f, -0.41f)
            lineTo(10.5f, 11f)
            verticalLineTo(6.5f)
            lineToRelative(-0.008f, -0.09f)
            curveTo(10.45f, 6.177f, 10.245f, 6f, 10f, 6f)
            close()
        }
    }.build()
}
