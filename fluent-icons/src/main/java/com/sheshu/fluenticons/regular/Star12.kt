package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Star12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Star12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.284f, 1.546f)
            curveToRelative(0.293f, -0.595f, 1.14f, -0.595f, 1.434f, 0f)
            lineTo(7.83f, 3.798f)
            lineToRelative(2.486f, 0.361f)
            curveToRelative(0.656f, 0.096f, 0.918f, 0.902f, 0.443f, 1.365f)
            lineTo(8.96f, 7.277f)
            lineToRelative(0.425f, 2.476f)
            curveToRelative(0.112f, 0.654f, -0.574f, 1.152f, -1.16f, 0.844f)
            lineTo(6f, 9.427f)
            lineToRelative(-2.224f, 1.17f)
            curveToRelative(-0.587f, 0.308f, -1.272f, -0.19f, -1.16f, -0.844f)
            lineTo(3.04f, 7.277f)
            lineTo(1.243f, 5.524f)
            curveTo(0.767f, 5.06f, 1.03f, 4.254f, 1.685f, 4.159f)
            lineTo(4.172f, 3.8f)
            lineToRelative(1.112f, -2.253f)
            close()
            moveTo(6f, 2.352f)
            lineTo(5.02f, 4.335f)
            curveToRelative(-0.116f, 0.236f, -0.34f, 0.4f, -0.601f, 0.438f)
            lineTo(2.23f, 5.09f)
            lineToRelative(1.585f, 1.544f)
            curveToRelative(0.188f, 0.183f, 0.274f, 0.448f, 0.23f, 0.708f)
            lineTo(3.67f, 9.523f)
            lineToRelative(1.958f, -1.03f)
            curveToRelative(0.233f, -0.122f, 0.511f, -0.122f, 0.744f, 0f)
            lineToRelative(1.958f, 1.03f)
            lineToRelative(-0.374f, -2.18f)
            curveToRelative(-0.045f, -0.26f, 0.042f, -0.525f, 0.23f, -0.708f)
            lineTo(9.771f, 5.09f)
            lineTo(7.582f, 4.773f)
            curveTo(7.322f, 4.735f, 7.096f, 4.57f, 6.98f, 4.335f)
            lineTo(6f, 2.352f)
            close()
        }
    }.build()
}
