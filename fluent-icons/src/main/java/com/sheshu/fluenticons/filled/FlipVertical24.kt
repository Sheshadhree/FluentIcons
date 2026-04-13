package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FlipVertical24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FlipVertical24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.547f, 2.163f)
            curveTo(19.83f, 2.348f, 20f, 2.663f, 20f, 3f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            horizontalLineTo(3f)
            curveToRelative(-0.473f, 0f, -0.882f, -0.332f, -0.979f, -0.795f)
            curveTo(1.924f, 9.74f, 2.166f, 9.274f, 2.6f, 9.084f)
            lineToRelative(16f, -7f)
            curveToRelative(0.31f, -0.135f, 0.666f, -0.106f, 0.948f, 0.08f)
            close()
            moveTo(7.781f, 9f)
            horizontalLineTo(18f)
            verticalLineTo(4.529f)
            lineTo(7.78f, 9f)
            close()
            moveTo(20f, 21.5f)
            curveToRelative(0f, 0.171f, -0.087f, 0.33f, -0.232f, 0.422f)
            curveToRelative(-0.145f, 0.092f, -0.326f, 0.103f, -0.48f, 0.03f)
            lineToRelative(-17f, -8f)
            curveToRelative(-0.213f, -0.1f, -0.327f, -0.333f, -0.276f, -0.561f)
            curveTo(2.063f, 13.162f, 2.266f, 13f, 2.5f, 13f)
            horizontalLineToRelative(17f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            verticalLineToRelative(8f)
            close()
        }
    }.build()
}
