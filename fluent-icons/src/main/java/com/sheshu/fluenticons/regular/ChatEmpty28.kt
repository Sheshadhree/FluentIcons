package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ChatEmpty28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ChatEmpty28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 3.5f)
            curveTo(8.201f, 3.5f, 3.5f, 8.201f, 3.5f, 14f)
            curveToRelative(0f, 1.884f, 0.496f, 3.65f, 1.363f, 5.178f)
            curveToRelative(0.1f, 0.175f, 0.124f, 0.382f, 0.07f, 0.575f)
            lineToRelative(-1.318f, 4.634f)
            lineToRelative(4.634f, -1.318f)
            curveToRelative(0.194f, -0.055f, 0.401f, -0.03f, 0.576f, 0.07f)
            curveTo(10.352f, 24.004f, 12.117f, 24.5f, 14f, 24.5f)
            curveToRelative(5.799f, 0f, 10.5f, -4.701f, 10.5f, -10.5f)
            reflectiveCurveTo(19.799f, 3.5f, 14f, 3.5f)
            close()
            moveTo(2f, 14f)
            curveTo(2f, 7.373f, 7.373f, 2f, 14f, 2f)
            reflectiveCurveToRelative(12f, 5.373f, 12f, 12f)
            reflectiveCurveToRelative(-5.373f, 12f, -12f, 12f)
            curveToRelative(-2.036f, 0f, -3.955f, -0.508f, -5.637f, -1.404f)
            lineToRelative(-4.77f, 1.357f)
            curveTo(2.651f, 26.22f, 1.781f, 25.35f, 2.05f, 24.409f)
            lineToRelative(1.356f, -4.77f)
            curveTo(2.508f, 17.959f, 2f, 16.038f, 2f, 14f)
            close()
        }
    }.build()
}
