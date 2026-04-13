package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CommentBadge16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CommentBadge16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 5f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            reflectiveCurveToRelative(-0.895f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.895f, -2f, 2f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            close()
            moveTo(3.5f, 2f)
            horizontalLineToRelative(7.67f)
            curveTo(11.06f, 2.313f, 11f, 2.65f, 11f, 3f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            curveToRelative(0.35f, 0f, 0.687f, -0.06f, 1f, -0.17f)
            verticalLineTo(9.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineTo(8.688f)
            lineToRelative(-3.063f, 2.68f)
            curveTo(4.992f, 15.234f, 4f, 14.784f, 4f, 13.942f)
            verticalLineTo(12f)
            horizontalLineTo(3.5f)
            curveTo(2.12f, 12f, 1f, 10.88f, 1f, 9.5f)
            verticalLineToRelative(-5f)
            curveTo(1f, 3.12f, 2.12f, 2f, 3.5f, 2f)
            close()
        }
    }.build()
}
