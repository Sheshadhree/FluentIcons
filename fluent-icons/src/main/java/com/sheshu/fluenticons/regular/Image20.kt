package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Image20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Image20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 7.5f)
            curveTo(14f, 8.328f, 13.328f, 9f, 12.5f, 9f)
            reflectiveCurveTo(11f, 8.328f, 11f, 7.5f)
            reflectiveCurveTo(11.672f, 6f, 12.5f, 6f)
            reflectiveCurveTo(14f, 6.672f, 14f, 7.5f)
            close()
            moveToRelative(-1f, 0f)
            curveTo(13f, 7.224f, 12.776f, 7f, 12.5f, 7f)
            reflectiveCurveTo(12f, 7.224f, 12f, 7.5f)
            reflectiveCurveTo(12.224f, 8f, 12.5f, 8f)
            reflectiveCurveTo(13f, 7.776f, 13f, 7.5f)
            close()
            moveTo(3f, 6f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(8f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(6f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineTo(6f)
            close()
            moveToRelative(3f, -2f)
            curveTo(4.895f, 4f, 4f, 4.895f, 4f, 6f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 0.373f, 0.102f, 0.722f, 0.28f, 1.02f)
            lineToRelative(4.669f, -4.588f)
            curveToRelative(0.583f, -0.573f, 1.519f, -0.573f, 2.102f, 0f)
            lineToRelative(4.67f, 4.588f)
            curveTo(15.898f, 14.722f, 16f, 14.373f, 16f, 14f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(6f)
            close()
            moveToRelative(0f, 12f)
            horizontalLineToRelative(8f)
            curveToRelative(0.37f, 0f, 0.715f, -0.1f, 1.012f, -0.274f)
            lineToRelative(-4.662f, -4.58f)
            curveToRelative(-0.194f, -0.192f, -0.506f, -0.192f, -0.7f, 0f)
            lineToRelative(-4.662f, 4.58f)
            curveTo(5.285f, 15.9f, 5.631f, 16f, 6f, 16f)
            close()
        }
    }.build()
}
