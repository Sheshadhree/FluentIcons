package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Important16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Important16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.201f, 8.833f)
            curveTo(8.183f, 8.93f, 8.1f, 9f, 8f, 9f)
            curveTo(7.901f, 9f, 7.817f, 8.93f, 7.799f, 8.833f)
            lineToRelative(-0.855f, -4.56f)
            curveTo(6.82f, 3.61f, 7.327f, 3f, 8f, 3f)
            reflectiveCurveToRelative(1.18f, 0.611f, 1.056f, 1.273f)
            lineToRelative(-0.855f, 4.56f)
            close()
            moveTo(8f, 2f)
            curveTo(6.7f, 2f, 5.721f, 3.18f, 5.96f, 4.457f)
            lineToRelative(0.856f, 4.56f)
            curveTo(6.923f, 9.587f, 7.42f, 10f, 8f, 10f)
            reflectiveCurveToRelative(1.077f, -0.413f, 1.184f, -0.983f)
            lineToRelative(0.855f, -4.56f)
            curveTo(10.28f, 3.18f, 9.3f, 2f, 8f, 2f)
            close()
            moveToRelative(0f, 11f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            reflectiveCurveTo(7.724f, 12f, 8f, 12f)
            reflectiveCurveToRelative(0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(8.276f, 13f, 8f, 13f)
            close()
            moveToRelative(0f, 1f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(8.828f, 11f, 8f, 11f)
            reflectiveCurveToRelative(-1.5f, 0.672f, -1.5f, 1.5f)
            reflectiveCurveTo(7.172f, 14f, 8f, 14f)
            close()
        }
    }.build()
}
