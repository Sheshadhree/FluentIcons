package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.SlideTransition20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.SlideTransition20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 6.75f)
            curveTo(2f, 5.231f, 3.231f, 4f, 4.75f, 4f)
            horizontalLineToRelative(10.5f)
            curveTo(16.769f, 4f, 18f, 5.231f, 18f, 6.75f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
            horizontalLineTo(4.75f)
            curveTo(3.231f, 16f, 2f, 14.769f, 2f, 13.25f)
            verticalLineToRelative(-6.5f)
            close()
            moveTo(6f, 5f)
            horizontalLineTo(5f)
            verticalLineToRelative(10f)
            horizontalLineToRelative(1f)
            verticalLineTo(5f)
            close()
            moveToRelative(3f, 0f)
            horizontalLineTo(8f)
            verticalLineToRelative(10f)
            horizontalLineToRelative(1f)
            verticalLineTo(5f)
            close()
            moveToRelative(3f, 0f)
            verticalLineToRelative(10f)
            horizontalLineToRelative(1f)
            verticalLineTo(5f)
            horizontalLineToRelative(-1f)
            close()
        }
    }.build()
}
