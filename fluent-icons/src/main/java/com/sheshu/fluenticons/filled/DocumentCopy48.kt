package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DocumentCopy48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentCopy48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(25f, 14.75f)
            verticalLineTo(5f)
            horizontalLineToRelative(-6.75f)
            curveTo(15.903f, 5f, 14f, 6.903f, 14f, 9.25f)
            verticalLineToRelative(24.5f)
            curveToRelative(0f, 2.347f, 1.903f, 4.25f, 4.25f, 4.25f)
            horizontalLineToRelative(16.5f)
            curveToRelative(2.347f, 0f, 4.25f, -1.903f, 4.25f, -4.25f)
            verticalLineTo(19f)
            horizontalLineToRelative(-9.75f)
            curveTo(26.903f, 19f, 25f, 17.097f, 25f, 14.75f)
            close()
            moveToRelative(2.5f, 0f)
            verticalLineTo(5.5f)
            lineToRelative(11f, 11f)
            horizontalLineToRelative(-9.25f)
            curveToRelative(-0.966f, 0f, -1.75f, -0.784f, -1.75f, -1.75f)
            close()
            moveTo(9f, 13.7f)
            curveToRelative(0f, -1.679f, 1.034f, -3.116f, 2.5f, -3.71f)
            verticalLineToRelative(23.76f)
            curveToRelative(0f, 3.728f, 3.022f, 6.75f, 6.75f, 6.75f)
            horizontalLineToRelative(15.76f)
            curveToRelative(-0.594f, 1.466f, -2.031f, 2.5f, -3.71f, 2.5f)
            horizontalLineTo(18.25f)
            curveTo(13.141f, 43f, 9f, 38.859f, 9f, 33.75f)
            verticalLineTo(13.7f)
            close()
        }
    }.build()
}
