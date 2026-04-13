package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Reward20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Reward20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.526f, 3f)
            curveToRelative(0.829f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineToRelative(1.394f)
            curveToRelative(0f, 0.94f, -0.526f, 1.8f, -1.362f, 2.227f)
            lineToRelative(-4.19f, 2.14f)
            curveToRelative(1.226f, 0.556f, 2.078f, 1.79f, 2.078f, 3.223f)
            curveToRelative(0f, 1.954f, -1.584f, 3.539f, -3.539f, 3.539f)
            curveToRelative(-1.954f, 0f, -3.538f, -1.585f, -3.538f, -3.539f)
            curveToRelative(0f, -1.433f, 0.852f, -2.667f, 2.077f, -3.224f)
            lineTo(4.363f, 8.12f)
            curveToRelative(-0.78f, -0.398f, -1.29f, -1.174f, -1.356f, -2.039f)
            lineTo(3.001f, 5.894f)
            verticalLineTo(4.5f)
            curveTo(3f, 3.672f, 3.671f, 3f, 4.5f, 3f)
            horizontalLineToRelative(11.025f)
            close()
            moveToRelative(-5.513f, 7.945f)
            curveToRelative(-1.402f, 0f, -2.538f, 1.137f, -2.538f, 2.539f)
            curveToRelative(0f, 1.402f, 1.136f, 2.539f, 2.538f, 2.539f)
            reflectiveCurveToRelative(2.539f, -1.137f, 2.539f, -2.539f)
            curveToRelative(0f, -1.402f, -1.137f, -2.539f, -2.539f, -2.539f)
            close()
            moveTo(12.616f, 4f)
            horizontalLineToRelative(-5.21f)
            verticalLineToRelative(4.553f)
            lineToRelative(2.38f, 1.216f)
            curveToRelative(0.143f, 0.073f, 0.312f, 0.073f, 0.455f, 0f)
            lineToRelative(2.375f, -1.214f)
            verticalLineTo(3.999f)
            close()
        }
    }.build()
}
