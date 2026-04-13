package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BoardHeart16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BoardHeart16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 2f)
            verticalLineToRelative(3f)
            horizontalLineTo(2f)
            verticalLineTo(4.5f)
            curveTo(2f, 3.12f, 3.12f, 2f, 4.5f, 2f)
            horizontalLineToRelative(3f)
            close()
            moveToRelative(1f, 0f)
            verticalLineToRelative(4f)
            curveToRelative(0.696f, -0.012f, 1.394f, 0.18f, 2f, 0.574f)
            curveToRelative(1.054f, -0.687f, 2.389f, -0.757f, 3.5f, -0.212f)
            verticalLineTo(4.5f)
            curveTo(14f, 3.12f, 12.88f, 2f, 11.5f, 2f)
            horizontalLineToRelative(-3f)
            close()
            moveToRelative(-1f, 4f)
            verticalLineToRelative(0.163f)
            curveTo(6.966f, 6.33f, 6.464f, 6.627f, 6.041f, 7.053f)
            curveToRelative(-1.388f, 1.398f, -1.388f, 3.663f, 0f, 5.062f)
            lineToRelative(1.459f, 1.47f)
            verticalLineTo(14f)
            horizontalLineToRelative(-3f)
            curveTo(3.12f, 14f, 2f, 12.88f, 2f, 11.5f)
            verticalLineTo(6f)
            horizontalLineToRelative(5.5f)
            close()
            moveToRelative(-0.749f, 5.41f)
            lineToRelative(3.43f, 3.457f)
            curveToRelative(0.177f, 0.177f, 0.461f, 0.177f, 0.637f, 0f)
            lineToRelative(3.431f, -3.457f)
            curveToRelative(1.001f, -1.008f, 1.001f, -2.644f, 0f, -3.653f)
            curveToRelative(-0.08f, -0.08f, -0.163f, -0.154f, -0.249f, -0.221f)
            curveToRelative(-0.979f, -0.76f, -2.378f, -0.712f, -3.302f, 0.148f)
            lineToRelative(-0.075f, 0.073f)
            lineTo(10.5f, 7.88f)
            lineToRelative(-0.123f, -0.123f)
            lineToRelative(-0.075f, -0.073f)
            curveTo(9.795f, 7.212f, 9.145f, 6.984f, 8.5f, 7f)
            curveToRelative(-0.342f, 0.008f, -0.683f, 0.085f, -1f, 0.231f)
            curveToRelative(-0.271f, 0.125f, -0.526f, 0.3f, -0.749f, 0.525f)
            curveToRelative(-1.001f, 1.009f, -1.001f, 2.645f, 0f, 3.653f)
            close()
        }
    }.build()
}
