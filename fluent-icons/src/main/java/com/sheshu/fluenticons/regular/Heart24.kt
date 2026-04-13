package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Heart24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Heart24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.82f, 5.58f)
            lineTo(12f, 6.401f)
            lineToRelative(-0.824f, -0.824f)
            curveToRelative(-2.1f, -2.099f, -5.502f, -2.099f, -7.601f, 0f)
            curveToRelative(-2.1f, 2.1f, -2.1f, 5.503f, 0f, 7.602f)
            lineToRelative(7.895f, 7.895f)
            curveToRelative(0.293f, 0.293f, 0.768f, 0.293f, 1.06f, 0f)
            lineToRelative(7.902f, -7.897f)
            curveToRelative(2.094f, -2.106f, 2.098f, -5.5f, -0.001f, -7.599f)
            curveToRelative(-2.103f, -2.103f, -5.508f, -2.103f, -7.611f, 0f)
            close()
            moveToRelative(6.548f, 6.54f)
            lineTo(12f, 19.485f)
            lineTo(4.635f, 12.12f)
            curveToRelative(-1.513f, -1.513f, -1.513f, -3.967f, 0f, -5.48f)
            curveToRelative(1.514f, -1.513f, 3.967f, -1.513f, 5.48f, 0f)
            lineToRelative(1.358f, 1.357f)
            curveToRelative(0.298f, 0.298f, 0.782f, 0.293f, 1.073f, -0.012f)
            lineTo(13.88f, 6.64f)
            curveToRelative(1.517f, -1.517f, 3.972f, -1.517f, 5.489f, 0f)
            curveToRelative(1.514f, 1.513f, 1.511f, 3.96f, -0.002f, 5.48f)
            close()
        }
    }.build()
}
