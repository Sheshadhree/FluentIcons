package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.VideoMultiple32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.VideoMultiple32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 6f)
            curveToRelative(-2.485f, 0f, -4.5f, 2.015f, -4.5f, 4.5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 2.485f, 2.015f, 4.5f, 4.5f, 4.5f)
            horizontalLineToRelative(7.5f)
            curveToRelative(2.485f, 0f, 4.5f, -2.015f, 4.5f, -4.5f)
            verticalLineToRelative(-8f)
            curveTo(22f, 8.015f, 19.985f, 6f, 17.5f, 6f)
            horizontalLineTo(10f)
            close()
            moveToRelative(-5.995f, 4.254f)
            curveTo(4.002f, 10.336f, 4f, 10.418f, 4f, 10.5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 0.505f, 0.062f, 0.995f, 0.18f, 1.463f)
            curveTo(4.833f, 22.57f, 7.19f, 24.5f, 10f, 24.5f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.082f, 0f, 0.164f, -0.002f, 0.245f, -0.005f)
            curveTo(16.94f, 25.704f, 15.563f, 26.5f, 14f, 26.5f)
            horizontalLineToRelative(-4f)
            curveToRelative(-4.418f, 0f, -8f, -3.582f, -8f, -8f)
            verticalLineTo(14f)
            curveToRelative(0f, -1.562f, 0.796f, -2.939f, 2.005f, -3.746f)
            close()
            moveToRelative(25.993f, -0.75f)
            curveToRelative(0f, -1.996f, -2.225f, -3.187f, -3.886f, -2.08f)
            lineTo(23.5f, 9.164f)
            verticalLineToRelative(10.674f)
            lineToRelative(2.612f, 1.74f)
            curveToRelative(1.661f, 1.108f, 3.886f, -0.083f, 3.886f, -2.08f)
            verticalLineTo(9.504f)
            close()
        }
    }.build()
}
