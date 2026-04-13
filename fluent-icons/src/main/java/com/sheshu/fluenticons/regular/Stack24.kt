package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Stack24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Stack24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 4f)
            horizontalLineToRelative(11f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(4f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            close()
            moveToRelative(11f, 1.5f)
            horizontalLineTo(4f)
            curveTo(3.724f, 5.5f, 3.5f, 5.724f, 3.5f, 6f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(11f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(6f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            close()
            moveTo(4.563f, 16f)
            curveToRelative(0.222f, 0.863f, 1.005f, 1.5f, 1.937f, 1.5f)
            horizontalLineToRelative(9f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.932f, -0.637f, -1.715f, -1.5f, -1.937f)
            verticalLineTo(13.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineTo(4.563f)
            close()
            moveToRelative(2.5f, 2.5f)
            curveTo(7.285f, 19.363f, 8.068f, 20f, 9f, 20f)
            horizontalLineToRelative(7.25f)
            curveToRelative(3.176f, 0f, 5.75f, -2.574f, 5.75f, -5.75f)
            verticalLineTo(11f)
            curveToRelative(0f, -0.932f, -0.637f, -1.715f, -1.5f, -1.937f)
            verticalLineToRelative(5.187f)
            curveToRelative(0f, 2.347f, -1.903f, 4.25f, -4.25f, 4.25f)
            horizontalLineTo(7.063f)
            close()
        }
    }.build()
}
