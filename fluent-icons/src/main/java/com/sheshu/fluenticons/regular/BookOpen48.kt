package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.BookOpen48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BookOpen48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20f, 8f)
            curveToRelative(1.602f, 0f, 3.037f, 0.718f, 4f, 1.85f)
            curveTo(24.963f, 8.718f, 26.398f, 8f, 28f, 8f)
            horizontalLineToRelative(13.25f)
            curveTo(42.769f, 8f, 44f, 9.231f, 44f, 10.75f)
            verticalLineToRelative(26.5f)
            curveToRelative(0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
            horizontalLineTo(28f)
            curveToRelative(-1.602f, 0f, -3.037f, -0.718f, -4f, -1.85f)
            curveToRelative(-0.963f, 1.132f, -2.398f, 1.85f, -4f, 1.85f)
            horizontalLineTo(6.75f)
            curveTo(5.231f, 40f, 4f, 38.769f, 4f, 37.25f)
            verticalLineToRelative(-26.5f)
            curveTo(4f, 9.231f, 5.231f, 8f, 6.75f, 8f)
            horizontalLineTo(20f)
            close()
            moveToRelative(2.75f, 26.75f)
            verticalLineToRelative(-21.5f)
            curveToRelative(0f, -1.519f, -1.231f, -2.75f, -2.75f, -2.75f)
            horizontalLineTo(6.75f)
            curveToRelative(-0.138f, 0f, -0.25f, 0.112f, -0.25f, 0.25f)
            verticalLineToRelative(26.5f)
            curveToRelative(0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
            horizontalLineTo(20f)
            curveToRelative(1.519f, 0f, 2.75f, -1.231f, 2.75f, -2.75f)
            close()
            moveToRelative(2.5f, -21.5f)
            verticalLineToRelative(21.5f)
            curveToRelative(0f, 1.519f, 1.231f, 2.75f, 2.75f, 2.75f)
            horizontalLineToRelative(13.25f)
            curveToRelative(0.138f, 0f, 0.25f, -0.112f, 0.25f, -0.25f)
            verticalLineToRelative(-26.5f)
            curveToRelative(0f, -0.138f, -0.112f, -0.25f, -0.25f, -0.25f)
            horizontalLineTo(28f)
            curveToRelative(-1.519f, 0f, -2.75f, 1.231f, -2.75f, 2.75f)
            close()
        }
    }.build()
}
