package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Box32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Box32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.615f, 2.55f)
            curveToRelative(-1.04f, -0.4f, -2.19f, -0.4f, -3.23f, 0f)
            lineTo(11.3f, 3.736f)
            lineToRelative(13f, 5f)
            lineToRelative(4.485f, -1.725f)
            curveToRelative(-0.257f, -0.207f, -0.549f, -0.376f, -0.868f, -0.499f)
            lineTo(17.615f, 2.55f)
            close()
            moveToRelative(3.9f, 7.258f)
            lineToRelative(-13.001f, -5f)
            lineToRelative(-4.43f, 1.704f)
            curveToRelative(-0.32f, 0.123f, -0.612f, 0.292f, -0.87f, 0.5f)
            lineTo(16f, 11.928f)
            lineToRelative(5.514f, -2.121f)
            close()
            moveTo(2f, 9.545f)
            curveToRelative(0f, -0.28f, 0.036f, -0.555f, 0.104f, -0.818f)
            lineTo(15f, 13.687f)
            verticalLineToRelative(15.95f)
            curveToRelative(-0.208f, -0.047f, -0.414f, -0.11f, -0.615f, -0.187f)
            lineTo(4.083f, 25.488f)
            curveTo(2.828f, 25.005f, 2f, 23.8f, 2f, 22.455f)
            verticalLineTo(9.545f)
            close()
            moveTo(17.615f, 29.45f)
            curveToRelative(-0.201f, 0.078f, -0.407f, 0.14f, -0.615f, 0.188f)
            verticalLineTo(13.687f)
            lineToRelative(12.895f, -4.96f)
            curveTo(29.964f, 8.99f, 30f, 9.265f, 30f, 9.545f)
            verticalLineToRelative(12.91f)
            curveToRelative(0f, 1.345f, -0.828f, 2.55f, -2.083f, 3.033f)
            lineTo(17.615f, 29.45f)
            close()
        }
    }.build()
}
