package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MegaphoneOff16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MegaphoneOff16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.294f, 14.001f)
            lineToRelative(0.852f, 0.853f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-13f, -13f)
            curveToRelative(-0.196f, -0.195f, -0.512f, -0.195f, -0.708f, 0f)
            curveToRelative(-0.195f, 0.196f, -0.195f, 0.512f, 0f, 0.708f)
            lineToRelative(3.169f, 3.168f)
            lineTo(2.02f, 5.797f)
            curveTo(1.41f, 6.003f, 1f, 6.574f, 1f, 7.217f)
            verticalLineToRelative(1.566f)
            curveToRelative(0f, 0.643f, 0.41f, 1.214f, 1.018f, 1.42f)
            lineTo(4f, 10.877f)
            verticalLineTo(12f)
            curveToRelative(0f, 1.657f, 1.343f, 3f, 3f, 3f)
            curveToRelative(1.355f, 0f, 2.5f, -0.898f, 2.873f, -2.132f)
            lineToRelative(3.145f, 1.067f)
            curveToRelative(0.092f, 0.031f, 0.184f, 0.053f, 0.276f, 0.066f)
            close()
            moveTo(5f, 11.215f)
            lineToRelative(3.924f, 1.332f)
            curveTo(8.687f, 13.384f, 7.915f, 14f, 7f, 14f)
            curveToRelative(-1.105f, 0f, -2f, -0.896f, -2f, -2f)
            verticalLineToRelative(-0.785f)
            close()
            moveToRelative(10f, 1.3f)
            curveToRelative(0f, 0.113f, -0.012f, 0.223f, -0.036f, 0.328f)
            lineTo(6.43f, 4.308f)
            lineToRelative(6.591f, -2.226f)
            curveTo(13.992f, 1.754f, 15f, 2.477f, 15f, 3.503f)
            verticalLineToRelative(9.012f)
            close()
        }
    }.build()
}
