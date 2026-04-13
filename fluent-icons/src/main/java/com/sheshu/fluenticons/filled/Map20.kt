package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Map20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Map20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 6.04f)
            lineToRelative(-4f, -2.8f)
            verticalLineToRelative(10.72f)
            lineToRelative(4f, 2.8f)
            verticalLineTo(6.04f)
            close()
            moveToRelative(1f, 10.72f)
            lineToRelative(4.787f, -3.35f)
            curveTo(17.92f, 13.316f, 18f, 13.163f, 18f, 13f)
            verticalLineTo(3.5f)
            curveToRelative(0f, -0.186f, -0.104f, -0.357f, -0.27f, -0.443f)
            curveToRelative(-0.165f, -0.087f, -0.364f, -0.074f, -0.517f, 0.033f)
            lineTo(13f, 6.04f)
            verticalLineToRelative(10.72f)
            close()
            moveTo(2.213f, 6.59f)
            lineTo(7f, 3.24f)
            verticalLineToRelative(10.72f)
            lineToRelative(-4.213f, 2.95f)
            curveToRelative(-0.153f, 0.107f, -0.353f, 0.12f, -0.518f, 0.034f)
            curveTo(2.104f, 16.857f, 2f, 16.686f, 2f, 16.5f)
            verticalLineTo(7f)
            curveToRelative(0f, -0.163f, 0.08f, -0.316f, 0.213f, -0.41f)
            close()
        }
    }.build()
}
