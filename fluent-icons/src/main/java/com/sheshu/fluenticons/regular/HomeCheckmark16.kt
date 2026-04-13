package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.HomeCheckmark16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.HomeCheckmark16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.313f, 1.273f)
            curveToRelative(0.386f, -0.364f, 0.989f, -0.364f, 1.374f, 0f)
            lineToRelative(4.844f, 4.575f)
            curveTo(13.83f, 6.131f, 14f, 6.525f, 14f, 6.938f)
            verticalLineTo(12.5f)
            curveToRelative(0f, 0.83f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-9f)
            curveTo(2.672f, 14f, 2f, 13.329f, 2f, 12.501f)
            verticalLineTo(6.937f)
            curveToRelative(0f, -0.412f, 0.17f, -0.806f, 0.47f, -1.089f)
            lineToRelative(4.843f, -4.575f)
            close()
            moveToRelative(5.53f, 5.301f)
            lineTo(8f, 2f)
            lineTo(3.156f, 6.574f)
            curveTo(3.056f, 6.67f, 3f, 6.8f, 3f, 6.937f)
            verticalLineToRelative(5.564f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(9f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(6.937f)
            curveToRelative(0f, -0.137f, -0.057f, -0.268f, -0.156f, -0.363f)
            close()
            moveToRelative(-1.99f, 0.08f)
            curveToRelative(0.196f, 0.195f, 0.196f, 0.511f, 0f, 0.706f)
            lineToRelative(-3.5f, 3.497f)
            curveToRelative(-0.195f, 0.195f, -0.511f, 0.195f, -0.707f, 0f)
            lineToRelative(-1.5f, -1.499f)
            curveToRelative(-0.195f, -0.195f, -0.195f, -0.511f, 0f, -0.706f)
            curveToRelative(0.196f, -0.195f, 0.512f, -0.195f, 0.708f, 0f)
            lineTo(7f, 9.797f)
            lineToRelative(3.146f, -3.143f)
            curveToRelative(0.196f, -0.196f, 0.512f, -0.196f, 0.708f, 0f)
            close()
        }
    }.build()
}
