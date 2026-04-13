package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Flag16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Flag16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 9f)
            verticalLineTo(3f)
            horizontalLineToRelative(8.028f)
            lineToRelative(-1.935f, 2.71f)
            curveToRelative(-0.124f, 0.173f, -0.124f, 0.407f, 0f, 0.58f)
            lineTo(12.028f, 9f)
            horizontalLineTo(4f)
            close()
            moveToRelative(0f, 1f)
            horizontalLineToRelative(9f)
            curveToRelative(0.407f, 0f, 0.643f, -0.46f, 0.407f, -0.79f)
            lineTo(11.114f, 6f)
            lineToRelative(2.293f, -3.21f)
            curveTo(13.643f, 2.46f, 13.407f, 2f, 13f, 2f)
            horizontalLineTo(3.5f)
            curveTo(3.224f, 2f, 3f, 2.224f, 3f, 2.5f)
            verticalLineToRelative(11f)
            curveTo(3f, 13.776f, 3.224f, 14f, 3.5f, 14f)
            reflectiveCurveTo(4f, 13.776f, 4f, 13.5f)
            verticalLineTo(10f)
            close()
        }
    }.build()
}
