package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CommentBadge48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CommentBadge48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(34.675f, 6f)
            curveTo(34.243f, 6.91f, 34f, 7.926f, 34f, 9f)
            curveToRelative(0f, 3.866f, 3.134f, 7f, 7f, 7f)
            curveToRelative(1.074f, 0f, 2.09f, -0.243f, 3f, -0.675f)
            verticalLineTo(28.75f)
            curveToRelative(0f, 4.004f, -3.246f, 7.25f, -7.25f, 7.25f)
            horizontalLineTo(26.396f)
            lineToRelative(-10.848f, 7.658f)
            curveTo(14.058f, 44.71f, 12f, 43.644f, 12f, 41.82f)
            verticalLineTo(36f)
            horizontalLineToRelative(-0.75f)
            curveTo(7.246f, 36f, 4f, 32.754f, 4f, 28.75f)
            verticalLineToRelative(-15.5f)
            curveTo(4f, 9.246f, 7.246f, 6f, 11.25f, 6f)
            horizontalLineToRelative(23.425f)
            close()
            moveTo(41f, 4f)
            curveToRelative(2.761f, 0f, 5f, 2.239f, 5f, 5f)
            reflectiveCurveToRelative(-2.239f, 5f, -5f, 5f)
            reflectiveCurveToRelative(-5f, -2.239f, -5f, -5f)
            reflectiveCurveToRelative(2.239f, -5f, 5f, -5f)
            close()
        }
    }.build()
}
