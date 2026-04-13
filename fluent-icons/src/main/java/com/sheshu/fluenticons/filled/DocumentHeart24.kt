package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DocumentHeart24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DocumentHeart24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 2f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.105f, 0.896f, 2f, 2f, 2f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 1.105f, -0.895f, 2f, -2f, 2f)
            horizontalLineTo(9.49f)
            lineToRelative(3.17f, -3.17f)
            curveToRelative(1.745f, -1.745f, 1.745f, -4.573f, 0f, -6.318f)
            curveToRelative(-1.535f, -1.535f, -3.909f, -1.719f, -5.645f, -0.552f)
            curveTo(6.113f, 11.354f, 5.039f, 11.112f, 4f, 11.235f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, 0.896f, -2f, 2f, -2f)
            horizontalLineToRelative(6f)
            close()
            moveToRelative(1.5f, 0.5f)
            verticalLineTo(8f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(5.5f)
            lineToRelative(-6f, -6f)
            close()
            moveTo(7.015f, 22.75f)
            curveToRelative(-0.192f, 0f, -0.384f, -0.073f, -0.53f, -0.22f)
            lineToRelative(-4.41f, -4.408f)
            curveToRelative(-1.353f, -1.354f, -1.353f, -3.549f, 0f, -4.903f)
            curveToRelative(1.355f, -1.353f, 3.55f, -1.353f, 4.904f, 0f)
            lineToRelative(0.036f, 0.036f)
            lineToRelative(0.036f, -0.036f)
            curveToRelative(1.353f, -1.353f, 3.548f, -1.353f, 4.902f, 0f)
            curveToRelative(1.354f, 1.354f, 1.354f, 3.55f, 0f, 4.903f)
            lineTo(7.545f, 22.53f)
            curveToRelative(-0.146f, 0.147f, -0.338f, 0.22f, -0.53f, 0.22f)
            close()
        }
    }.build()
}
