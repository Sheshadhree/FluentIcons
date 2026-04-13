package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Important12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Important12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.283f, 2.98f)
            curveTo(4.133f, 1.935f, 4.944f, 1f, 6f, 1f)
            reflectiveCurveToRelative(1.867f, 0.935f, 1.717f, 1.98f)
            lineTo(7.142f, 7.01f)
            curveTo(7.06f, 7.578f, 6.574f, 8f, 6f, 8f)
            reflectiveCurveTo(4.94f, 7.578f, 4.86f, 7.01f)
            lineTo(4.283f, 2.98f)
            close()
            moveToRelative(2.444f, -0.142f)
            curveTo(6.79f, 2.396f, 6.447f, 2f, 6f, 2f)
            curveTo(5.553f, 2f, 5.21f, 2.396f, 5.273f, 2.838f)
            lineToRelative(0.576f, 4.03f)
            curveTo(5.859f, 6.945f, 5.924f, 7f, 6f, 7f)
            reflectiveCurveToRelative(0.14f, -0.056f, 0.152f, -0.131f)
            lineToRelative(0.575f, -4.03f)
            close()
            moveTo(6f, 11f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveTo(6.552f, 9f, 6f, 9f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
        }
    }.build()
}
