package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Megaphone16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Megaphone16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 3.503f)
            curveToRelative(0f, -1.026f, -1.008f, -1.75f, -1.98f, -1.421f)
            lineToRelative(-11f, 3.715f)
            curveTo(1.41f, 6.003f, 1f, 6.574f, 1f, 7.217f)
            verticalLineToRelative(1.566f)
            curveToRelative(0f, 0.643f, 0.41f, 1.214f, 1.018f, 1.42f)
            lineTo(4f, 10.877f)
            verticalLineTo(12f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            curveToRelative(1.355f, 0f, 2.5f, -0.898f, 2.873f, -2.132f)
            lineToRelative(3.145f, 1.067f)
            curveToRelative(0.973f, 0.33f, 1.982f, -0.393f, 1.982f, -1.42f)
            verticalLineTo(3.503f)
            close()
            moveTo(13.34f, 3.03f)
            curveTo(13.664f, 2.92f, 14f, 3.161f, 14f, 3.503f)
            verticalLineToRelative(9.012f)
            curveToRelative(0f, 0.342f, -0.336f, 0.583f, -0.66f, 0.473f)
            lineToRelative(-11f, -3.731f)
            curveTo(2.135f, 9.187f, 2f, 8.997f, 2f, 8.783f)
            verticalLineTo(7.218f)
            curveToRelative(0f, -0.215f, 0.137f, -0.405f, 0.34f, -0.474f)
            lineToRelative(11f, -3.715f)
            close()
            moveToRelative(-4.416f, 9.517f)
            curveTo(8.687f, 13.386f, 7.915f, 14f, 7f, 14f)
            curveToRelative(-1.105f, 0f, -2f, -0.896f, -2f, -2f)
            verticalLineToRelative(-0.785f)
            lineToRelative(3.924f, 1.332f)
            close()
        }
    }.build()
}
