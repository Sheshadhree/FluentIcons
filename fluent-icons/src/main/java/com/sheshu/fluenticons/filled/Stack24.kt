package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Stack24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Stack24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 4f)
            curveTo(2.895f, 4f, 2f, 4.895f, 2f, 6f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(11f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(4f)
            close()
            moveToRelative(2.5f, 13.5f)
            curveToRelative(-0.932f, 0f, -1.715f, -0.637f, -1.937f, -1.5f)
            horizontalLineTo(15.5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineTo(6.563f)
            curveToRelative(0.863f, 0.222f, 1.5f, 1.005f, 1.5f, 1.937f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            horizontalLineToRelative(-9f)
            close()
            moveTo(9f, 20f)
            curveToRelative(-0.932f, 0f, -1.715f, -0.637f, -1.937f, -1.5f)
            horizontalLineToRelative(9.187f)
            curveToRelative(2.347f, 0f, 4.25f, -1.903f, 4.25f, -4.25f)
            verticalLineTo(9.063f)
            curveTo(21.363f, 9.285f, 22f, 10.068f, 22f, 11f)
            verticalLineToRelative(3.25f)
            curveToRelative(0f, 3.176f, -2.574f, 5.75f, -5.75f, 5.75f)
            horizontalLineTo(9f)
            close()
        }
    }.build()
}
