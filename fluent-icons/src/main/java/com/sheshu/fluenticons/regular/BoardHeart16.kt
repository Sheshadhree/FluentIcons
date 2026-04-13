package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.BoardHeart16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BoardHeart16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 4.5f)
            curveTo(2f, 3.12f, 3.12f, 2f, 4.5f, 2f)
            horizontalLineToRelative(7f)
            curveTo(12.88f, 2f, 14f, 3.12f, 14f, 4.5f)
            verticalLineToRelative(1.862f)
            curveToRelative(-0.319f, -0.156f, -0.656f, -0.262f, -1f, -0.317f)
            verticalLineTo(4.5f)
            curveTo(13f, 3.672f, 12.328f, 3f, 11.5f, 3f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(3f)
            curveToRelative(-0.338f, 0.007f, -0.675f, 0.06f, -1f, 0.163f)
            verticalLineTo(6f)
            horizontalLineTo(3f)
            verticalLineToRelative(5.5f)
            curveTo(3f, 12.328f, 3.672f, 13f, 4.5f, 13f)
            horizontalLineToRelative(2.42f)
            lineToRelative(0.992f, 1f)
            horizontalLineTo(4.5f)
            curveTo(3.12f, 14f, 2f, 12.88f, 2f, 11.5f)
            verticalLineToRelative(-7f)
            close()
            moveTo(4.5f, 3f)
            curveTo(3.672f, 3f, 3f, 3.672f, 3f, 4.5f)
            verticalLineTo(5f)
            horizontalLineToRelative(4.5f)
            verticalLineTo(3f)
            horizontalLineToRelative(-3f)
            close()
            moveTo(13f, 7.063f)
            curveToRelative(0.356f, 0.08f, 0.698f, 0.238f, 1f, 0.473f)
            curveToRelative(0.086f, 0.067f, 0.17f, 0.14f, 0.249f, 0.22f)
            curveToRelative(1.001f, 1.01f, 1.001f, 2.646f, 0f, 3.654f)
            lineToRelative(-3.431f, 3.457f)
            curveToRelative(-0.176f, 0.177f, -0.46f, 0.177f, -0.636f, 0f)
            lineTo(6.75f, 11.41f)
            curveToRelative(-1.001f, -1.008f, -1.001f, -2.644f, 0f, -3.653f)
            curveToRelative(0.223f, -0.225f, 0.478f, -0.4f, 0.749f, -0.525f)
            curveToRelative(0.317f, -0.146f, 0.658f, -0.223f, 1f, -0.231f)
            curveToRelative(0.678f, -0.017f, 1.36f, 0.235f, 1.877f, 0.756f)
            lineTo(10.5f, 7.88f)
            lineToRelative(0.123f, -0.123f)
            curveTo(11.268f, 7.107f, 12.17f, 6.876f, 13f, 7.063f)
            close()
        }
    }.build()
}
