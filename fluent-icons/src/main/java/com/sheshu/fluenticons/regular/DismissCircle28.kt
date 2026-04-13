package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DismissCircle28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DismissCircle28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.28f, 9.72f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            lineTo(15.06f, 14f)
            lineToRelative(3.22f, 3.22f)
            curveToRelative(0.293f, 0.293f, 0.293f, 0.767f, 0f, 1.06f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            lineTo(14f, 15.06f)
            lineToRelative(-3.22f, 3.22f)
            curveToRelative(-0.293f, 0.293f, -0.767f, 0.293f, -1.06f, 0f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            lineTo(12.94f, 14f)
            lineToRelative(-3.22f, -3.22f)
            curveToRelative(-0.293f, -0.293f, -0.293f, -0.767f, 0f, -1.06f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            lineTo(14f, 12.94f)
            lineToRelative(3.22f, -3.22f)
            curveToRelative(0.293f, -0.293f, 0.767f, -0.293f, 1.06f, 0f)
            close()
            moveTo(26f, 14f)
            curveToRelative(0f, -6.627f, -5.373f, -12f, -12f, -12f)
            reflectiveCurveTo(2f, 7.373f, 2f, 14f)
            reflectiveCurveToRelative(5.373f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.373f, 12f, -12f)
            close()
            moveTo(3.5f, 14f)
            curveTo(3.5f, 8.201f, 8.201f, 3.5f, 14f, 3.5f)
            reflectiveCurveTo(24.5f, 8.201f, 24.5f, 14f)
            reflectiveCurveTo(19.799f, 24.5f, 14f, 24.5f)
            reflectiveCurveTo(3.5f, 19.799f, 3.5f, 14f)
            close()
        }
    }.build()
}
