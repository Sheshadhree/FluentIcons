package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Trophy32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Trophy32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11f, 2f)
            curveTo(9.343f, 2f, 8f, 3.343f, 8f, 5f)
            horizontalLineTo(6.5f)
            curveTo(5.12f, 5f, 4f, 6.12f, 4f, 7.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 2.402f, 1.881f, 4.364f, 4.25f, 4.493f)
            curveToRelative(0.806f, 3.14f, 3.47f, 5.536f, 6.75f, 5.945f)
            verticalLineTo(24f)
            horizontalLineToRelative(-3.5f)
            curveTo(9.567f, 24f, 8f, 25.567f, 8f, 27.5f)
            verticalLineToRelative(1f)
            curveTo(8f, 29.328f, 8.672f, 30f, 9.5f, 30f)
            horizontalLineToRelative(13f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.933f, -1.567f, -3.5f, -3.5f, -3.5f)
            horizontalLineTo(17f)
            verticalLineToRelative(-2.062f)
            curveToRelative(3.28f, -0.409f, 5.944f, -2.804f, 6.75f, -5.945f)
            curveTo(26.119f, 15.863f, 28f, 13.902f, 28f, 11.5f)
            verticalLineToRelative(-4f)
            curveTo(28f, 6.12f, 26.88f, 5f, 25.5f, 5f)
            horizontalLineTo(24f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            horizontalLineTo(11f)
            close()
            moveToRelative(13f, 11.95f)
            verticalLineTo(7f)
            horizontalLineToRelative(1.5f)
            curveTo(25.776f, 7f, 26f, 7.224f, 26f, 7.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.21f, -0.859f, 2.218f, -2f, 2.45f)
            close()
            moveTo(8f, 7f)
            verticalLineToRelative(6.95f)
            curveToRelative(-1.141f, -0.232f, -2f, -1.24f, -2f, -2.45f)
            verticalLineToRelative(-4f)
            curveTo(6f, 7.224f, 6.224f, 7f, 6.5f, 7f)
            horizontalLineTo(8f)
            close()
        }
    }.build()
}
