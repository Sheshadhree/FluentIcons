package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Map20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Map20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.73f, 3.057f)
            curveTo(17.897f, 3.143f, 18f, 3.314f, 18f, 3.5f)
            verticalLineTo(13f)
            curveToRelative(0f, 0.163f, -0.08f, 0.316f, -0.213f, 0.41f)
            lineToRelative(-5f, 3.5f)
            curveToRelative(-0.172f, 0.12f, -0.402f, 0.12f, -0.574f, 0f)
            lineTo(7.5f, 13.61f)
            lineToRelative(-4.713f, 3.3f)
            curveToRelative(-0.153f, 0.107f, -0.353f, 0.12f, -0.518f, 0.034f)
            curveTo(2.104f, 16.857f, 2f, 16.686f, 2f, 16.5f)
            verticalLineTo(7f)
            curveToRelative(0f, -0.163f, 0.08f, -0.316f, 0.213f, -0.41f)
            lineToRelative(5f, -3.5f)
            curveToRelative(0.172f, -0.12f, 0.402f, -0.12f, 0.574f, 0f)
            lineToRelative(4.713f, 3.3f)
            lineToRelative(4.713f, -3.3f)
            curveToRelative(0.153f, -0.107f, 0.352f, -0.12f, 0.518f, -0.033f)
            close()
            moveTo(12f, 7.26f)
            lineToRelative(-4f, -2.8f)
            verticalLineToRelative(8.28f)
            lineToRelative(4f, 2.8f)
            verticalLineTo(7.26f)
            close()
            moveToRelative(1f, 8.28f)
            lineToRelative(4f, -2.8f)
            verticalLineTo(4.46f)
            lineToRelative(-4f, 2.8f)
            verticalLineToRelative(8.28f)
            close()
            moveToRelative(-6f, -2.8f)
            verticalLineTo(4.46f)
            lineToRelative(-4f, 2.8f)
            verticalLineToRelative(8.28f)
            lineToRelative(4f, -2.8f)
            close()
        }
    }.build()
}
