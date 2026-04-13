package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AlertBadge16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AlertBadge16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 2f)
            curveTo(5.515f, 2f, 3.5f, 4.015f, 3.5f, 6.5f)
            verticalLineToRelative(2.401f)
            lineToRelative(-0.964f, 2.414f)
            curveToRelative(-0.062f, 0.154f, -0.043f, 0.328f, 0.05f, 0.465f)
            curveTo(2.679f, 11.918f, 2.834f, 12f, 3f, 12f)
            horizontalLineToRelative(10f)
            curveToRelative(0.166f, 0f, 0.321f, -0.082f, 0.414f, -0.22f)
            curveToRelative(0.093f, -0.137f, 0.112f, -0.311f, 0.05f, -0.465f)
            lineTo(12.5f, 8.9f)
            verticalLineTo(7f)
            curveTo(11.12f, 7f, 10f, 5.88f, 10f, 4.5f)
            curveToRelative(0f, -0.635f, 0.236f, -1.214f, 0.626f, -1.655f)
            curveTo(9.887f, 2.313f, 8.98f, 2f, 8f, 2f)
            close()
            moveToRelative(0f, 12.5f)
            curveToRelative(-0.932f, 0f, -1.715f, -0.637f, -1.937f, -1.5f)
            horizontalLineToRelative(3.874f)
            curveTo(9.715f, 13.863f, 8.932f, 14.5f, 8f, 14.5f)
            close()
            moveTo(12.5f, 6f)
            curveTo(13.328f, 6f, 14f, 5.328f, 14f, 4.5f)
            reflectiveCurveTo(13.328f, 3f, 12.5f, 3f)
            reflectiveCurveTo(11f, 3.672f, 11f, 4.5f)
            reflectiveCurveTo(11.672f, 6f, 12.5f, 6f)
            close()
        }
    }.build()
}
