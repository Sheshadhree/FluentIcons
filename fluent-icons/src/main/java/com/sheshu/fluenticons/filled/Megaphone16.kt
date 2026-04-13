package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Megaphone16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Megaphone16",
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
            moveTo(5f, 11.215f)
            lineToRelative(3.924f, 1.332f)
            curveTo(8.687f, 13.384f, 7.915f, 14f, 7f, 14f)
            curveToRelative(-1.105f, 0f, -2f, -0.896f, -2f, -2f)
            verticalLineToRelative(-0.785f)
            close()
        }
    }.build()
}
