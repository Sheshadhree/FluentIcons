package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DataPie20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DataPie20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.999f, 9.136f)
            curveTo(17.989f, 9.634f, 17.559f, 10f, 17.062f, 10f)
            horizontalLineTo(11f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(2.938f)
            curveToRelative(0f, -0.498f, 0.366f, -0.927f, 0.864f, -0.937f)
            lineTo(11f, 2f)
            curveToRelative(3.866f, 0f, 7f, 3.134f, 7f, 7f)
            lineToRelative(-0.001f, 0.136f)
            close()
            moveTo(11f, 3f)
            verticalLineToRelative(6f)
            horizontalLineToRelative(6f)
            curveToRelative(0f, -3.314f, -2.686f, -6f, -6f, -6f)
            close()
            moveTo(9f, 4.519f)
            curveToRelative(0f, -0.14f, -0.058f, -0.272f, -0.16f, -0.367f)
            curveTo(8.738f, 4.058f, 8.6f, 4.01f, 8.462f, 4.02f)
            curveTo(4.847f, 4.295f, 2f, 7.315f, 2f, 11f)
            curveToRelative(0f, 3.866f, 3.134f, 7f, 7f, 7f)
            curveToRelative(3.685f, 0f, 6.705f, -2.847f, 6.98f, -6.462f)
            curveToRelative(0.01f, -0.139f, -0.038f, -0.276f, -0.132f, -0.378f)
            curveTo(15.753f, 11.058f, 15.62f, 11f, 15.48f, 11f)
            horizontalLineTo(10.5f)
            curveTo(9.672f, 11f, 9f, 10.328f, 9f, 9.5f)
            verticalLineTo(4.519f)
            close()
            moveTo(3f, 11f)
            curveToRelative(0f, -2.973f, 2.162f, -5.441f, 5f, -5.917f)
            verticalLineTo(9.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(4.417f)
            curveToRelative(-0.476f, 2.838f, -2.944f, 5f, -5.917f, 5f)
            curveToRelative(-3.314f, 0f, -6f, -2.686f, -6f, -6f)
            close()
        }
    }.build()
}
