package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Stack48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Stack48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 12.25f)
            curveTo(4f, 9.903f, 5.903f, 8f, 8.25f, 8f)
            horizontalLineToRelative(21.5f)
            curveTo(32.097f, 8f, 34f, 9.903f, 34f, 12.25f)
            verticalLineToRelative(13.5f)
            curveToRelative(0f, 2.347f, -1.903f, 4.25f, -4.25f, 4.25f)
            horizontalLineTo(8.25f)
            curveTo(5.903f, 30f, 4f, 28.097f, 4f, 25.75f)
            verticalLineToRelative(-13.5f)
            close()
            moveTo(9.375f, 32.5f)
            curveToRelative(0.667f, 1.474f, 2.15f, 2.5f, 3.874f, 2.5f)
            horizontalLineToRelative(16.5f)
            curveTo(34.858f, 35f, 39f, 30.86f, 39f, 25.75f)
            verticalLineToRelative(-8.5f)
            curveToRelative(0f, -1.723f, -1.026f, -3.207f, -2.5f, -3.874f)
            verticalLineTo(25.75f)
            curveToRelative(0f, 3.728f, -3.022f, 6.75f, -6.75f, 6.75f)
            horizontalLineTo(9.375f)
            close()
            moveToRelative(5f, 5f)
            curveToRelative(0.667f, 1.474f, 2.15f, 2.5f, 3.874f, 2.5f)
            horizontalLineToRelative(11.5f)
            curveTo(37.62f, 40f, 44f, 33.62f, 44f, 25.75f)
            verticalLineToRelative(-3.5f)
            curveToRelative(0f, -1.723f, -1.026f, -3.207f, -2.5f, -3.874f)
            verticalLineToRelative(7.374f)
            curveToRelative(0f, 6.49f, -5.26f, 11.75f, -11.75f, 11.75f)
            horizontalLineTo(14.375f)
            close()
        }
    }.build()
}
