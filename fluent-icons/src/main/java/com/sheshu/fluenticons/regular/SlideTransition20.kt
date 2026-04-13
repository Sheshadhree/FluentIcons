package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SlideTransition20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SlideTransition20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.75f, 4f)
            curveTo(3.231f, 4f, 2f, 5.231f, 2f, 6.75f)
            verticalLineToRelative(6.5f)
            curveTo(2f, 14.769f, 3.231f, 16f, 4.75f, 16f)
            horizontalLineToRelative(10.5f)
            curveToRelative(1.519f, 0f, 2.75f, -1.231f, 2.75f, -2.75f)
            verticalLineToRelative(-6.5f)
            curveTo(18f, 5.231f, 16.769f, 4f, 15.25f, 4f)
            horizontalLineTo(4.75f)
            close()
            moveTo(12f, 5f)
            verticalLineToRelative(10f)
            horizontalLineTo(9f)
            verticalLineTo(5f)
            horizontalLineToRelative(3f)
            close()
            moveToRelative(1f, 10f)
            verticalLineTo(5f)
            horizontalLineToRelative(2.25f)
            curveTo(16.216f, 5f, 17f, 5.784f, 17f, 6.75f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineTo(13f)
            close()
            moveToRelative(-5f, 0f)
            horizontalLineTo(6f)
            verticalLineTo(5f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(10f)
            close()
            moveTo(5f, 5f)
            verticalLineToRelative(10f)
            horizontalLineTo(4.75f)
            curveTo(3.784f, 15f, 3f, 14.216f, 3f, 13.25f)
            verticalLineToRelative(-6.5f)
            curveTo(3f, 5.784f, 3.784f, 5f, 4.75f, 5f)
            horizontalLineTo(5f)
            close()
        }
    }.build()
}
