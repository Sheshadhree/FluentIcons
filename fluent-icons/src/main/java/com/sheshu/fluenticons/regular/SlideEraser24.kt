package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.SlideEraser24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.SlideEraser24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 6.75f)
            curveTo(2f, 5.231f, 3.231f, 4f, 4.75f, 4f)
            horizontalLineToRelative(14.5f)
            curveTo(20.769f, 4f, 22f, 5.231f, 22f, 6.75f)
            verticalLineToRelative(5.786f)
            lineToRelative(-0.8f, -0.801f)
            curveToRelative(-0.21f, -0.21f, -0.447f, -0.374f, -0.7f, -0.493f)
            verticalLineTo(6.75f)
            curveToRelative(0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
            horizontalLineTo(4.75f)
            curveTo(4.06f, 5.5f, 3.5f, 6.06f, 3.5f, 6.75f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            horizontalLineToRelative(7.265f)
            curveToRelative(0.017f, 0.534f, 0.204f, 1.063f, 0.561f, 1.5f)
            horizontalLineTo(4.75f)
            curveTo(3.231f, 20f, 2f, 18.769f, 2f, 17.25f)
            verticalLineTo(6.75f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.492f, 12.442f)
            curveToRelative(-0.586f, -0.586f, -1.536f, -0.586f, -2.121f, 0f)
            lineToRelative(-3.111f, 3.11f)
            lineToRelative(4.207f, 4.207f)
            lineToRelative(3.11f, -3.11f)
            curveToRelative(0.586f, -0.586f, 0.586f, -1.536f, 0f, -2.122f)
            lineToRelative(-2.085f, -2.085f)
            close()
            moveToRelative(-7.039f, 4.918f)
            lineToRelative(1.1f, -1.1f)
            lineToRelative(4.207f, 4.207f)
            lineToRelative(-1.1f, 1.1f)
            curveToRelative(-0.586f, 0.585f, -1.535f, 0.585f, -2.121f, 0f)
            lineToRelative(-2.086f, -2.086f)
            curveToRelative(-0.586f, -0.586f, -0.586f, -1.536f, 0f, -2.122f)
            close()
        }
    }.build()
}
