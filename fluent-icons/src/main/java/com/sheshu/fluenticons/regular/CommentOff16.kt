package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CommentOff16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CommentOff16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.293f, 12f)
            lineToRelative(2.853f, 2.854f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-13f, -13f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(0.739f, 0.738f)
            curveTo(1.343f, 3.05f, 1f, 3.735f, 1f, 4.5f)
            verticalLineToRelative(5f)
            curveTo(1f, 10.88f, 2.12f, 12f, 3.5f, 12f)
            horizontalLineTo(4f)
            verticalLineToRelative(1.942f)
            curveToRelative(0f, 0.842f, 0.992f, 1.292f, 1.625f, 0.738f)
            lineTo(8.688f, 12f)
            horizontalLineToRelative(2.605f)
            close()
            moveToRelative(-1f, -1f)
            horizontalLineToRelative(-1.98f)
            lineTo(5f, 13.898f)
            verticalLineTo(11f)
            horizontalLineTo(3.5f)
            curveTo(2.672f, 11f, 2f, 10.328f, 2f, 9.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.489f, 0.234f, -0.923f, 0.596f, -1.197f)
            lineTo(10.293f, 11f)
            close()
            moveTo(14f, 9.5f)
            curveToRelative(0f, 0.643f, -0.405f, 1.192f, -0.974f, 1.405f)
            lineToRelative(0.747f, 0.747f)
            curveTo(14.508f, 11.216f, 15f, 10.416f, 15f, 9.5f)
            verticalLineToRelative(-5f)
            curveTo(15f, 3.12f, 13.88f, 2f, 12.5f, 2f)
            horizontalLineTo(4.121f)
            lineToRelative(1f, 1f)
            horizontalLineTo(12.5f)
            curveTo(13.328f, 3f, 14f, 3.672f, 14f, 4.5f)
            verticalLineToRelative(5f)
            close()
        }
    }.build()
}
