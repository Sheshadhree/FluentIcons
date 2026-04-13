package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.StarHalf12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.StarHalf12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 9.428f)
            lineToRelative(-2.223f, 1.169f)
            curveToRelative(-0.587f, 0.308f, -1.272f, -0.19f, -1.16f, -0.844f)
            lineTo(3.04f, 7.277f)
            lineTo(1.243f, 5.524f)
            curveTo(0.767f, 5.06f, 1.03f, 4.254f, 1.685f, 4.159f)
            lineTo(4.172f, 3.8f)
            lineToRelative(1.112f, -2.253f)
            curveTo(5.43f, 1.249f, 5.715f, 1.1f, 6f, 1.1f)
            curveToRelative(0.286f, 0f, 0.571f, 0.148f, 0.718f, 0.446f)
            lineTo(7.83f, 3.798f)
            lineToRelative(2.486f, 0.361f)
            curveToRelative(0.656f, 0.096f, 0.918f, 0.902f, 0.443f, 1.365f)
            lineTo(8.96f, 7.277f)
            lineToRelative(0.425f, 2.476f)
            curveToRelative(0.112f, 0.654f, -0.574f, 1.152f, -1.16f, 0.844f)
            lineTo(6f, 9.428f)
            close()
            moveToRelative(0f, -7.075f)
            verticalLineToRelative(6.049f)
            curveToRelative(0.128f, 0f, 0.256f, 0.03f, 0.373f, 0.092f)
            lineToRelative(1.958f, 1.029f)
            lineToRelative(-0.374f, -2.18f)
            curveToRelative(-0.045f, -0.26f, 0.042f, -0.525f, 0.23f, -0.708f)
            lineTo(9.771f, 5.09f)
            lineTo(7.582f, 4.773f)
            curveTo(7.322f, 4.735f, 7.096f, 4.57f, 6.98f, 4.335f)
            lineTo(6f, 2.352f)
            verticalLineToRelative(0.001f)
            close()
        }
    }.build()
}
